package StreamConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamConcept {

	public static void main(String[] args) {
		
		ForkJoinPool corePools = ForkJoinPool.commonPool();
		
		System.out.println(corePools.getParallelism());
		
		//1. parallel() mathod on stream:
		
		Stream stream = Stream.of("Naveen","Tom","Selvin","Peter","Raj","Simon");
		//BaseStream parallelStream = stream.parallel();
		
		Stream.of("Naveen","Tom","Selvin","Peter","Raj","Simon").forEach(System.out::println);
		
		System.out.println("-----------------------------------------------------------------");
		
		Stream.of("Naveen","Tom","Selvin","Peter","Raj","Simon").parallel().forEach(System.out::println);
		
		System.out.println("-----------------------------------------------------------------");

		//2. use parallelStream() method on collection stream
		
		Arrays.asList("Naveen","Tom","Selvin","Peter","Raj","Simon").parallelStream().forEach(System.out::println);
		
		//1 to 10:
		
		System.out.println("Normal stream");
		
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		
		System.out.println("Parallel stream");
		
		IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);
		
		//to print from a - z --> 97 - 122 
		
		//System.out.println(getAlpha());
		
		System.out.println("----------normal----------");
		
		getAlpha().stream().forEach(s -> System.out.println(s));
		
		System.out.println("----------Parallel----------");
		
		getAlpha().parallelStream()
		.forEach(s -> System.out.println(s));
		
		IntStream range = IntStream.range(1, 10);
		
		System.out.println(range.isParallel());

	}
	
	
	public static List<String> getAlpha(){
		
		List<String> alpha = new ArrayList<String>();
		
		int n = 97 ;
		
		while(n <= 122) {
			
			char c = (char) n ;
			
			alpha.add(String.valueOf(c));
			
			n++;
			
		}
		
		return alpha;
		
	}
	

}
