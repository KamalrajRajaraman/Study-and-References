package BasicOpenLabBook;

import java.util.Scanner;

public class AreaOfTriangle {
	public static double areaOfTriangle(double base,double height) {
		return (base*height)/2;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	
		char ch =scn.findWithinHorizon(".", 0).charAt(0);
		System.out.println(ch);
		System.out.println("Enter the base of Triangle ");
		double base = scn.nextInt();
		System.out.println("Enter the height of Triangle");
		double height = scn.nextDouble();
		double area = areaOfTriangle(base, height);
		System.out.println("Area of Triangle = "+area);	
		scn.close();
	}
}

