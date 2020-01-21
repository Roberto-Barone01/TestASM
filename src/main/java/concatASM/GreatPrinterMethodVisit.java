package concatASM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.MethodNode;

public class GreatPrinterMethodVisit extends MethodVisitor {
	private String appeller;
	private List<String> strings = new ArrayList<>();
	private List<String> instructions = new ArrayList<>();

	GreatPrinterMethodVisit(String appeller) {
		super(Opcodes.ASM7);
		this.appeller = appeller;
	}
	public void visitMethodInsn(final int opcode, final String owner, final String name, final String descriptor,
			final boolean isInterface) {
		if (!owner.equals("java/lang/StringBuilder"))
			return;
		System.out.println("---------------------------------START VISIT METHOD INSN-----------------------");
		System.out.println("owner is " + owner);
		System.out.println("name is " + name);
		System.out.println("descriptor is " + descriptor);
		System.out.println("Line is " + line);
		System.out.println("---------------------------END VISIT METHOD INSN-----------------------------");
		instructions.add(descriptor + " " + name + " " + opcode + " "  + owner);
	}
	public void visitLdcInsn(final Object value) {
		strings.add((String) value);
		if (!mapLine.containsKey(line)) {
			var tmp = new ArrayList<String>();
			tmp.add((String) value);
			mapLine.put(line, tmp);
		} else
			mapLine.get(line).add((String) value);
	}
	
	int line;
	SortedMap<Integer, ArrayList<String>> mapLine = new TreeMap<>();

	public void visitLineNumber(final int line, final Label start) {
		this.line = line;
	}
	
	
	public void visitEnd() {
		if (this.instructions != null)
			this.instructions.forEach(System.out::println);
		System.out.println(mapLine);
	}
	
	
	public void visitVarInsn(final int opcode, final int var) {
		System.out.println("--------------visitVarInsn------------------------");
		System.out.println(opcode);
		System.out.println("--------------END visitVarInsn------------------------");
	}
}