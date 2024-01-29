package trash;

import java.time.DayOfWeek;

public class Leave {
	
	public boolean leave(DayOfWeek a) {
		if(a==DayOfWeek.SATURDAY||a==DayOfWeek.SUNDAY) {
			return true;
		}
		return false;		
	}
	public boolean leave(Leave leave) {
		return false;
		
	}
	
}
