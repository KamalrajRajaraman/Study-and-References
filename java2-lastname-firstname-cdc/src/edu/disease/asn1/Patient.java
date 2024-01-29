package edu.disease.asn1;

import java.util.UUID;

public class Patient {
	protected UUID patientId;
	private String firstName;
	private String lastName;
	private Exposure[] exposures;
	private UUID[] diseaseIds;
	
	public Patient(Integer maxDiseases,Integer maxExposures) {
		if(maxExposures instanceof Integer ) {
			this.exposures=new Exposure[maxExposures];
			
		}
		else {
			throw new IllegalArgumentException() {
				@Override
				public String getMessage() {
					return "The value passed for maxExposures = "+maxExposures+" is not Integer ";
				}
			};
		}
		
		if( maxDiseases instanceof Integer ) {
			this.diseaseIds=new UUID[maxDiseases];
		}
		else {
			throw new IllegalArgumentException() {
				@Override
				public String getMessage() {
					return  "The value passed for maxDiseases = "+ maxDiseases +" is not Integer ";
				}
			};
		}
	}
	
	public void addDiseseId(UUID diseseId) {
		for(int i =0;i<diseaseIds.length;i++ ) {
			diseaseIds[i]=diseseId;
		}
		
	}
	
	public void addExposure(Exposure exposure) {
		for(int i =0;i<exposures.length;i++ ) {
			exposures[i]=exposure;
		}
	}
	
	public UUID getPatientId() {
		return patientId;
	}
	
	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public UUID[] getDiseaseIds() {
		return diseaseIds;
	}
	public Exposure[] getExposures() {
		return exposures;
	}
	
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		
		return "patientId = "+patientId+""
				+ "\nfirstName = "+firstName
				+"\nlastName = "+lastName
				+"\nexposures = "+exposures+
				"\ndiseaseIds = "+diseaseIds;
	}

	
	
}
