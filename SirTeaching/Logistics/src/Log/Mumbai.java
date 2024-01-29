package Log;

public class Mumbai  extends  Place{
	int hr=5;
	Place place;
	public Mumbai() {
		
	}
	public Mumbai(Place place) {
		this.place=place;
	}

	@Override
	public int travelHour() {
		if(place!=null) {
			return hr + place.travelHour();
		}
		return hr;
	}
}
