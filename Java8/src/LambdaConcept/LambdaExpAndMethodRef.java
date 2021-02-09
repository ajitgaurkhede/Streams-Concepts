package LambdaConcept;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpAndMethodRef {

	public static void main(String[] args) {
		
		List<String> namesList = Arrays.asList("Tom","Peter","Naveen","Simon");
		
		//1. With Anonymous class:
		
		System.out.println("------With Anonymous class:--------");
		namesList.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) { // Anonymous class
				
				System.out.println(t);
			}
			
			
		});
		
		//2. Lambda Exp: ->
		System.out.println("--------Lambda Exp: -------------");
		namesList.forEach(str -> System.out.println(str));
		
		//3. Method References:
		System.out.println("------Method References:--------------");
		namesList.forEach(System.out::println);
		
		
		

	}

}
