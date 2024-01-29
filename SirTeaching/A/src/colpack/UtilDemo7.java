package colpack;

import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;

public class UtilDemo7 {
	public static void main(String[] args) {
		List<Employee> mylist=new ArrayList<Employee>();
		
		mylist.add(new Employee("zain"));
		mylist.add(new Employee("anand"));
		mylist.add(new Employee("kamal"));
		mylist.add(new Employee("ben"));
		System.out.println(mylist);
		//Collections.sort(mylist,new MyCom());
		Collections.sort(mylist,(Employee o1,Employee o2)-> o2.name.compareTo(o1.name));
		System.out.println(mylist);
	}
}
class MyCom implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
	}
}
class Employee implements Comparable<Employee>{
	String name;
	public Employee(String name) {
		this.name=name;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return this.name;
	}
}
