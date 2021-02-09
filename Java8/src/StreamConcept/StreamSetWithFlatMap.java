package StreamConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSetWithFlatMap {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setName("Ajit");
		
		emp1.addDevices("iPhone8");
		emp1.addDevices("Samsung9");
		emp1.addDevices("iPhoneX");
		emp1.addDevices("mackbook pro");
		
		Employee emp2 = new Employee();
		emp2.setName("Shizu");
		
		emp2.addDevices("lenovo windows10");
		emp2.addDevices("Samsung10");
		emp2.addDevices("iPhone9");
		emp2.addDevices("macbook air");
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(emp1);
		empList.add(emp2);
		
		/*List<String> devicesList = empList.stream()
				.map(x-> x.getDevices())
				.flatMap(x-> x.stream())
				.distinct()
				.collect(Collectors.toList());
		
		devicesList.forEach(x -> System.out.println(x));*/
		
		

			List<Employee> dev = empList.stream().filter(x -> "Shizu".equals(x.getName())).collect(Collectors.toList());
			
			//dev.forEach(System.out :: println);
			
			dev.forEach(x -> System.out.println(x));
			
			
			
			
			/*for(Employee emp : dev) {
				
				System.out.println("name"+emp.getName()+" devices "+emp.getDevices());
			}*/
			
			//empList.stream().map(x -> x.getName().equals("Ajit") && x.getDevices());

		
		
		
		
		
		

	}

}
