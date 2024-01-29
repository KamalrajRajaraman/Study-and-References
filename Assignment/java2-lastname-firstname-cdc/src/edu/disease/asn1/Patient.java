package edu.disease.asn1;

import java.util.Arrays;
import java.util.UUID;

/**
 * Create a class called, Patient, with the following properties java.util.UUID
 * patientld String firstName String lastName Exposure[] exposures UUID[]
 * diseaselds
 */

public class Patient {
	UUID patientId;
	private String firstName;
	private String lastName;
	Exposure[] exposures;
	UUID[] diseaseIds;

	/**
	 * Create a single constructor that accepts two parameters.
	 * 
	 * @param maxDiseases
	 * @param maxExposures
	 * 
	 *                     Your constructor should throw an IllegalArgumentException
	 *                     with the appropriate message if the maxDiseases or
	 *                     maxExposure values cannot be used to initiate the arrays.
	 */
	public Patient(int maxDiseases, int maxExposures) {
		if (maxDiseases > 0) {
			this.diseaseIds = new UUID[maxDiseases];
		} else {
			throw new IllegalArgumentException(
					"Invalid input for maxDiseases :The value of \"maxDiseases\"should not be 0 or negative");
		}
		if (maxExposures > 0) {
			this.exposures = new Exposure[maxExposures];
		} else {
			throw new IllegalArgumentException(
					"Invalid input for maxExposures : The value of \"maxExposures+\"should not be 0 or negative");
		}

	}

	/**
	 * @param diseaseId Provide an addDiseaseld method that returns void and accepts
	 *                  a UUID argument. This method will add the supplied diseaseld
	 *                  to the diseaselds array. Throw an IndexOutOfBoundsException
	 *                  with the appropriate message if the diseaselds array is
	 *                  full.
	 */
	int index = 0;

	public void addDiseaseId(UUID diseaseId) {
		if (index < diseaseIds.length) {
			diseaseIds[index] = diseaseId;
			index++;
		} else {
			throw new IndexOutOfBoundsException("diseaseIds array's Memory Full...");
		}
	}

	/**
	 * @param exposure Provide an addExposure method that returns void and accepts
	 *                 an Exposure argument. This method will add the supplied
	 *                 exposure to the exposures array. Throw an
	 *                 IndexOutOfBoundsException with the appropriate message if the
	 *                 exposures array has reached its maximum capacity.
	 */
	int index1 = 0;

	public void addExposure(Exposure exposure) {
		if (index1 < exposures.length) {
			exposures[index1] = exposure;
			index1++;
		} else {
			throw new IndexOutOfBoundsException(" exposures array's Memory Full...");
		}

	}

	/**
	 * @return patientId Provide getter method for patientId property.
	 */
	public UUID getPatientId() {
		return patientId;
	}
	/**
	 * @return firstName
	 * Provide getter method for firstName property.
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @return lastName
	 * Provide getter method for lastName property.
	 */
	public String getLastName() {
		return lastName;
	}

	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patient [firstName=" + firstName + ", lastName=" + lastName + ", exposures="
				+ Arrays.toString(exposures) + ", diseaseIds=" + Arrays.toString(diseaseIds) + ", patientId="
				+ patientId + "]";
	}

}
