package StreamConcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {

	public static void main(String[] args) {
		
		List<Customer> customerList = Arrays.asList(
				
				new Customer("steve",22),
				new Customer("Mendis",24),
				new Customer("kane",30),
				new Customer("Ben",22)
				);
		
		//maping
		
		String name = customerList.stream()
				.filter(x -> "steve".equals(x.getName()))
				.map(Customer::getName)
				.findAny()
				.orElse(null);
		
		
		// print all names in list
		
		
		List<String> names = customerList.stream().map(Customer::getName).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}

}
