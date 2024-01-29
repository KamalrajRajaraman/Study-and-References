package colpack;

import java.util.Set;
import java.util.TreeSet;

public class UtilDemo9 {
	public static void main(String[] args) {
		Set<Student> ts=new TreeSet<Student>();
		
	
		ts.add(new Student("india",50));
		ts.add(new Student("zain",40));
		ts.add(new Student("zain",50));
		ts.add(new Student("india",20));
		
		System.out.println(ts);
	}
}
class Student implements Comparable<Student>{
	int marks;
	String name;
	public Student(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
	@Override
	public int compareTo(Student o) {
		int nameComparison = o.name.compareTo(this.name); // Sort names in descending order
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return Integer.compare(this.marks, o.marks); // Sort marks in ascending order
        }
	}
	@Override
	public String toString() {
		return this.name+":"+this.marks;
	}
}



