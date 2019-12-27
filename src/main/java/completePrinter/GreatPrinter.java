package completePrinter;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class GreatPrinter extends ClassVisitor {

	public GreatPrinter() {
		super(Opcodes.ASM7);
	}

//	public void visit(final int version, final int access, final String name, final String signature,
//			final String superName, final String[] interfaces) {
//
//		System.out.println("----------------START: visit-----------------");
//		System.out.println("version is " + version);
//		System.out.println("access is " + access);
//		System.out.println("name is " + name);
//		System.out.println("signature is " + signature);
//		System.out.println("supername is " + superName);
//		System.out.print("interface are: ");
//		if (interfaces != null) {
//			for (int i = 0; i < interfaces.length; i++)
//				System.out.print(interfaces[i] + " ");
//		}
//		System.out.println();
//		System.out.println("---------------------END: visit-------------------");
//	}
//
//	public void visitSource(final String source, final String debug) {
//		System.out.println("----------------START: visitSource-----------------");
//		if (source != null)
//			System.out.println("source is " + source);
//		if (debug != null)
//			System.out.println("debug is " + debug);
//		System.out.println("---------------------END: VisitSource-------------------");
//	}
//
//	public void visitNestHost(final String nestHost) {
//		System.out.println("----------------START: visitNestHost-----------------");
//		if (nestHost != null)
//			System.out.println("nestHost is " + nestHost);
//		System.out.println("---------------------END: visitNestHost-------------------");
//	}
//
	public void visitOuterClass(final String owner, final String name, final String descriptor) {
		System.out.println("----------------START: visitOuterClass-----------------");
		System.out.println("owner is " + owner);
		System.out.println("name is " + name);
		System.out.println("descriptor is " + descriptor);
		System.out.println("---------------------END: visitOuterClass-------------------");
	}
//
	public void visitInnerClass(final String name, final String outerName, final String innerName, final int access) {
		System.out.println("----------------START: visitInnerClass-----------------");
		System.out.println("name is " + name);
		System.out.println("outername is " + outerName);
		System.out.println("innerName is " + innerName);
		System.out.println("access is " + access);
		System.out.println("----------------END: visitInnerClass-----------------");
	}
//	
	public FieldVisitor visitField(final int access, final String name, final String descriptor, final String signature,
			final Object value) {
		System.out.println("----------------START: visitField-----------------");
		System.out.println("access is " + access);
		System.out.println("name is " + name);
		System.out.println("signature is " + signature);
		System.out.println("----------------END: visitField-----------------");
		return null;
	}
	
	public MethodVisitor visitMethod(final int access, final String name, final String descriptor,
		final String signature, final String[] exceptions) {
		if(name.equalsIgnoreCase("<init>")) return null;
		//if(name.length()< 7 || name.substring(0, 7).equals("lambda$") == false) return null;
		System.out.println("----------------START: visitMethod-----------------");
		System.out.println("access is " + access);
		System.out.println("name is " + name);
		System.out.println("descriptor is " + descriptor);
		if(signature != null) System.out.println("sinature is " + signature);
		System.out.println("----------------END: visitMethod-----------------");
		return new GreatPrinterMethodVisit(name);
	}

}
