package quan;

import java.util.Arrays;
import java.util.List;

public class StreamMain {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("Nguyen Viet Quan", "Lu Thanh Tra", "AAAAAAAAAAAAA", "Lu Thanh Tra");
		
		
		asList.stream()
		.filter(k -> k.startsWith("Ng"))
		.forEach(System.out::println);
		
		
		asList.stream().filter(predicate -> predicate.contains("Thanh"))
		.forEach(System.out::println);
		
		

		System.out.println(asList.size());
		System.out.println(asList.stream().count());
		
		/*asList.stream()
		.distinct().filter(predicate -> predicate.contains("Thanh"))
		.forEach(System.out::println);*/
		
		asList.stream()
		.filter(predicate -> predicate.contains("Thanh"))
		.forEach(System.out::println);
		
	}

}
