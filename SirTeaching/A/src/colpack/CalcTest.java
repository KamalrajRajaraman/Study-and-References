package colpack;

import org.junit.jupiter.api.Test;

public class CalcTest {
	
	@Test
	public void test1() {
		Calculator calc=new Calculator();
		int result=calc.div(10,2);
		assertEquals(5, result);
	}
	
	@Test(expected=ArithmeticException.class)
	public void test2() {
		Calculator calc=new Calculator();
		int result=calc.div(10,0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test3() {
		Calculator calc=new Calculator();
		int i=10;int j=0;
		int result=calc.div(i,j);		
	}
}


