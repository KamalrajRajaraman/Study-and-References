package Week4;

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*; 

public class Assignment4_1 {
	public static void main(String[] args) {
		// Scanner object is created
		Scanner scanner = new Scanner(System.in);
		// Read String input using scanner class
		String courseName = scanner.nextLine();
		// Print the scanned String
		out.println("Course: " + courseName);
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
	}
}
