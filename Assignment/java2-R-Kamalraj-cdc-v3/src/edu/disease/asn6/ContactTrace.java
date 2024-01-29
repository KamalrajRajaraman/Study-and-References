package edu.disease.asn6;



import java.util.List;

import edu.disease.asn3.Exposure;


public class ContactTrace {
	DiseaseControlManager diseaseControlManager;
	
	public PatientZero findPatientZero(Patient patient) {
		
		if(patient.getExposures().size()==0) {
			PatientZero patientZero = new PatientZero();
			patientZero.setPatient(patient);
			patientZero.setExposed(false);
			return patientZero;
	
		}
		
		List<Exposure> exposures = patient.getExposures();
		
		Exposure earliestExposure =exposures.get(0);
		for(int i=1;i<exposures.size();i++) {
			
			if(exposures.get(i).getExposureType().equals("D")) {
				if(earliestExposure.getDateTime().isAfter(exposures.get(i).getDateTime())){
					earliestExposure=exposures.get(i);
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
