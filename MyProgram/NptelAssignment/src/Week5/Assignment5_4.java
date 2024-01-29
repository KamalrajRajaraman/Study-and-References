package Week5;
import java.util.Scanner; 

public class Assignment5_4 {
	public static void main(String[] args) {
		A a = new A(); // Create an object of class A
		// Read a number from the keyboard
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.print(a.findSqr(i));
	}

}

interface Number {
	int findSqr(int i); // Returns the square of n
}

class A implements Number {
	// Define a method to find the square of a number
	int i, square;

	public int findSqr(int i) {
		square = i * i;
		return square;
	}
}
