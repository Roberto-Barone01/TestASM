package completePrinter;

import java.io.IOException;

import org.objectweb.asm.ClassReader;

public class Main {
	public static void main(String[] args) throws IOException {
		GreatPrinter printer = new GreatPrinter();
		ClassReader reader = new ClassReader("completePrinter/testLambda");
		reader.accept(printer, 0);
	}
}
