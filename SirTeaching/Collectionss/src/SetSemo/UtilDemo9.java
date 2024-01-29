package SetSemo;
import java.util.Set;
import java.util.TreeSet;
public class UtilDemo9 {
	public static void main(String[] args) {
		Set<Student> ts=new TreeSet<Student>();
		
	
		ts.add(new Student("india",50));
		ts.add(new Student("zain",50));
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
		if( o.name.compareTo(this.name)!=0) {
			System.out.println(o.name.compareTo(this.name));
			return this.name.compareTo(o.name);}//o.name.compareTo(this.name);}
		//return this.marks>o.marks?1:-1;
		return Integer.compare(this.marks, o.marks);
	}
	@Override
	public String toString() {
		return this.name+":"+this.marks;
	}
}