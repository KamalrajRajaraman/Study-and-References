package ClosedBook;

public class Investment {
	public static double increasePercent(double investment,double percent) {
		return investment*(100+percent)/100;
	}
	public static double loss(double firstYearAmount,double loss) {
		return firstYearAmount-loss;
	}
	public static void main(String[] args) {
		double investment =14000;
		double increaseInFirstYear =40;
		double loss =1500;
		double  increaseInThirdYear =12;
		double firstYearAmount = increasePercent(investment, increaseInFirstYear);
		double secondYearAmount = loss(firstYearAmount, loss);
		double thirdYearAmount = increasePercent(secondYearAmount, increaseInThirdYear);
		System.out.println("result :"+thirdYearAmount);
		
	}
}
