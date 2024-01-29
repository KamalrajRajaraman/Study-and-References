package MyDecorator;

public class TwentMp  extends Camera{
	Mobile m;

	@Override
	public int cost() {
		if(m!=null)
			return 3000+m.cost();
		return 3000;
	}
	public TwentMp() {
		
	}
	public TwentMp(Mobile m) {
		this.m=m;
	}
}
