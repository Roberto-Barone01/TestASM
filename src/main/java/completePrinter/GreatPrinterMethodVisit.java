package completePrinter;

import java.util.ArrayList;
import java.util.HashMap;

import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class GreatPrinterMethodVisit extends MethodVisitor {

	private String appeller;
	GreatPrinterMethodVisit(String appeller) {
		super(Opcodes.ASM7);
		this.appeller = appeller;
	}
	
	public void visitFrame(final int type, final int numLocal, final Object[] local, final int numStack,
			final Object[] stack) {
		
		System.out.println("----------------VISIT FRAME-------------------------- ");
		for(int i=0;i<stack.length;i++)
			System.out.println(stack[i]);
		System.out.println("----------------END VISIT FRAME-------------------------- ");
	}
	
	public void visitParameter(final String name, final int access) {
		System.out.println("----------------START: visitParameter-----------------");
		if (name != null)
			System.out.println("name is " + name);
		System.out.println("access is " + access);
		System.out.println("----------------END: visitParameter-----------------");
	}

	public void visitFieldInsn(final int opcode, final String owner, final String name, final String descriptor) {
		System.out.println("----------------START: visitFieldInsn-----------------");
		System.out.println("opcode is " + opcode);
		System.out.println("owner is " + owner);
		System.out.println("name is " + name);
		System.out.println("descriptor is " +  descriptor);
		System.out.println("----------------END: visitFieldInsn-----------------");
	}
	

	public void visitMethodInsn(final int opcode, final String owner, final String name, final String descriptor,
			final boolean isInterface) {
		System.out.println("----------------START: visitMethodInsn-----------------");
		System.out.println("Appeller is " + appeller);
		System.out.println("opcode is " + opcode);
		System.out.println("owner is " + owner);
		System.out.println("name is " + name);
		System.out.println("descriptor is " +  descriptor);
		System.out.println("isInterface is " + isInterface);
		System.out.println("----------------END: visitMethodInsn-----------------");
	}
	

	
	public void visitLocalVariable(final String name, final String descriptor, final String signature,
			final Label start, final Label end, final int index) {
		//if(name.equals("this") == true) return;
		System.out.println("----------------START: visitLocalVariable-----------------]}}}}}}}}}}}}}}}}}}}}}}}");
		System.out.println("name is " + name);
		System.out.println("descriptor is " + descriptor);
		System.out.println("signature is " + signature);
		System.out.println("index is " + index);
		System.out.println("----------------END: visitLocalVariable-----------------");
	}
	

	ArrayList<Integer> lines = new ArrayList<>();
	public void visitLineNumber(final int line, final Label start) {
		lines.add(line);
	}
	
	public void visitInvokeDynamicInsn(final String name, final String descriptor, final Handle bootstrapMethodHandle,
			final Object... bootstrapMethodArguments) {
		
		System.out.println("------------------INVOKE DINAMIC-------------------");
		System.out.println("name is " + name);
		System.out.println("descriptor is" + descriptor);
		for(int i=0;i<bootstrapMethodArguments.length;i++)
			System.out.println(bootstrapMethodArguments[i]);
		System.out.println("handle is:");
		System.out.println(bootstrapMethodHandle.getTag());
		System.out.println("------------------END: INVOKE DINAMIC-------------------");
	}
	 

	
	@Override
	public void visitEnd() {
		System.out.println(lines);
		System.out.println("-----------------------END VISIT METHOD-------------------------------");
	}

}
