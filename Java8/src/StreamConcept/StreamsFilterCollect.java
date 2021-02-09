package StreamConcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterCollect {

	public static void main(String[] args) {
	
		List<String> productList = Arrays.asList("MacBook","iPhone","Shoes","Battery Charger","Bat");
		
	//	productList.forEach(x -> System.out.println(x));
		
		List<String> result = productList.stream().filter(x -> ! x.equals("Shoes"))
		.collect(Collectors.toList());
		
		result.forEach(System.out :: println);
		
		System.out.println("------------------------");
		
		
	List<String> result1 =	productList.stream().filter(x -> ! x.equals("iPhone")).collect(Collectors.toList());
	
	result1.forEach(x -> System.out.println(x));

	}

}
