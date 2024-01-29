package Unit;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MainOfPerson4 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Kamal","raj",23),
				new Person("Chandru","kavan",23),
				new Person("Aniruth","chinna",23),
				new Person("Ravi","charan",23),
				new Person("Gowtham","ram",23)
				);
		
		people.forEach(System.out::println);
	}
	
}
	
	
