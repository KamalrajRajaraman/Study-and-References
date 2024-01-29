package GenericConstructor;

public class GenericConstructor {
	private double val;
	public <T extends Number>GenericConstructor(T t) {
		val = t.doubleValue();
	}
	public void showVal() {
		System.out.println("val"+val);
	}
}
