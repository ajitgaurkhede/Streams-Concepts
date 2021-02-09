package LambdaConcept;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {

	public static void main(String[] args) {

		// takes no argument and return a result:
		
		getText(() -> "Java");

	}

	private static void getText(Supplier<String> text) {
		
		System.out.println(text.get());
		
	}

}
