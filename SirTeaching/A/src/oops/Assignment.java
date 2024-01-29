package oops;
import java.util.Scanner;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class Assignment {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Disease corona=new Corona();
		System.out.println("Please enter the property name...:");
		System.out.println("property names are..:name,infectious,c,s");
		String p=scan.nextLine();
		
	}
}
class Disease{
	public String name="infectious";
	public boolean infectious=true;
	String c="a";
	boolean s=false;
}
class Corona extends Disease{
	public String getName() {
		return this.name;
	}
	public boolean isInfectious() {
		return infectious;
	}
	String getC() {
		return this.c;
	}
	boolean isS() {
		return this.s;
	}
}



