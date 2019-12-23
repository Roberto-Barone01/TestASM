package writeUnInterfaceAndChangeTheVersion;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Opcodes.*;

public class Main {

	public static void main(String args[]) {
		
		
		ClassWriter cw = new ClassWriter(0);
		
		//Header della classe
		cw.visit(Opcodes.V1_5, Opcodes.ACC_PUBLIC + Opcodes.ACC_ABSTRACT + Opcodes.ACC_INTERFACE,
				"pkg/stupidInterface", null, "java/lang/Object",
				new String[] {"pkg/Mesurable"} );
		
		//I specify the type Int
		
		//Attributo LESS
		cw.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC, "LESS", "I",
				null, -1).visitEnd();
		//Attributo EQUAL
		cw.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC, "EQUAL", "I",
				null, 0).visitEnd();
		//Attributo GREATER
		cw.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC, "GREATER", "I",
						null, 1).visitEnd();
		
		cw.visitMethod(Opcodes.ACC_ABSTRACT + Opcodes.ACC_PUBLIC, "compareTo", "(Ljava/lang/Object;)I", null, null).visitEnd();
		
		cw.visitEnd();
		byte[] b1 = cw.toByteArray();
		for(int i=0;i<b1.length;i++)
			System.out.print(b1[i] + " ");
		
		//Modifier the version of the precedent class
		
		ClassWriter writer = new ClassWriter(0);
		VersionAdapter adapter = new VersionAdapter(Opcodes.ASM7, writer);
		ClassReader reader = new ClassReader(b1);
		reader.accept(adapter, 0);
		writer.visitEnd();
		
		Object ab;
		
		System.out.println("-------------start b2--------------------");
		byte[] b2 = writer.toByteArray();
		for(int i=0;i<b2.length;i++)
			System.out.print(b2[i] + " ");
		
	}

}
