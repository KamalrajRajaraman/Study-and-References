package generics;

public class TwoGenDemo {
	public static void main(String[] args) {
		TwoGen<Integer,String> obj = new TwoGen<>(123,"kamal");
		
		obj.showType();
		
		int v =obj.getOb1();
		
		System.out.println("int :"+v);
		
		String str =obj.getOb2();
		
		System.out.println("String :"+str);
		
		
	}
}
