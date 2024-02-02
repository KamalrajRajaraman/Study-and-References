package action;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;

public class  ChangeLocalDateTimeFormat{
	public static void main(String[] args) {
	
		
		LocalDateTime ltd = LocalDateTime.now().plusHours(6);
		System.out.println(ltd);
		System.out.println(changeLocalDateTimeFormat(ltd,DATE_TIME_PATTERN));
	
	}
	
	 private static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

	    public static String changeLocalDateTimeFormat(LocalDateTime localDateTime,String dateTimePattern) {
	        return DateTimeFormatter.ofPattern(dateTimePattern).format(localDateTime);
	    }
	

}

