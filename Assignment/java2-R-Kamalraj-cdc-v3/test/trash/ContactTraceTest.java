//package trash;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.time.LocalDateTime;
//import java.util.UUID;
//
//import org.junit.Before;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//
//import edu.disease.asn3.Exposure;
//import edu.disease.asn3.Disease;
//import edu.disease.asn3.DiseaseControlManager;
//import edu.disease.asn3.DiseaseControlManagerImpl;
//import edu.disease.asn3.InfectiousDisease;
//import edu.disease.asn3.Patient;
//
//class ContactTraceTest {
//	@Disabled
//	@Test
//	void test() {
//		
//		DiseaseControlManager DCM = new DiseaseControlManagerImpl(1, 7);
//		DCM.getClass().getDeclaredMethod(name, parameterTypes)
//		Disease corona = DCM.addDisease("corona", true);
//		
//		UUID coronaUUID = corona.getDiseaseId();
//
//		Patient A = DCM.addPatient("Kamalraj", "R", 1, 0);
//		UUID Aid = A.getPatientId();
//
//		Patient B = DCM.addPatient("Kathi", "P", 1, 1);
//		UUID Bid = B.getPatientId();
//
//		Patient C = DCM.addPatient("Mani", "P", 1, 2);
//		UUID Cid = C.getPatientId();
//
////		Patient D = DCM.addPatient("Kalai", "P", 1, 2);
////		UUID Did = D.getPatientId();
////
////		Patient E = DCM.addPatient("Dev", "P", 1, 2);
////		UUID Eid = E.getPatientId();
////
////		Patient F = DCM.addPatient("Venki", "P", 1, 2);
////		UUID Fid = F.getPatientId();
////
////		Patient G = DCM.addPatient("Kavi", "R", 1, 2);
////		UUID Gid = G.getPatientId();
//
//		DCM.addDiseaseToPatient(Aid, coronaUUID);
//		DCM.addDiseaseToPatient(Bid, coronaUUID);
//		DCM.addDiseaseToPatient(Cid, coronaUUID);
////		DCM.addDiseaseToPatient(Did, coronaUUID);
////		DCM.addDiseaseToPatient(Eid, coronaUUID);
////		DCM.addDiseaseToPatient(Fid, coronaUUID);
////		DCM.addDiseaseToPatient(Gid, coronaUUID);
//
//		// Exposure of A
////		Exposure A_B = new Exposure(null);
////		LocalDateTime dateTimeA_B = LocalDateTime.of(2019, 1, 14, 11, 00);
////		A_B.setDateTime(dateTimeA_B);
////		A_B.setExposureType("D");
////
////		Exposure A_C = new Exposure(Aid);
////		LocalDateTime dateTimeA_C = LocalDateTime.of(2019, 1, 16, 10, 00);
////		A_C.setDateTime(dateTimeA_C);
////		A_C.setExposureType("D");
////
////		A.addExposure(A_B);
////		A.addExposure(A_C);
//
//		// Exposure of B
//		Exposure B_A = new Exposure(Aid);
//		LocalDateTime dateTimeB_A = LocalDateTime.of(2019, 1, 15, 11, 00);
//		B_A.setDateTime(dateTimeB_A);
//		B_A.setExposureType("D");
////
////		Exposure B_C = new Exposure(Cid);
////		LocalDateTime dateTimeB_C = LocalDateTime.of(2019, 1, 17, 10, 00);
////		B_C.setDateTime(dateTimeB_C);
////		B_C.setExposureType("D");
////
////		Exposure B_D = new Exposure(Did);
////		LocalDateTime dateTimeB_D = LocalDateTime.of(2019, 1, 18, 11, 00);
////		B_D.setDateTime(dateTimeB_D);
////		B_D.setExposureType("D");
//
////		Exposure B_E = new Exposure(Eid);
////		LocalDateTime dateTimeB_E = LocalDateTime.of(2019, 1, 19, 10, 00);
////		B_E.setDateTime(dateTimeB_E);
////		B_E.setExposureType("D");
//
//		B.addExposure(B_A);
////		B.addExposure(B_C);
////		B.addExposure(B_D);
////		B.addExposure(B_E);
//
//		// Exposure of C
//		Exposure C_A = new Exposure(Aid);
//		LocalDateTime dateTimeC_A = LocalDateTime.of(2019, 1, 16, 11, 00);
//		C_A.setDateTime(dateTimeC_A);
//		C_A.setExposureType("D");
////
//		Exposure C_B = new Exposure(Bid);
//		LocalDateTime dateTimeC_B = LocalDateTime.of(2019, 1, 17, 10, 00);
//		C_B.setDateTime(dateTimeC_B);
//		C_B.setExposureType("D");
////
////		Exposure C_F = new Exposure(Fid);
////		LocalDateTime dateTimeC_F = LocalDateTime.of(2019, 1, 20, 11, 00);
////		C_F.setDateTime(dateTimeC_F);
////		C_F.setExposureType("D");
////
////		Exposure C_G = new Exposure(Gid);
////		LocalDateTime dateTimeC_G = LocalDateTime.of(2019, 1, 21, 10, 00);
////		C_G.setDateTime(dateTimeC_G);
////		C_G.setExposureType("D");
//		
//		C.addExposure(C_B);
//		C.addExposure(C_A);
//		
////		C.addExposure(C_F);
////		C.addExposure(C_G);
//		
//		ContactTrace CT = new ContactTrace(DCM);
//		
//		PatientZero zero =CT.findPatientZero(C);
//		assertEquals(A, zero.getPatient());
//		
//
//	}
//
//}
