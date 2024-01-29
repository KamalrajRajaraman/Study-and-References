package edu.disease.asn1;

import java.util.UUID;

/**
 * 
 * Create a class called, Disease, with the following properties: java.util.UUID
 * diseaseld String name
 */
public class Disease {
	UUID diseaseId;
	String name;

	/**
	 * @return name Provide getter method for the name property.
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return diseaseId Provide getter method for the diseaseId property.
	 * 
	 */

	public UUID getDiseaseId() {
		return diseaseId;
	}

	/**
	 * @param name Provide setter method for the name property.
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param diseaseId Provide setter method for the diseaseId property.
	 * 
	 */
	public void setDiseaseId(UUID diseaseId) {
		this.diseaseId = diseaseId;
	}

	/**
	 * Create a hashCode method using the UUID property as the field that makes this
	 * class unique.
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diseaseId == null) ? 0 : diseaseId.hashCode());
		return result;
	}

	/**
	 * Create a hashCode method using the UUID property as the field that makes this
	 * class unique.
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disease other = (Disease) obj;
		if (diseaseId == null) {
			if (other.diseaseId != null)
				return false;
		} else if (!diseaseId.equals(other.diseaseId))
			return false;
		return true;
	}
	/**
	 * Create a toString method that includes all the properties.
	 * 
	 */
	@Override
	public String toString() {
		return "Disease [name=" + name + ", diseaseId=" + diseaseId + "]";
	}

}
