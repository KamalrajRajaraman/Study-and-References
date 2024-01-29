package MyDecorator;

public class Main {
	public static void main(String[] args) {
		Mobile m1 = new TwoGb(new SixtyFourGB(new FourtyMP()));
		System.out.println("Total Cost Of Your Mobile :"+m1.cost());

	}
}
