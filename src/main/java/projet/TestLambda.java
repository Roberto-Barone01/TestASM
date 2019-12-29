package projet;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;

class TestLambda {
	private static void testMethodRef() {
	    IntBinaryOperator op = Integer::sum;
	    System.out.println(op.applyAsInt(2, 40));
	  }
	private static void testLambda() {
	    IntBinaryOperator op = (a, b) -> a + b;
	    System.out.println(op.applyAsInt(2, 40));
	  }
}