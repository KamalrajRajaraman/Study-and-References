package Week1;

import java.util.Scanner;

public class Exercise1_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double mark_avg;
		int result;
		int i;
		int s;
		System.out.println("Enter number Of Subject");
		s = input.nextInt();
	
		int[] arr = new int[s];
		for (i = 0; i < arr.length; i++) {
			System.out.println("Enter the next Subject mark");
			arr[i] = input.nextInt();
		}
		int max = arr[0];
		double sum = arr[0];
		for (i = 1; i < arr.length; i++) {
			sum = sum + arr[i];
			if (arr[i] > max)
				max = arr[i];
		}

		result = max;
		mark_avg = sum / (arr.length);
		System.out.println("Highest mark = "+result);
		System.out.println("Average Mark = "+mark_avg);
	}
}