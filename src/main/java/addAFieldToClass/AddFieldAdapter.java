package addAFieldToClass;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class AddFieldAdapter extends ClassVisitor {

	//On ajoute public final static int UN__FIELD__ = 5;
	
	private String nameField = "UN__FIELD__";
	private int access = Opcodes.ACC_FINAL + Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC;
	private String desc = Type.INT_TYPE.getDescriptor();
	private int value = 5;
	boolean isPresent = false;

	AddFieldAdapter(ClassVisitor cv) {
		super(Opcodes.ASM7, cv);
	}

	@Override
	public FieldVisitor visitField(final int access, final String name, final String descriptor, final String signature,
			final Object value) {
		if(name.equals(this.nameField))	isPresent = true;
		return cv.visitField(access, name, descriptor, signature, value);
	}
	
	@Override
	public void visitEnd() {
		if(!isPresent) {
			FieldVisitor fieldVis = cv.visitField(this.access, this.nameField, this.desc, null, this.value);
			if(fieldVis != null) fieldVis.visitEnd();
		}
		cv.visitEnd();
	}
}
