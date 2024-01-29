package Week1;

import java.util.Scanner;

public class Exercise1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of even number");
		int n = sc.nextInt();
		int sum = 0;
		int result = 1;
		int i = 0;
		while (result <= n) {
			if (i % 2 == 0) {
				if (i % 3 == 0) {
					sum = sum + i;

				}
				result = result + 1;
			}
			i = i + 1;
		}
		System.out.println("Sum of range of even number divisible by 3 : "+sum);
	}
}