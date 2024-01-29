//package trash;
//
//import java.time.LocalDateTime;
//import java.util.Arrays;
//import java.util.UUID;
//
//import org.junit.Test;
//import org.junit.jupiter.api.Disabled;
//
//import edu.disease.asn3.Disease;
//import edu.disease.asn3.DiseaseControlManager;
//import edu.disease.asn3.DiseaseControlManagerImpl;
//import edu.disease.asn3.Exposure;
//import edu.disease.asn3.Patient;
//
//public class MAin {
//	@Disabled
//	@Test
//	public  void main() {
//		Patient patient = new Patient(1,3);
//
//		UUID Aid =UUID.randomUUID();
//		Exposure C_A = new Exposure(Aid);
//		LocalDateTime dateTimeC_A = LocalDateTime.of(2019, 1, 16, 11, 00);
//		C_A.setDateTime(dateTimeC_A);
//		C_A.setExposureType("D");
//		
//		UUID Bid =UUID.randomUUID();
//		Exposure C_B = new Exposure(Bid);
//		LocalDateTime dateTimeC_B = LocalDateTime.of(2019, 1, 17, 10, 00);
//		C_B.setDateTime(dateTimeC_B);
//		C_B.setExposureType("D");
//		
//		UUID Fid =UUID.randomUUID();
//		Exposure C_F = new Exposure(Fid);
//		LocalDateTime dateTimeC_F = LocalDateTime.of(2019, 1, 20, 11, 00);
//		C_F.setDateTime(dateTimeC_F);
//		C_F.setExposureType("D");
//		
//		patient.addExposure(C_A);
//		patient.addExposure(C_B);
//		patient.addExposure(C_F);
//	
//		
//		Exposure[] exposures = patient.getExposures();
//		System.out.println(Arrays.toString(exposures));
//		Exposure earliestExposure =exposures[0];
//		for(int i=1;i<exposures.length;i++) {
//			if(exposures[i].getExposureType().equals("D")) {
//				
//				if(earliestExposure.getDateTime().isAfter(exposures[i].getDateTime())){
//					earliestExposure=exposures[i];
//				}
//				
//			}
//		}
//		System.out.println(earliestExposure);
//	}
//}
