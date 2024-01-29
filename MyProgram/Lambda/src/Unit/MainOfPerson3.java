package Unit;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MainOfPerson3 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Kamal","raj",23),
				new Person("Chandru","kavan",23),
				new Person("Aniruth","chinna",23),
				new Person("Ravi","charan",23),
				new Person("Gowtham","ram",23)
				);
		
		//1.sort by last name
		Collections.sort(people, (o1,o2)->o1.getLastName().compareTo(o2.getLastName()));
		System.out.println("------------------------------------");
		//2.create a method that prints all the method
		
		printPersonLastNameStartsWithC(people,p->true,p->System.out.println(p));
		System.out.println("------------------------------------");
		
		//3.create a method that print people last name starts with c
		
		printPersonLastNameStartsWithC(people, t->t.getLastName().startsWith("c"),/*p->System.out.println(p)*/System.out::println);
		
	}
	
	
	
	public static void printPersonLastNameStartsWithC(List<Person> l,Predicate<Person> c,Consumer<Person> consume) {
		for(Person p:l) {
			if(c.test(p)) {
				consume.accept(p);
			}
		}
		
	}
}
