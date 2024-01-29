package MyFactory;

public class Main {
	public static void main(String[] args) {
		AbstactSeller g = new Guru();
		g.setFact(new KamalFactory());
		Customer kamesh = new Customer();
		Mobile m = g.sell(kamesh);
		System.out.println(m);
		
	}
}
