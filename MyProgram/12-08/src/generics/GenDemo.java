package generics;

public class GenDemo {
	public static void main(String[] args) {
		Gen<Integer> obj;
		obj = new Gen<Integer>(88);
		
		obj.showType();
		
		int v = obj.getOb();
		System.out.println("value : "+v);
		
		Gen<String> strOb;
		strOb = new Gen<String>("Kamal");
		
		
		strOb.showType();
		
		String str = strOb.getOb();
		
		System.out.println("str :"+str);
		
		obj = strOb;
	}
}
