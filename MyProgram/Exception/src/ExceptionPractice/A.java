package ExceptionPractice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class A {
	public static void main(String[] args) {
//		try {
//			int[] a= new int[1235677899];
//		}
//		catch(Error e) {
//			e.printStackTrace();
//		}
//		System.out.println("ends");
		C c1 =new C();
		c1.m1();
		throw new StackOverflowError();
	}
}
class B{
	public Object m1() throws IOException {
		return null;
		
	}
}
class C extends B{
	@Override
	public String m1() {
		try {}catch(Exception e) {}
		return null;
		
	}
}