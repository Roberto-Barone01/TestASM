package completePrinter;

public class SimpleClassWithLambda {

	public void doThings() {
		Runnable r = () -> System.out.println("ciao");
		Runnable r2 = () -> System.out.println("ciao");
		r.run();
	}
	
	class MethodHandles$Lookup{
		
	}
	
	public void MethodHandles$Lookup(){
		
	}
	
}
