package MyDecorator;

public class SixtyFourGB extends ROM {
	Mobile m;

	@Override
	public int cost() {
		if(m!=null)
			return 10000+m.cost();
		return 10000;
	}
	public SixtyFourGB() {
		// TODO Auto-generated constructor stub
	}
	public SixtyFourGB(Mobile m) {
		this.m=m;
	}
}
