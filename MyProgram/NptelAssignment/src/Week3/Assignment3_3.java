package Week3;
import java.util.Scanner;

public class Assignment3_3 {
 
	
	public static void swap(Question t) {
		
		int temp = t.e1;
		t.e1 = t.e2;
		t.e2 = temp;
	}
	
	public static void main(String[] args) {
		//Create an object of class Question 
		Question t= new Question (); 
		 //Call the method swap() 
		swap(t); 
		System.out.println(t.e1+" "+t.e2); 

	}
}


class Question { // Define a class Question with two elements e1 and e2.
	
	Scanner sc = new Scanner(System.in);
	int e1 = sc.nextInt(); // Read e1
	int e2 = sc.nextInt(); // Read e2
	
}

