package SetSemo;
import java.util.Set;
import java.util.TreeSet;
public class UtilDemo10 {
	public static void main(String[] args) {
//		first: {
//			if( o.name.compareTo(this.name)!=0)
//				o.name.compareTo(this.name);
//			return this.marks>o.marks?1:-1;
//		}
		Set<Student1> ts=new TreeSet<Student1>();
		
	
		ts.add(new Student1("india",50));
		ts.add(new Student1("zain",40));
		ts.add(new Student1("zain",50));
		ts.add(new Student1("india",20));
		
		System.out.println(ts);
	}
}
class Student1 {
	int marks;
	String name;
	public Student1(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
	
	@Override
	public String toString() {
		return this.name+":"+this.marks;
	}
}