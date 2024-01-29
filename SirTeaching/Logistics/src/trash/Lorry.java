package trash;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import Log.Place;

public class Lorry {
	Place place;
	public Lorry(Point point) {
		this.place=point.place;
	}
	static class Point{
			Place place;
		
		public Point setPlace(Place place) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
			if(place !=null) {
				Class c = place.getClass();
				Constructor con =c.getDeclaredConstructor(Place.class);
						
				this.place=(Place) con.newInstance(place);
			}
			return  this;
		}
		
		public Lorry travel() {
			return new Lorry(this);
		}
	}
	
	public int time() {		
		return place.travelHour();		
	}

}
