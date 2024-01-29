

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import edu.disease.asn1.Exposure;

class ExposureTest {
	Exposure e1 ;

	@Test
	public void atestGetDataTime() {
		LocalDateTime dataTime =  LocalDateTime.now();
		String exposureType ="D";
		Exposure e1 = new Exposure(dataTime, exposureType);
		assertEquals(dataTime, e1.getDataTime());
		
	}
	
	
	@Test
	public void btestPassingWrongExposureType() {
		LocalDateTime dataTime =  LocalDateTime.now();
		String exposureType ="Dscsc";
		
//		try {
//			Exposure e1 = new Exposure(dataTime, exposureType);
//		}
//		catch (Exception e) {
//			equals(e instanceof IllegalArgumentException);
//		}
		assertThrows(IllegalArgumentException.class,()->e1 = new Exposure(dataTime, exposureType));
	
	}
	@Test
	public void ctestGetExposureType() {
		LocalDateTime dataTime =  LocalDateTime.now();
		String exposureType ="D";
		Exposure e1 = new Exposure(dataTime, exposureType);
		String exposureType1 ="D";
		assertEquals(exposureType1, e1.getExposureType());
		
	}
	
	@Test
	public void dtestGetDataTime() {
		LocalDateTime dataTime =  LocalDateTime.now();
		String exposureType ="D";
		Exposure e1 = new Exposure(dataTime, exposureType);
		assertEquals( dataTime, e1.getDataTime());
		
	}
	@Test
	public void etestGetPatientId() {
		LocalDateTime dataTime =  LocalDateTime.now();
		String exposureType ="D";
		Exposure e1 = new Exposure(dataTime, exposureType);
		assertNull( e1.getPatientId());
		
	}
	
	@Test
	public void ftestSetDataTime() {
		
		LocalDateTime dataTime =  LocalDateTime.now();
		String exposureType ="D";
		Exposure e1 = new Exposure(dataTime, exposureType);
		LocalDateTime dataTime1 =  LocalDateTime.now();
		e1.setDataTime(dataTime1);
		assertEquals(dataTime1, e1.getDataTime());
		
		
		
	}
	@Test
	public void gtestSetExposureType() {
		
		LocalDateTime dataTime =  LocalDateTime.now();
		String exposureType ="D";
		Exposure e1 = new Exposure(dataTime, exposureType);
		String exposureType1 ="I";
		e1.setExposureType(exposureType1);
		assertEquals(exposureType1, e1.getExposureType());
		
		
	}
	@Test
	public void htestWrongSetExposureType() {
		
		LocalDateTime dataTime =  LocalDateTime.now();
		String exposureType ="D";
		Exposure e1 = new Exposure(dataTime, exposureType);
		String exposureType1 ="Ik";
//		try {
//			e1.setExposureType(exposureType1);
//		}
//		catch (Exception e) {
//			equals(e instanceof IllegalArgumentException);
//		}
		assertThrows(IllegalArgumentException.class,()->e1.setExposureType(exposureType1));
		
	}
	
	@Test
	public void itestSetExposureType() {
		
		LocalDateTime dataTime =  LocalDateTime.now();
		String exposureType ="I";
		Exposure e1 = new Exposure(dataTime, exposureType);
		String exposureType1 ="D";
		e1.setExposureType(exposureType1);
		assertEquals(exposureType1, e1.getExposureType());
		
		
	}
	
	@Test
	public void jtestNoArgConstructor() {
		Exposure e1 = new Exposure();
		assertTrue(e1 instanceof Exposure);
	}
	
	@Test
	public void kTestHashCode() {
		Exposure e1 = new Exposure();
		Exposure e2 = e1;
		assertEquals(e1.hashCode(), e2.hashCode());
	}
	
	@Test
	public void lTestEquals() {
		Exposure e1 = new Exposure();
		Exposure e2 = e1;
		assertTrue(e1.equals(e2));
	}
	
	@Test
	public void lTestTOString() {
		LocalDateTime dataTime =  LocalDateTime.now();
		String exposureType ="I";
		Exposure e1 = new Exposure(dataTime, exposureType);
		assertTrue(e1.toString() instanceof String);
	
	}
	
	
	
	

}
