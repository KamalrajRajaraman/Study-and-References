package edu.disease.asn1;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDateTime;

public class ExposureTest {
	public static void main(String[] args) {
		LocalDateTime a =  LocalDateTime.now();
		Exposure e1 = new Exposure(a, "D");
		System.out.println(e1.getDataTime());
		System.out.println(e1.getPatientId());
		System.out.println(e1.getExposureType());
		System.out.println(e1);
		LocalDateTime a1 =  LocalDateTime.now();
		e1.setDataTime(a1);
		e1.setExposureType("tkccgc");
		System.out.println("_____________________");
		System.out.println(e1.getDataTime());
		System.out.println(e1.getPatientId());
		System.out.println(e1.getExposureType());
		System.out.println(e1);
		
		
		
	}
}
 