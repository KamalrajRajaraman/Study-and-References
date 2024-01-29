package INnerClass;

public class InnerClassDemo {
	

	public static void main(String[] args) {
//		Cola cola =new Kalimark.CampaCola();
//		Pepsi p = new Pepsi();
//		p.makePepsi(cola);
		
		Kalimark k = new Kalimark();
		new k.makeBovonto()
		k.makeBovonto();
	}
}
abstract class Cola{
	abstract public void makeCola();
}


class Pepsi{
	public void makePepsi(Cola cola) {
		cola.makeCola();
		System.out.println("Pesi sell Cola");
	}
}

class Kalimark{
	public void makeBovonto() {
//		class CampaCola extends Cola{
//
//			@Override
//			public void makeCola() {
//				System.out.println("get Cola Formula");
//				
//			}
//			
//		};
//		
//		new CampaCola().makeCola();
		new Cola() {
			
			@Override
			public void makeCola() {
				System.out.println("get Cola Formula");
				
			}
		}.makeCola();
		System.out.println("Kalimark sell Cola");
	}
	
}