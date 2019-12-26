package completePrinter;

import java.util.HashMap;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class GreatPrinterMethodVisit extends MethodVisitor {

	private String appeller;
	private HashMap<Integer, String> map = new HashMap<>();
	GreatPrinterMethodVisit(String appeller) {
		super(Opcodes.ASM7);
		this.appeller = appeller;
	}
	
	
	public void visitParameter(final String name, final int access) {
//		System.out.println("----------------START: visitParameter-----------------");
//		if (name != null)
//			System.out.println("name is " + name);
//		System.out.println("access is " + access);
//		System.out.println("----------------END: visitParameter-----------------");
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

		
//		System.out.println("----------------START: visitMethodInsn-----------------");
//		System.out.println("Appeller is " + appeller);
//		System.out.println("opcode is " + opcode);
//		System.out.println("owner is " + owner);
//		System.out.println("name is " + name);
//		System.out.println("descriptor is " +  descriptor);
//		System.out.println("isInterface is " + isInterface);
//
//		System.out.println("----------------END: visitMethodInsn-----------------");
	}
	
	
	
	public void visitLocalVariable(final String name, final String descriptor, final String signature,
			final Label start, final Label end, final int index) {
		
		System.out.println("----------------START: visitLocalVariable-----------------]}}}}}}}}}}}}}}}}}}}}}}}");
		System.out.println("name is " + name);
		System.out.println("descriptor is " + descriptor);
		System.out.println("signature is " + signature);
		System.out.println("index is " + index);
		System.out.println("----------------END: visitLocalVariable-----------------");

	}
	public void visitLineNumber(final int line, final Label start) {
		
		}
	 

	
	@Override
	public void visitEnd() {
	}

}
