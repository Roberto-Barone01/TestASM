package completePrinter;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;

class TestLambda {
	
		private static void testLambda2() {
		    int cop = 10;
		    IntUnaryOperator op = x ->{
		    	return x + cop;
		    };
		    //System.out.println(op.applyAsInt(2));
		  }
	
}