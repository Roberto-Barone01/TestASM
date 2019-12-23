package detectVersion;

import java.io.IOException;
import java.io.InputStream;


import org.objectweb.asm.ClassReader;

import detectVersion.ClassPrinterVersion;

public class Detector {
	
	public static String getVersion(InputStream input) throws IOException {
		ClassPrinterVersion printer = new ClassPrinterVersion();
		ClassReader reader = new ClassReader(input);
		reader.accept(printer, 0);
		return printer.getVersion();
	}
	
}
