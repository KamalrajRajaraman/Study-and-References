package Week4;

public class Assignment4_4 implements First,Second {
	public static void main(String[] args) {
		Assignment4_4 a = new Assignment4_4();
		a.show();
	}

	@Override
	public void show() {
		
		First.super.show();
		Second.super.show();
	}
}

interface First {
	// default method
	default void show() {
		System.out.println("Default method implementation of First interface.");
	}
}

interface Second {
	// Default method

	default void show() {
		System.out.println("Default method implementation of Second interface.");
	}
}