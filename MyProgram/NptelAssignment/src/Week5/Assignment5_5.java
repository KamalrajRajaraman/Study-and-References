package Week5;
import java.util.Scanner; 
import static java.lang.System.*;
interface GCD {
	public int findGCD(int n1, int n2);
}

class B implements GCD {
	int n1, n2;

	// Create a method to calculate GCD
	public int findGCD(int n1, int n2) {
		if (n1 == 0 && n2 == 0) {
			return -1;
		} else if (n2 == 0) {
			return n1;
		}

		else {
			return findGCD(n2, n1 % n2);
		}
	}
}
public class Assignment5_5 {
	public static void main(String[] args) {
		B a = new B(); // Create an object of class B
		// Read two numbers from the keyboard
		Scanner sc = new Scanner(in);
		int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		out.print(a.findGCD(p1, p2));
	}

}
