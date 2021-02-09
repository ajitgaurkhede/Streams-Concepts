package StreamConcept;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterFindAnyorElse {
	
	
	public static void main(String[] args) {
	
		List<Customer> customerList = Arrays.asList(
				
				new Customer("steve",22),
				new Customer("Mendis",24),
				new Customer("kane",30),
				new Customer("Ben",22)
				);
		
		
	Customer c1 = customerList.stream() // convert list to stream
			.filter(x -> "Ben".equals(x.getName())) // filter it for peter only
			.findAny().orElse(null);//if it finds then return
	
	System.out.println("Name = "+c1.getName()+" Age = "+c1.getAge());
	
	System.out.println("-----------------");
	
	Customer c2 = customerList.stream().filter(x -> "Ajit".equals(x.getName())).findAny().orElse(null);
	
	System.out.println(c2);
	
	// 3. filter with multiple conditions:
	
	Customer c3 =customerList.stream().filter(x -> "kane".equals(x.getName()) && x.getAge() == 30).findAny().orElse(null);
	System.out.println("Name = "+c3.getName()+" Age = "+c3.getAge());

				
		

	}

}
