package MyPrototypePattern;

public class MainOfStudent {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student();
		Student s1 =  s.clone();
		s.a=10;
		s1.a=20;
		s.e.name="kamal";
		s1.e.name="ganesh";
		System.out.println(s.e.name);
		System.out.println(s1.e.name);
		
		
		}
}
