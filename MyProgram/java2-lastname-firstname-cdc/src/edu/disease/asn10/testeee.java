package edu.disease.asn10;

import java.util.Arrays;

public class testeee {
	String[] diseaseIds = new String[3];
	public  void addDiseseId(String diseaseId) {
		
		for (int i = 0; i < diseaseIds.length; i++) {
			if (diseaseIds[i] == null) {
				diseaseIds[i] = diseaseId;
				break;
			}
			if (i == diseaseIds.length - 1) {
				throw new IndexOutOfBoundsException("diseseId array is full");
			}
		}
		
		System.out.println(Arrays.toString(diseaseIds));

	}
	public static void main(String[] args) {
		testeee t = new testeee();
		t.addDiseseId("kamal");
		t.addDiseseId("kamal");
		t.addDiseseId("kamal");
		t.addDiseseId("hjs");
	
		
	}
}
