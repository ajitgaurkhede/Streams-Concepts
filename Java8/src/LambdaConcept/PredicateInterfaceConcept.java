package LambdaConcept;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
 * @FunctionalInterface
Represents a predicate (boolean-valued function) of one argument

 */


public class PredicateInterfaceConcept {

	public static void main(String[] args) {
	
		Predicate<Integer> func = x -> x > 5 ;
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//List<Integer> colList = list.stream().filter(func).collect(Collectors.toList());
		
		//System.out.println(colList);
		
		//predicate with &&:
		
		List<Integer> colList = list.stream().filter(x-> x > 5 && x < 9).collect(Collectors.toList());
		
		System.out.println(colList);
		
		List<String> namesList = Arrays.asList("Ajit", "Aji", "Aj", "Java","Jav","Ja");
		
		Predicate<String> nameExp = x -> x.startsWith("Aji");
		
		List<String> newList = namesList.stream().filter(nameExp.negate()).collect(Collectors.toList());
		
		System.out.println(newList);

	}

}
