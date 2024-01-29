package EmployeeManagementSystem;

public class Employee {
	protected int id;
	private String name;
	private int age;
	private String designation;
	private double salary;
	public Employee(int id,String name,int age,String designation,double salary) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.designation=designation;
		this.salary=salary;
	}
	
}
