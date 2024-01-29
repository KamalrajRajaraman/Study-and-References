package MyBuilder;

public class Main {
	public static void main(String[] args) {
		Cycle c = new Cycle.Factory().build();
		Cycle c1 = new Cycle.Factory().
				setChain(new Chain()).build();
		System.out.println(c.totalcost());
		System.out.println(c1.totalcost());
	}
}
