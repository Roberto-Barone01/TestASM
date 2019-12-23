package addAFieldToClass;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Opcodes;

public class VisitAllField extends ClassVisitor {

	static int counter = 0;
	
	VisitAllField() {
		super(Opcodes.ASM7);
	}

	
	@Override
	public FieldVisitor visitField(final int access, final String name, final String descriptor, final String signature,
			final Object value) {
		
		System.out.println("field "+ (++counter)+":"+ name);
		
		if (cv != null) {
			return cv.visitField(access, name, descriptor, signature, value);
		}
		return null;
	}

}
