package MyPrototypePattern;

public class Hari implements Cloneable{
	String Office;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public Hari() {
		System.out.println("Object Created...");
	}
}
