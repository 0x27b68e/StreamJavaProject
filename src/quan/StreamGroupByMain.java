package quan;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamGroupByMain {
	
	
	public static void main(String[] args) {
		List<Student> asList = Arrays.asList(
				new Student("Nguyen Viet Quan", "Viet Nam"),
				new Student("Jack", "US"),
				new Student("Lu Thanh Tra", "Viet Nam"),
				new Student("Jack", "Viet Nam"));
		
		 Map<String, List<Student>> collect = asList.stream().collect(Collectors.groupingBy(Student::getName));
		 
		 
		 Set<Entry<String, List<Student>>> entrySet = collect.entrySet();
		 entrySet.stream().forEach(
				 name -> System.out.println( "Name :" + name.getKey() + name.getValue() + ", Amout of name: " + name.getValue().size())
				 );
		 
		 //use allMatch
		 boolean allMatch = asList.stream().allMatch(predicate -> predicate.getCountry().contains("US"));
		 System.out.println(allMatch);
		 
		 //use anyMatch
		 boolean anyMatch = asList.stream().anyMatch(predicate -> predicate.getCountry().contains("US"));
		 System.out.println(anyMatch);
		 
		 //
		 
		 List<Student> asList2 = Arrays.asList(
					new Student("Nguyen Viet Quan", "Viet Nam"),
					new Student("Jack", "US"),
					new Student("Lu Thanh Tra", "Viet Nam"),
					new Student("Jack", "US"));
			
		 // use findAny
		 boolean present = asList2.stream().findAny().isPresent();
		 System.out.println(present);
		 
	}

}
