package MyDecorator;

public class TwoGb extends RAM {
	Mobile m;

	@Override
	public int cost() {
		if(m!=null)
			return 1000+m.cost();
		return 1000;
	}
	
	public TwoGb() {
	
	}
	public TwoGb(Mobile m) {
		this.m=m;
	}
	
}
