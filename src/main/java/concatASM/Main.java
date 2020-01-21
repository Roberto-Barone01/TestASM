package concatASM;

import java.io.IOException;
import java.util.ArrayList;

import org.objectweb.asm.ClassReader;

public class Main {

	public static void main(String[] args) throws IOException {
		GreatPrinter printer = new GreatPrinter();
		ClassReader reader = new ClassReader("concatASM/TestLambda");
		reader.accept(printer, 0);
	}

}
