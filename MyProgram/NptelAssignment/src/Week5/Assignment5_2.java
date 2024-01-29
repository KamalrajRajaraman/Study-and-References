package Week5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment5_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		// create an array to save user input
		int[] name = new int[length];
		int sum = 0;// save the total sum of the array.
		try {
			for (int i = 0; i < length; i++) {
				int userInput = sc.nextInt();
				name[i] = userInput;
				sum = sum + name[i];
			}
			System.out.println(sum);
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("You entered bad data.");
		}
	}
}
