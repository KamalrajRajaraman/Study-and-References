package generics;

public class NonGenDemo {
	public static void main(String[] args) {
		NonGen iObj = new NonGen(88);
		
		iObj.showType();
		
		int v = (int) iObj.ob;
		
		System.out.println("value :"+v);
		
		
		NonGen strObj = new NonGen("kamal");
		
		strObj.showType();
		
		String str = (String) strObj.ob;
		
		System.out.println("String :"+str);
		
		iObj  =strObj;
	
		int v1 = (int) iObj.ob;
	
	}
}
