package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public class DiseaseControlManagerImpl implements DiseaseControlManager{

	@Override
	public Disease addDisease(String name) {
		return null;
	}

	@Override
	public Disease getDisease(UUID diseaseId) {
		return null;
	}

	@Override
	public Patient addPatient(String firstName, String lastName, int maxDisease, int maxExposures) {
		return null;
	}

	@Override
	public Patient getpatient(UUID patientId) {
		return null;
	}

	@Override
	public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
		
	}

	@Override
	public void addExposureToPatient(UUID patientId, Exposure exposure) {
		
	}

}
