package MyDecorator;

public class FourGB  extends RAM{
	Mobile m;

	@Override
	public int cost() {
		if(m!=null)
			return 2000+m.cost();
		return 2000;
		
	}
	public FourGB() {
		
	}
	public FourGB(Mobile m) {
		this.m=m;
	}
}
