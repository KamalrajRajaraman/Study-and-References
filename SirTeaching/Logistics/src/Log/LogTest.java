package Log;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class LogTest {

	@Test
	void test() throws InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {

		Logistics log = new Logistics();
		LocalDateTime localDateTime = LocalDateTime.of(2023, 8, 14, 23, 23, 0);
		Place l = new Chennai(new Bangalore(new Mumbai()));
		assertEquals("Courier will be reach  by 16-8-2023/15:23", log.getCourier(localDateTime, l));
	
	}
	@Test
	void test1() throws InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {

		Logistics log = new Logistics();
		LocalDateTime localDateTime = LocalDateTime.of(2023,1, 1, 23, 23, 0);
		Place l = new Chennai(new Bangalore());
		assertEquals("Courier will be reach  by 3-1-2023/10:23", log.getCourier(localDateTime, l));
		

	}
	@Test
	void test2() throws InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {

		Logistics log = new Logistics();
		LocalDateTime localDateTime = LocalDateTime.of(2023,1, 26, 23, 23, 0);
		Place l = new Mumbai(new Chennai());
		assertEquals("Courier will be reach  by 30-1-2023/07:23", log.getCourier(localDateTime, l));
		

	}
	

}
