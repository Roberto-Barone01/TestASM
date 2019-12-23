package addAFieldToClass;

import java.io.IOException;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

public class Main {
	
	
	public static void main(String args[]) {
		
		try {
			ClassWriter writer = new ClassWriter(0);
			ClassReader cr = new ClassReader("java/lang/Object");
			AddFieldAdapter adder = new AddFieldAdapter(writer);
			cr.accept(adder, 0);
			writer.visitEnd();
			byte[] myClass = writer.toByteArray();
			
			
			VisitAllField showField = new VisitAllField();
			cr = new ClassReader(myClass);
			cr.accept(showField, 0);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
