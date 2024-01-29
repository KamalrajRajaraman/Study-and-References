package edu.disease.asn1;

import java.util.UUID;

public class Disease {
	private UUID diseaseId;
	private String name;
	public UUID getDiseaseId() {
		return diseaseId;
	}
	public void setDiseaseId(UUID diseaseId) {
		this.diseaseId = diseaseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "diseaseId = "+diseaseId+"name ="+name;
	}
}
