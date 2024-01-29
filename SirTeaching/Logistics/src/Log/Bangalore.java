package Log;
public class Bangalore extends  Place{
	int hr=8;
	Place place;
	public Bangalore() {
		
	}
	public Bangalore(Place place) {
		this.place=place;
	}

	@Override
	public int travelHour() {
		if(place!=null) {
			return hr+place.travelHour();
		}
		return hr;
	}
}