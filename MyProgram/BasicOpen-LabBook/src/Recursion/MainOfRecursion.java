package Recursion;

import java.util.Scanner;

public class MainOfRecursion {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Recursion r1 = new Recursion();
		System.out.println("Enter\n1. Factorial Calculation"
				+ "\n2.Fibonacci Series"
				+ "\n3.Sum of Digits"
				+ "\n4.Palindrome Check"
				+ "\n5.Tower of Hanoi "
				+ "\n6.exit");
		int choice = scn.nextInt();
		switch(choice) {
			case 1:
				System.out.println("Enter a number to find fact");
				int x = scn.nextInt();
				System.out.println(r1.fact(x));
			    break;
			case 2:
				System.out.println("Enter n1,n2,range to find fib");
				int n1 = scn.nextInt();
				int n2 = scn.nextInt();
				int range= scn.nextInt();
				System.out.println(r1.fib(n1, n2, range));
				
			    break;
			case 3:
				
			    break;
			       
			case 4:
				
			    break;
			case 5:
				
			    break;
		    
	}
	}
}
