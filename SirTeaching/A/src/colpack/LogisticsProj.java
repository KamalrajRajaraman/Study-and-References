package colpack;
public class LogisticsProj {
	public static void main(String[] args) {
		
	}
}
class Transport{
	public boolean isHoliday(LocalDate ld) {
		DayOfWeek dw=ld.getDayOfWeek();
		Month m=ld.getMonth();
		if(dw==DayOfWeek.SUNDAY || dw==DayOfWeek.SATURDAY) {
			return true;
		}
		else if(ld.getDayOfMonth()==15 && m==Month.AUGUST) {
			return true;
		}
		else if(ld.getDayOfMonth()==1 && m==Month.JANUARY) {
			return true;
		}
		else if(ld.getDayOfMonth()==26 && m==Month.JANUARY) {
			return true;
		}
		else {
			return false;
		}
	}
}


