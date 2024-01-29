package edu.disease.asn3;

public class InfectiousDisease extends Disease {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 *@return InfectiousDiseaseArray
	 * return an array of four InfectiousDisease
	 * 
	 */
	@Override
	public String[] getExamples() {
		String[] InfectiousDiseaseArray = { "Common cold", "Typhoid", "Kala-azar", "Sleeping sickness" };
		return InfectiousDiseaseArray;
	}
}
