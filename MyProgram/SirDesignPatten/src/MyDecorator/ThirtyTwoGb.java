package MyDecorator;

public class ThirtyTwoGb extends ROM {
	Mobile m;

	@Override
	public int cost() {
		if(m!=null)
			return 5000+m.cost();
		return 5000;
	}
	public ThirtyTwoGb() {
		// TODO Auto-generated constructor stub
	}
	public ThirtyTwoGb(Mobile m) {
		this.m=m;
	}
}
