package edu.disease.asn3;

public class NonInfectiousDisease extends Disease{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
