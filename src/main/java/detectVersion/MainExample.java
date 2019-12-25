package detectVersion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public class MainExample {

	public static void main(String[] args) {
		
		
		String path = "C:\\Users\\pc\\Documents\\eclipse-workspace\\ASMTest\\src\\main\\resources\\Heap.class";
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(path);
			System.out.println(Detector.getVersion(inputStream));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
