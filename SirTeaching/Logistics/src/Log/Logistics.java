package Log;

import java.lang.reflect.InvocationTargetException;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;



public class Logistics {
	public String getCourier(LocalDateTime localDateTime, Place place)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException {

		LocalDateTime getlocalDateTime = localDateTime;
		LocalDateTime result = null;
		int hr = place.travelHour();
		int min = hr * 60;
		int count = 0;

		while (count < min) {
			if (count == 0) {
				result = localDateTime.plusMinutes(1);
			}
			if (result.getDayOfWeek() == DayOfWeek.SATURDAY) {
				result = result.plusHours(48);
			}

			if ((result.getDayOfMonth() == 1 && result.getMonth() == Month.JANUARY)
					|| (result.getDayOfMonth() == 26 && result.getMonth() == Month.JANUARY)
					|| (result.getDayOfMonth() == 15 && result.getMonth() == Month.AUGUST)) {
				result = result.plusHours(24);
			}

			if (count > 0) {
				result = result.plusMinutes(1);
			}
			count++;
		}
		return "Courier will be reach  by "+result.getDayOfMonth()+ "-" +result.getMonthValue()+"-"+result.getYear()+"/"+ result.toLocalTime();
	}

}
