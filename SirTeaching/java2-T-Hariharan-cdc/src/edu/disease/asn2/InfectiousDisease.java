package edu.disease.asn2;

public class InfectiousDisease extends Disease {

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
