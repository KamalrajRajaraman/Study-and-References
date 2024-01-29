package Demo;


public abstract class Biriyani{
	final private void rice(){
		System.out.println("Rice....");
	}
	
	final private void Chicken(){
		System.out.println("Chicken...");
	}
	abstract public void masala();
	abstract public void quantity();
	
	public void doBiriyani(){ //template Method
		rice();
		Chicken();
		masala();
		quantity();
	}
}