package detectVersion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.objectweb.asm.ClassReader;

public class testVersion {

	public void printVersion(String name) throws IOException {
		ClassPrinterVersion printer = new ClassPrinterVersion();
		ClassReader reader = new ClassReader(name);
		reader.accept(printer, 0);
	}

	public void printVersion(InputStream input) throws IOException {
		ClassPrinterVersion printer = new ClassPrinterVersion();
		ClassReader reader = new ClassReader(input);
		reader.accept(printer, 0);
	}

	public static void main(String[] args) {
		try {
			InputStream input = new FileInputStream(
					"/home/2inlp2/rbaron01/workspace-full/testASM/src/main/resources/testASM/DateInterfaceObservable.class");
			new testVersion().printVersion(input);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
