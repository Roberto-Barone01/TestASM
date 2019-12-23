package writeUnInterfaceAndChangeTheVersion;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;

public class VersionAdapter extends ClassVisitor{

	public VersionAdapter(int api, ClassVisitor classVisitor) {
		super(api, classVisitor);
	}
	
	@Override
	public void visit(final int version, final int access, final String name, final String signature,
			final String superName, final String[] interfaces) {
		
		this.cv.visit(Opcodes.V1_3, access, name, signature, superName, interfaces);

	}

}
