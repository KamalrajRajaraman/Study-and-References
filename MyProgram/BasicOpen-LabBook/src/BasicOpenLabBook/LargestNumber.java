package BasicOpenLabBook;

import java.util.Scanner;

public class LargestNumber {
	/**
	 * this is used to find largest
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return largest number 
	 */
	public static String largestNumber(double num1,double num2,double num3) {
		
		if(num1>=num2 && num1>=num3)
			return num1+" is largest";
		if(num2>=num1 && num2>=num3 )
			return num2 + " is largest";
		return num3 +" is largest";
	
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Largest NUmber among Three number");
		System.out.println("Enter the first Number");
		double num1=scn.nextDouble();
	
		System.out.println("Enter the Second Number");
		double num2=scn.nextDouble();
		
		System.out.println("Enter the Third  Number");
		double num3=scn.nextDouble();
		
		String result = largestNumber(num1,num2,num3);
		System.out.println(result);
		scn.close();
				
	}
}

