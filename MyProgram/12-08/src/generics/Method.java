package generics;

public class Method {
	public static void main(String[] args) {
		m1("String", 123, 'k');
		m1(1);
		m1(5.000F);
		m1(45.231546);
		m1(new Method());
		m1(true);
		m1();
		m1("String", "Kamal");
		m2("kamal",29);
	}

	@SafeVarargs
	public static <T> void m1(T... a) {
		System.out.println("hi");
		for (T t : a) {
			System.out.println(t);
		}
	}
	
	public static <T> void m1(T a) {

		System.out.println(a);

	}

	public static <T> void m1(T a, T b) {

		System.out.println(a);
		System.out.println(b);

	}
	public static <T,U,R> R m2(T a, U b) {

		System.out.println(a);
		System.out.println(b);
		return (R) a; 

	}

}
