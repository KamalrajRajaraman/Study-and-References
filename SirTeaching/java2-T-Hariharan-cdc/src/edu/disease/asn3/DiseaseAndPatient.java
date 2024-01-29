package edu.disease.asn3;

/**
 * A DiseaseAndPatient class define following properties:
 * <li>
 * Disease[] diseases
 * Patient[] patients
 * <li>
 *
 */
public class DiseaseAndPatient {
	private Disease[] diseases;
	private Patient[] patients;
	
	/**
	 * @return Disease[] diseases
	 * 
	 * */
	public Disease[] getDiseases() {
		return diseases;
	}
	/**
	 * @return Patient[] patients
	 * 
	 * */
	public Patient[] getPatients() {
		return patients;
	}
	/**
	 * @param Disease[] diseases	
	 * 
	 * */
	public void setDiseases(Disease[] diseases) {
		this.diseases = diseases;
	}
	/**
	 * @param Patient[] patients
	 * **/
	public void setPatients(Patient[] patients) {
		this.patients = patients;
	}
	
	
}
