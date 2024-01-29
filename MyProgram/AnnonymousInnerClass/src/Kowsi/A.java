package Kowsi;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class A {
	public static void main(String[] args) throws IOException {
		C b1 = new C();
		b1.m1();
	}
}
class B{
	public void m1() throws IOException
	{
		
	}
}
class C extends B{
	@Override
	public void m1() throws FileNotFoundException{
		try {
			throw new SQLException("Hari lusu");
			}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}