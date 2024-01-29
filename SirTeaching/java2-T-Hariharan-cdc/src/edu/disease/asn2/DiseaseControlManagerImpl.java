package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public class DiseaseControlManagerImpl implements DiseaseControlManager {

	private Disease[] diseases;
	private Patient[] patients;

	public DiseaseControlManagerImpl(int maxDiseases, int maxPatients) {
		if (maxDiseases > 0) {
			this.diseases = new Disease[maxDiseases];
		} else {
			throw new IllegalArgumentException(
					"Invalid input for maxDiseases :The value of \"maxDiseases\"should not be 0 or negative");
		}
		if (maxPatients > 0) {
			this.patients = new Patient[maxPatients];
		} else {
			throw new IllegalArgumentException(
					"Invalid input for maxExposures : The value of \"maxPatients\"should not be 0 or negative");
		}
	}

	int index = 0;

	@Override
	public Disease addDisease(String name, boolean infectious) {

		if (index < diseases.length) {
			if (infectious) {
				return diseases[index++] = new InfectiousDisease();

			} else {
				return diseases[index++] = new NonInfectiousDisease();
			}
		} else {
			throw new IllegalStateException("No more Disease can be Added !");
		}

	}

	@Override
	public Disease getDisease(UUID diseaseId) {
		int i = 0;
		while (i < diseases.length) {
			if (diseases[i].getDiseaseId() == diseaseId) {
				return diseases[i];
			}
		}
		return null;

	}

	int indexOfP = 0;

	@Override
	public Patient addPatient(String firstName, String lastName, int maxDisease, int maxExposure) {
		if (indexOfP < patients.length) {
			patients[indexOfP] = new Patient(maxDisease, maxExposure);
			patients[indexOfP].setFirstName(firstName);
			patients[indexOfP].setLastName(lastName);

			return patients[indexOfP++];
		} else {
			throw new IllegalStateException("No more Patients can be Added !");
		}

	}

	@Override
	public Patient getPatient(UUID patientId) {
		int i = 0;
		while (i < patients.length) {
			if (patients[i].getPatientId() == patientId) {
				return patients[i];
			}
		}
		return null;

	}

	@Override
	public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
		Patient patient = getPatient(patientId);
		Disease disease = getDisease(diseaseId);
		if (patient == null) {
			throw new IllegalArgumentException("No patient found..give valid paitentId");
		}
		if (disease == null) {
			throw new IllegalArgumentException("No disease found..give valid diseaseId");
		}
		patient.addDiseaseId(disease.getDiseaseId());
	}

	@Override
	public void addExposureToPatient(UUID patientId, Exposure exposure) {
		Patient patient = getPatient(patientId);
		if (patient == null) {
			throw new IllegalArgumentException("No patient found..give valid paitentId");
		}
		patient.addExposure(exposure);
	}

}
