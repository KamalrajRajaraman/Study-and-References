package edu.disease.asn3;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public interface DiseaseControlManager {

	/**
	 * @return Disease ,Craete a abstract methood called addDisease
	 */
	public abstract Disease addDisease(String name, boolean infectious);

	/**
	 * @return Disease ,Craete a abstract methood called getDisease
	 */
	public abstract Disease getDisease(UUID diseaseId);

	/**
	 * @return Patient ,Craete a abstract methood called addPatient
	 */

	public abstract Patient addPatient(String firstName, String lastName, int maxDisease, int maxExposure);

	/**
	 * @return Patient ,Craete a abstract methood called getPatient
	 */
	public abstract Patient getPatient(UUID patientId);

	/**
	 * Craete a abstract methood called addDiseaseToPatient
	 */
	public abstract void addDiseaseToPatient(UUID patientId, UUID diseaseId);

	/**
	 * Craete a abstract methood called addExposureToPatient
	 */
	public abstract void addExposureToPatient(UUID patientId, Exposure exposure);

	/**
	 * @return Disease array ,Craete a abstract methood called getDiseases
	 */
	public abstract Disease[] getDiseases();

	/**
	 * @return Patient array ,Craete a abstract methood called getPatients
	 */
	public abstract Patient[] getPatients();
}
