package control;

public class MainOfParent {
	public static void main(String[] args) throws CloneNotSupportedException {
		Parent p = Parent.getInstance();
		p.name="Kamal";
		System.out.println(p.name);
		
		Parent p1 = Parent.getInstance();
		p1.name="MAlar";
		System.out.println(p1.name);
		
		Parent p2 = Parent.getInstance();
		//p2.name="MAlar";
		System.out.println(p2.name);
		p2.
		
		
	}

}
