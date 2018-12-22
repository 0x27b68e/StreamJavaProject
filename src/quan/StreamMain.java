package quan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("Nguyen Viet Quan", "Lu Thanh Tra", "AAAAAAAAAAAAA", "Lu Thanh Tra");
		
		//use filter 
		asList.stream()
		.filter(k -> k.startsWith("Ng"))
		.forEach(System.out::println);
		
		
		//use filter
		asList.stream().filter(predicate -> predicate.contains("Thanh"))
		.forEach(System.out::println);
		
		

		System.out.println(asList.size());
		System.out.println(asList.stream().count());
		
		System.out.println("-------------------");
		asList.stream()
		.filter(predicate -> predicate.contains("Thanh"))
		.forEach(System.out::println);
		
		System.out.println("------------------------");
		//use foreach
		asList.stream().forEach(
				l -> System.out.println("Name: " + l));
		
		
	}

}
