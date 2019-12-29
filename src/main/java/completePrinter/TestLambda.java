package completePrinter;

import java.util.function.IntBinaryOperator;


class TestLambda {
	private static void testMethodRef() {
	    IntBinaryOperator op = Integer::sum;
	    System.out.println(op.applyAsInt(2, 40));
	  }
}