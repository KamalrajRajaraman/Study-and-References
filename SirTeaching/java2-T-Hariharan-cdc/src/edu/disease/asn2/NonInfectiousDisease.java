package edu.disease.asn2;

public class NonInfectiousDisease extends Disease{
	/**
	 *@return InfectiousDiseaseArray
	 * return an array of four NonInfectiousDiseaseArray
	 * 
	 */
	@Override
	public String[] getExamples() {
		String[] NonInfectiousDiseaseArray = { "Cardiovascular ", "Cancer", "Chronic respiratory", "Diabetes" };
		return NonInfectiousDiseaseArray;
	}
}
