package MyBuilder;

public class Cycle {
	private Seat s;
	private Wheel w;
	private Chain c;
	private cycleFrame cf;
	
	public Cycle( Factory f) {
		this.s=f.s;
		this.w=f.w;
		this.c=f.c;
		this.cf=f.cf;
	}
	static class Factory{
		private Seat s;
		private Wheel w;
		private Chain c;
		private cycleFrame cf;
		
		public Factory setSeat(Seat s) {
			this.s=s;
			return this;
			
		}
		
		public Factory setcycleFrame(cycleFrame cf) {
			this.cf=cf;
			return this;
			
		}
		
		public Factory setWheel(Wheel w) {
			this.w=w;
			return this;
			
		}
		
		public Factory setChain(Chain c) {
			this.c=c;
			return this;
			
		}
		
		public Cycle build() {
			return new Cycle(this);
		}
		
	}
	
	int cost=0;
	
	public int totalcost() {
		if( s !=null) {
			cost +=s.cost;
		}
		if( cf !=null) {
			cost +=cf.cost;
		}
		if( w !=null) {
			cost +=w.cost;
		}
		if( c !=null) {
			cost +=c.cost;
		}
		return cost;
	}
}
