package Unit;

import java.util.List;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MainOfPerson2 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Kamal","raj",23),
				new Person("Chandru","kavan",23),
				new Person("Aniruth","chinna",23),
				new Person("Ravi","charan",23),
				new Person("Gowtham","ram",23)
				);
		
		//1.sort by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
			
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		System.out.println("------------------------------------");
		//2.create a method that prints all the method
		
		printAll(people);
		System.out.println("------------------------------------");
		
		//3.create a method that print people last name starts with c
		
		printPersonLastNameStartsWithC(people, new Predicate<Person>() {

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getLastName().startsWith("c");
			}
			
			
			
		});
		
	}
	
	public static void printAll(List<Person> t) {
		for(Person p:t) {
			System.out.println(p);
		}
		
	}
	
	public static void printPersonLastNameStartsWithC(List<Person> l,Predicate<Person> c) {
		for(Person p:l) {
			if(c.test(p)) {
				System.out.println(p);
			}
		}
		
	}
}
