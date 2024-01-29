package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import logix.Cal;

class caltst {

	@Test
	void test1() {
		Cal c = new Cal();
		String str = c.select(1);
		Assertions.assertEquals("Kamal", str);

	}

	@Test
	void test2() {
		Cal c = new Cal();
		String str = c.select(2);
		Assertions.a
	}

}
