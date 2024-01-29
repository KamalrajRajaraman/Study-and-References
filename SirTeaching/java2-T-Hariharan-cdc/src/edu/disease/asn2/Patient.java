package edu.disease.asn2;

import java.util.Arrays;
import java.util.UUID;

import edu.disease.asn1.Exposure;

/**
 * A Patient with the following properties
 * <li>
 * java.util.UUID patientld
 * String firstName 
 * String lastName 
 * Exposure[] exposures 
 * UUID[] diseaselds
 * <li>
 */

public class Patient implements Comparable<Patient> {
	private UUID patientId;
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
	 * Your constructor should throw an IllegalArgumentException
	 * with the appropriate message if the maxDiseases or
	 * maxExposure values cannot be used to initiate the arrays.
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
	 * @param diseaseId, Provide an addDiseaseld method that returns void and accepts
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
	 * @param exposure ,Provide an addExposure method that returns void and accepts
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
	 * @return patientId ,Provide getter method for patientId property.
	 */
	public UUID getPatientId() {
		return patientId;
	}

	/**
	 * @return firstName ,Provide getter method for firstName property.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return lastName ,Provide getter method for lastName property.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param patientId ,Provide setter method for patientId property.
	 */
	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	/**
	 * @param firstName ,Provide setter method for patientId property.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return lastName ,Provide getter method for lastName property.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * Provide hashCode method for patientId property.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}
	/**
	 * Provide equals method for patientId property.
	 */
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
	/**
	 * Provide toString method for patientId property.
	 */
	@Override
	public String toString() {
		return "Patient [firstName=" + firstName + ", lastName=" + lastName + ", exposures="
				+ Arrays.toString(exposures) + ", diseaseIds=" + Arrays.toString(diseaseIds) + ", patientId="
				+ patientId + "]";
	}

	/**
	 * 
	 * Patient class to allow it to be sortable in ascending order by the last name,
	 * then first name. Sorting should be case insensitive.
	 */
	@Override
	public int compareTo(Patient o) {
		if (this.lastName.compareTo(o.lastName) != 0) {
			return this.lastName.compareTo(o.lastName);
		} else {
			return this.firstName.compareTo(o.firstName);
		}
	}

}