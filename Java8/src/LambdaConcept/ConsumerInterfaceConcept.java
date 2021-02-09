package LambdaConcept;

import java.util.function.Consumer;

public class ConsumerInterfaceConcept {

	public static void main(String[] args) {
	
		// Represents an operation that accepts a single input argument and 
		// return no result
		
		Consumer<String> func = x -> System.out.println(x);
		func.accept("This is dell ");
		
		

	}

}
