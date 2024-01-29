package generics;

public class NonGen {
	Object ob;
	
	public NonGen(Object o) {
		ob = o;
	}

	public Object getOb() {
		return ob;
	}
	
	public void showType() {
		System.out.println(ob.getClass().getName());
	}
}
