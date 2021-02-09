package LambdaConcept;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {

	public static void main(String[] args) {
	
		// Represents an operation upon two operands of the same type, producing
		// a result of the same type as the operands. this is a specialization
		//of BiFunction for case where the operands 
		// and the result are all of the same type
		
		//public interface BinaryOperator<T> extends BiFunction<T,T,T>
		
		BinaryOperator<Integer> func = (x1,x2) -> x1+x2;
		
		int t = func.apply(10, 20);
		System.out.println(t);
		
		//BiFunction interface:
		BiFunction<Integer,Integer,Integer> func1 = (x1, x2) -> x1 + x2 ;
		
		System.out.println(func1.apply(30, 40));

	}

}
