package Week1;

import java.util.Scanner;

public class Exercise1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find it is Amstrong or Not");
		int n = sc.nextInt();
		int result = 0;
		int temp = n;
		int c = 0, t;
//Use while loop to check the number is Armstrong or not. 
		while (n > 0) {
			t = n % 10;
			n = n / 10;
			c = c + (t * t * t);
		}
		if (temp == c)
			result = 1;
		else
			result = 0;
		// Evaluation code
		System.out.println((1==result)?"is Amstrong Number":"is NOt AmstrongNumber");
	}
}