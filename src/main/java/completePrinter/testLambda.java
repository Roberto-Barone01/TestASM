package completePrinter;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

class TestLambda {

	private final double PI = 3.14;
	
	private void testLambda1() {
		IntBinaryOperator op = (a, b) -> a + b;
		Runnable r = () -> System.out.println(this.PI);
		int vel = 3+4;
		System.out.println("ciao");
		System.out.println("ciao");
		System.out.println("ciao");System.out.println("ciao");
		Runnable r2 = () -> {};
		r.run();
		op.applyAsInt(1, 2);
	}
	
	private static void testLambda2() {
	    var value = 40;
	    IntUnaryOperator op = x -> x + value;
	    System.out.println(op.applyAsInt(2));
	  }

}