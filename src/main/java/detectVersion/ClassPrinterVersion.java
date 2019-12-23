package detectVersion;

import java.util.HashMap;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;

public class ClassPrinterVersion extends ClassVisitor {

	private final static HashMap<Integer, String> MAP_VERSION;
	static {
		MAP_VERSION = new HashMap<Integer, String>();
		MAP_VERSION.put(58, "Java SE 14");
		MAP_VERSION.put(57, "Java SE 12");
		MAP_VERSION.put(56, "Java SE 11");
		MAP_VERSION.put(55, "Java SE 10");
		MAP_VERSION.put(52, "Java SE 9");
		MAP_VERSION.put(53, "Java SE 8");
		MAP_VERSION.put(51, "Java SE 7");
		MAP_VERSION.put(50, "Java SE 6");
		MAP_VERSION.put(49, "Java SE 5");
		MAP_VERSION.put(48, "JDK 1.4 ");
		MAP_VERSION.put(47, "JDK 1.3");
		MAP_VERSION.put(46, "JDK 1.2");
		MAP_VERSION.put(45, "JDK 1.1");
	}

	private String version = null;
	public ClassPrinterVersion() {
		super(Opcodes.ASM7);
	}
	
	public String getVersion() {
		if(version == null) throw new IllegalStateException();
		return this.version;
	}
	
	public void visit(final int version, final int access, final String name, final String signature,
		final String superName, final String[] interfaces) {
//		String header = name +" HAS VERSION ";
//		String ris = MAP_VERSION.get(version);
//		System.out.println(header + ris);
		this.version = MAP_VERSION.get(version);
	}

}
