package EmployeeManagementSystem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Create {
	Scanner scn = new Scanner(System.in);
	LinkedHashMap<Integer,HashMap> l1 = new LinkedHashMap<>();
	LinkedHashMap  a1 = new LinkedHashMap();
	public void create() {
		System.out.print("Enter id : ");
		int id = scn.nextInt();
		System.out.print("Enter name : ");
		String name = scn.next();
		System.out.print("Enter age : ");
		int age = scn.nextInt();
		System.out.print("Enter the designation : " );
		String designation = scn.next();
		System.out.print("Enter the salary : " );
		double salary = scn.nextInt();
		
		a1.put("id", id);
		a1.put("name",name);
		a1.put("age",age);
		a1.put("designation",designation);
		a1.put("Salary",salary);
		l1.put(id,a1);
		System.out.println("Succesfully Created");
		
	}
	public void display() {
		System.out.println(l1);
	}
	public void searchId(int id) {
		System.out.println(l1.get(id));
	}
	public  void callId() {
		System.out.println("Enter the id to get employee detail");
		id = scn.nextInt();
	}
	public  void update(){
		System.out.println("Enter\n1.name Change\n2.age change \n3.designation change \n4.salary change");
		int value = scn.nextInt();
		switch(value) {
			case 1 :
				callId();
				System.out.println("Name to be replced");
				String name = scn.next();
				updateName(id, name);
				break;
			case 2 :
				callId();
				System.out.println("age to be replced");
				int age = scn.nextInt();
				c1.updateAge(id, age);
				break;
			case 3 :
				callId();
				System.out.println("Designation to be replced");
				String designation = scn.next();
				c1.updateDesignation(id, designation);
				break;
			case 4 :
				callId();
				System.out.println("salary to be replced");
				int salary = scn.nextInt();
				c1.updateSalary(id, salary);
				break;
		}
		public void updateName(int id,String name) {
			HashMap h2 = l1.get(id);
			h2.replace("name", name);	
		}
		public void updateAge(int id,int age) {
			HashMap h2 = l1.get(id);
			h2.replace("age", age);	
		}
		public void updateDesignation(int id,String designation) {
			HashMap h2 = l1.get(id);
			h2.replace("designation",designation);	
		}
		public void updateSalary(int id,int salary) {
			HashMap h2 = l1.get(id);
			h2.replace("Salary",salary);	
		}
	
	
}
