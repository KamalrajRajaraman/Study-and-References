package edu.disease.asn1;
/**
 * 
 */
import java.time.LocalDateTime;
import java.util.UUID;
/**
 * 
 * @author KAMALRAJ
 *
 */
public class Exposure  {
	
	
	protected UUID patientId;
	private LocalDateTime dataTime;
	private String exposureType;
	/**
	 * 
	 * @param dataTime
	 * @param exposureType
	 */
	public Exposure(LocalDateTime dataTime,String exposureType) {
		
		if(exposureType.equals("D")||exposureType.equals("I")) {
			this.exposureType=exposureType;
		}
		else {
			throw new IllegalArgumentException();
		}
		
		this.dataTime=dataTime;
		
	}
	
	/**
	 * 
	 */
	public Exposure() {
		
	}
	/**
	 * 
	 * @return
	 */
	public UUID getPatientId() {
		return patientId;
	}
	/**
	 * 
	 * @return
	 */
	public LocalDateTime getDataTime() {
		return dataTime;
	}
	
	public void setDataTime(LocalDateTime dataTime) {
		this.dataTime = dataTime;
	}
	/**
	 * 
	 * @return
	 */
	public String getExposureType() {
		return exposureType;
	}
	/**
	 * 
	 * @param exposureType
	 */
	public void setExposureType(String exposureType) {
		if(exposureType.equals("D")||exposureType.equals("I")) {
			this.exposureType = exposureType;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	/**
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	/**
	 * 
	 */
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "patientId ="+patientId+","+"dataTime="+dataTime+","+"exposureType="+exposureType;
	}
	
	
	
	
}
