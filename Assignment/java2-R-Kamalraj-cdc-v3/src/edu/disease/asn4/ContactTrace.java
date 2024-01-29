package edu.disease.asn4;

import edu.disease.asn3.DiseaseControlManager;
import edu.disease.asn3.Exposure;
import edu.disease.asn3.Patient;

public class ContactTrace {
	DiseaseControlManager diseaseControlManager;
	
	public PatientZero findPatientZero(Patient patient) {
		
		if(patient.getExposures().length==0) {
			PatientZero patientZero = new PatientZero();
			patientZero.setPatient(patient);
			patientZero.setExposed(false);
			return patientZero;
	
		}
		
		Exposure[] exposures = patient.getExposures();
		Exposure earliestExposure =exposures[0];
		for(int i=1;i<exposures.length;i++) {
			
			if(exposures[i].getExposureType().equals("D")) {
				if(earliestExposure.getDateTime().isAfter(exposures[i].getDateTime())){
					earliestExposure=exposures[i];
				}
			}
		}
		
		Patient earliestpatient =diseaseControlManager.getPatient(earliestExposure.getPatientId());
	
		return findPatientZero(earliestpatient);
		
		
		
	}
	public ContactTrace(DiseaseControlManager diseaseControlManager) {
		this.diseaseControlManager=diseaseControlManager;
	}

}
