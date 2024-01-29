package colpack;
public class TransportTest {
	@Test
	public void testJan1() {
		String dateString = "2021-01-01";
        LocalDate parsedDate = LocalDate.parse(dateString);
        System.out.println("Parsed Date: " + parsedDate);
        Transport obj=new Transport();
        boolean result=obj.isHoliday(parsedDate);
        assertTrue(result);
	}
	@Test
	public void test15Aug() {
		String dateString = "2023-08-15";
        LocalDate parsedDate = LocalDate.parse(dateString);
        System.out.println("Parsed Date: " + parsedDate);
        Transport obj=new Transport();
        boolean result=obj.isHoliday(parsedDate);
        assertTrue(result);
	}
	@Test
	public void test26Jan() {
		String dateString = "2023-01-26";
        LocalDate parsedDate = LocalDate.parse(dateString);
        System.out.println("Parsed Date: " + parsedDate);
        Transport obj=new Transport();
        boolean result=obj.isHoliday(parsedDate);
        assertTrue(result);
	}
	@Test
	public void testSat() {
		String dateString = "2023-08-19";
        LocalDate parsedDate = LocalDate.parse(dateString);
        System.out.println("Parsed Date: " + parsedDate);
        Transport obj=new Transport();
        boolean result=obj.isHoliday(parsedDate);
        assertTrue(result);
	}
	@Test
	public void testSun() {
		String dateString = "2023-08-20";
        LocalDate parsedDate = LocalDate.parse(dateString);
        System.out.println("Parsed Date: " + parsedDate);
        Transport obj=new Transport();
        boolean result=obj.isHoliday(parsedDate);
        assertTrue(result);
	}
	@Test
	public void testNonHoliday() {
		String dateString = "2023-08-21";
        LocalDate parsedDate = LocalDate.parse(dateString);
        System.out.println("Parsed Date: " + parsedDate);
        Transport obj=new Transport();
        boolean result=obj.isHoliday(parsedDate);
        assertFalse(result);
	}
}

