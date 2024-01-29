package trash;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class StartDateAndTime {
	
	public static int timeCal(LocalDateTime localDateTime) {
		
		Map<String, Integer> place = new LinkedHashMap<>();
		place.put("Chennai", 4);
		place.put("Pondy", 2);
		place.put("Cuddalore", 8);
		place.put("Vadalur", 10);
		place.put("Salem", 2);
		int Dp_p1 = place.get("Chennai");
		int p1_P2 = place.get("Pondy");
		int p2_p3 = place.get("Cuddalore");
		int p3_p4 = place.get("Vadalur");
		int p4_DE = place.get("Salem");
		int sum =0;
		LocalDateTime result = localDateTime;
		while(true) {
			
			if(localDateTime.getDayOfWeek().equals(DayOfWeek.FRIDAY) ) {
				result = result.plusHours(Dp_p1);
			}
		}
		
		
		return sum;
		
	}
	public static LocalDateTime getCourier(int day, int month, int year, int hour, int minute, int second) {
		
		
		LocalDateTime localDateTime = LocalDateTime.of(year, month, day, hour, minute, second);
		
		
		int sum =timeCal( localDateTime);
		
		
		LocalDateTime result = localDateTime.plusHours(sum);
		
		return result;
	}

	public static void main(String[] args) {
		LocalDateTime localDateTime =getCourier(21, 8, 2023, 11, 43, 0);
		System.out.println(localDateTime.getDayOfWeek());
		LocalDateTime  k =LocalDateTime.now();
		System.out.println(k);

	}
}
