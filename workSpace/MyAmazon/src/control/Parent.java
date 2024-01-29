package control;

public class Parent extends Object implements Cloneable{
	String name;
	private static Parent p =null;
	static {
		System.out.println("static");
	}
	{
		System.out.println("non static");
		
	}
	private  Parent() {
		super();
		System.out.println("Parent Created ");
	}
	public static Parent getInstance() throws CloneNotSupportedException{
		if(p==null) {
			return p= new Parent();
			
		}
		else {
			return (Parent) p.clone();
		}
		
		
		
	}
	
}
