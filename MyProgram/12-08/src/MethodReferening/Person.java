package MethodReferening;

import java.time.LocalDate;

public class Person {

    // ...
    
    LocalDate birthday;
    
    public int getAge() {
		return 0;
        // ...
    }
    
    public LocalDate getBirthday() {
        return birthday;
    }   

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }
    
    // ...
    Person[] rosterAsArray = roster.toArray(new Person[roster.size()]);

    class PersonAgeComparator implements Comparator<Person> {
        public int compare(Person a, Person b) {
            return a.getBirthday().compareTo(b.getBirthday());
        }
    }
            
    Arrays.sort(rosterAsArray, new PersonAgeComparator());
}