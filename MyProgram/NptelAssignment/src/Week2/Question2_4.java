package Week2;


public class Question2_4 {
	public static void main(String[] args) {
		Answer a = new Answer(10, "MCQ");
	}
}


class Answer {
	
	Answer() {
		System.out.println("You got nothing.");
	}

	
	Answer(int marks, String type) {
		
		this();
		
		System.out.println("You got " + marks + " for an " + type);
	}
}
