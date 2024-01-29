package GenericConstructor;

public class GenConsDemo {
	public static void main(String[] args) {
		GenericConstructor a1 = new GenericConstructor(100);
		GenericConstructor a2 = new GenericConstructor(1234.45F);
		a1.showVal();
		a2.showVal();
	}
}
