package EmployeeManagementSystem;

import java.util.HashMap;

import java.util.Scanner;

public class MainOfEmpolyee {
	static Scanner scn = new Scanner(System.in);
	static int choice;
	static void prompt() {
		System.out.println("Enter\n1.Create\n2.diplay\n4.update\n5.Exit");
		choice = scn.nextInt();
	}
	public static void main(String[] args) {
		Create c1 = new Create();
		prompt();
		while(choice!=0) {
			switch(choice) {
			case 1:
				c1.create();
				prompt();
			    break;
			case 2:
				c1.display();
				prompt();
				break;
			case 3:
				System.out.println("Enter the id to get employee detail");
				int id = scn.nextInt();
				c1.searchId(id);
				prompt();
				break;
			       
			case 4:
				UpdatePrompt.update();
				prompt();
				break;
			
			case 5:
				choice=0;
				System.out.println("Succesfully exited");
				break;
			}
		}
	}
	
}
