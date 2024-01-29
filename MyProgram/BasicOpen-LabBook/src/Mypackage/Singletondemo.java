package Mypackage;

public class Singletondemo {

}
class Singleton{
	
	Singleton sg;
	private Singleton() {
		
		
	}
	public static Singleton createobject() {
		
		if(sg==null) {
			
		}
		return sg;
	}
	
	
}
