package MyDecorator;

public class FourtyMP extends Camera{
	Mobile m;

	@Override
	public int cost() {
		if(m!=null)
			return 6000+m.cost();
		return 6000;
	}
	
	public FourtyMP() {
		
	}
	public FourtyMP(Mobile m) {
		this.m=m;
	}
}
