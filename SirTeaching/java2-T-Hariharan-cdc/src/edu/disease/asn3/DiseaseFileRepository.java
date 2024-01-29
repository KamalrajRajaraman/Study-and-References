package edu.disease.asn3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class DiseaseFileRepository {
	String folderPath;

	public void save(Disease[] diseases, Patient[] patients) throws Exception {
		FileOutputStream fout = new FileOutputStream(folderPath+"disease.dat");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(diseases);
		out.flush();
		out.close();
		FileOutputStream fout1 = new FileOutputStream(folderPath+"patients.dat");
		ObjectOutputStream out1 = new ObjectOutputStream(fout1);
		out1.writeObject(patients);
		out1.flush();
		out1.close();

	}

	public DiseaseAndPatient init(String folderPath) throws Exception {
		this.folderPath=folderPath;
		DiseaseAndPatient dap = new DiseaseAndPatient();
		if (folderPath != null) {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream(folderPath+"disease.dat"));
			dap = (DiseaseAndPatient) oin.readObject();
			oin.close();
			ObjectInputStream oin1 = new ObjectInputStream(new FileInputStream(folderPath+"patients.dat"));
			dap = (DiseaseAndPatient) oin1.readObject();
			oin1.close();
			return dap;
		} else {
			throw new IllegalArgumentException("the supplied folderPath is null");
		}

	}
}
