package Week4;

public class Assignment4_2 {
	public static void main(String args[]) {
		
		int date;
		int month;
		int year; // integer type variable to store year
		// Create an object of Calendar class.
		java.util.Calendar current;

		// Use getInstance() method to initialize the Calendar object.
		current = java.util.Calendar.getInstance();

		// Initialize the int variable year with the current year
		year = current.get(current.YEAR);
		
		date=current.get(current.DATE);
		month=current.get(current.MONTH);
		// Print the current Year
		System.out.println("Current Date: " + date);
		System.out.println("Current Month: " + month);
		System.out.println("Current Year: " + year);
	}

}
