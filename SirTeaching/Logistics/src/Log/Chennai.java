package Log;
public class Chennai extends  Place{
	int hr=3;
	Place place;
	public Chennai() {
		
	}
	public Chennai(Place place) {
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