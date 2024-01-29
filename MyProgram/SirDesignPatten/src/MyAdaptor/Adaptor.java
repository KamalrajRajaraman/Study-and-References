package MyAdaptor;

public class Adaptor extends IndianPug{
	
	AmericanPlug lap;
	
	public Adaptor(AmericanPlug lap) {
		this.lap=lap;
	}
	
	
	AmericanPlugholder p =new AmericanPlugholder() {
		@Override
		public void americanPlugHole(AmericanPlug a1) {
			a1.rectanglurPlug();
		}
	};

	@Override
	public void roundPlug() {
		p.americanPlugHole(lap);
		
	}
	
}
