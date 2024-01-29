package edu.disease.asn1;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * 
 * 
 * A Exposure represent with the following properties:
 * <li>java.util.UUID patientld java.time.LocalDateTime dateTime String
 * exposureType
 * <li>
 * 
 */
public class Exposure {
	private UUID patientId;
	private LocalDateTime dateTime;
	private String exposureType;

	/**
	 * 
	 * @param dateTime
	 * @param exposureType Provide a constructor excepting the UUID for the
	 *                     patientId and set the patientId to its respective
	 *                     property.
	 * 
	 * 
	 */
	public Exposure(UUID patientId) {
		this.patientId = patientId;
	}

	/**
	 * @return the patientId Provide a getter method for the patientId property.
	 * 
	 */
	public UUID getPatientId() {
		return patientId;
	}

	/**
	 * @return the dateTime Provide a getter method for the dateTime property.
	 * 
	 */
	public LocalDateTime getDateTime() {
		return dateTime;
	}

	/**
	 * @return the exposureType Provide a getter method for the exposureType
	 *         property.
	 * 
	 */
	public String getExposureType() {
		return exposureType;
	}

	/**
	 * @param dateTime Provide a setter method for the dateTime property.
	 */
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * @param dateTime Provide a setter method for the ExposureType property. The
	 *                 exposure Type property should only be allowed to accept the
	 *                 values, "D" for direct exposure or "I" for indirect exposure.
	 *                 Throw an IllegalArgumentException with the appropriate
	 *                 message within the setExposure Type method if the supplied
	 *                 exposure type is not "D” and not “I”.
	 */
	public void setExposureType(String exposureType) {
		if (exposureType.equals("D") || exposureType.equals("I")) {
			this.exposureType = exposureType;
		} else {
			throw new IllegalArgumentException("D and I only allows");
		}

	}

	/**
	 * Create a hashCode method using the patientId,and dateTime.
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateTime == null) ? 0 : dateTime.hashCode());
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}

	/**
	 * Create a equals method using the patientId,and dateTime.
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
		Exposure other = (Exposure) obj;
		if (dateTime == null) {
			if (other.dateTime != null)
				return false;
		} else if (!dateTime.equals(other.dateTime))
			return false;
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		return true;
	}

	/**
	 * 
	 * Create a toString method using the patientId,and dateTime.
	 * 
	 */

	@Override
	public String toString() {
		return "Exposure [patientId=" + patientId + ", dateTime=" + dateTime + ", exposureType=" + exposureType + "]";
	}

}
