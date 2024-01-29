package MyAdaptor;

public class Main {
	public static void main(String[] args) {
//		AmericanPlug lap = new Lenovo();
//		
//		Adaptor a = new Adaptor();
//		SakthiPlugHolder s = new SakthiPlugHolder();
//		s.indianPlugHole(a);
		
		Lenovo l = new Lenovo();
		Adaptor a = new Adaptor(l);
		SakthiPlugHolder s = new SakthiPlugHolder();
		s.indianPlugHole(a);
	
	}
}
