package LambdaConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UneryOperatorInterfaceConvcept {

	public static void main(String[] args) {
		
		//Represents an operation on a single operand that produces a result of
		// the same type as its operand. this is a specialization of Function
		// for the case
		// where the operand and result are of the same type.
		
		//@FunctionalInterface public interface UnaryOperator<T> extends Function<T, T>
		
		UnaryOperator<Integer> func = x -> x * 7 ;
		
		int n1 = func.apply(10);
		System.out.println(n1);
		
		Function<Integer, Integer> func1 = x -> x * 10 ;
		System.out.println(func1.apply(40));
		
		List<String> lang = new ArrayList<>();
		
		lang.add("java");
		lang.add("pthon");
		lang.add("ruby");
		
		lang.replaceAll(e-> e + " lang");
		
		System.out.println(lang);
		
		
	}

}
