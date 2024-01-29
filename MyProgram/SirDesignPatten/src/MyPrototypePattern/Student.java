package MyPrototypePattern;

public class Student implements Cloneable {
	Employee e = new Employee();
	int a;
	
	@Override
	protected Student clone() throws CloneNotSupportedException {
		Student s = (Student) super.clone();
		s.e =  s.e.clone();
		return s;
		
	}
	
	public Student() {
		System.out.println("Object created..");
	}
	
}
class Employee implements Cloneable{
	String name;
	
	@Override
	protected Employee clone() throws CloneNotSupportedException {	
		return (Employee) super.clone();
	}
}


