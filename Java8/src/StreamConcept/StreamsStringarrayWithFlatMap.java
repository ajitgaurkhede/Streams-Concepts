package StreamConcept;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsStringarrayWithFlatMap {

	public static void main(String[] args) {
		
		String data[][] = new String[][] {
			
			{"a","b"},
			{"c","d"},
			{"e","f"}
			
		};
		
		Stream<String[]> dataStream = Arrays.stream(data);
		
		/*Stream<String> dataFilter= dataStream.flatMap(x-> Arrays.stream(x));
		
		Stream<String> dataStreamFilter = dataFilter.filter(x -> "a".equals(x.toString()));
		
		dataStreamFilter.forEach(System.out :: println);*/
		
		
		Stream<String> name = dataStream.flatMap(x -> Arrays.stream(x)).filter(x -> "c".equals(x.toString()));
		
		name.forEach(x -> System.out.println(x));
		
		
		
		
		

	}

}
