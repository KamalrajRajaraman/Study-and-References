package edu.disease.finalproj;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Scanner;
@SuppressWarnings("All")
public class Assignment {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		Disease corona = new Corona();

		System.out.println("Please enter the property name...:");
		System.out.println("property names are..:name,infectious,c,s");
		String p = scan.nextLine();
		
		Class c = corona.getClass();
		
		
		String str =findType(c, p);
		if(!str.equals("Field Not Exist..")) {
			Method m = c.getDeclaredMethod(str);
			System.out.println(m.invoke(corona));
		}
		else {
			System.out.println(str);
		}
		
	}

	public static boolean doesObjectContainField(Class object, String fieldName) {

		for (Field field : object.getDeclaredFields()) {
			if (field.getName().equals(fieldName)) {
				return true;
			}
		}
		return false;
	}
	static String genericType(Type type,String p) {
		if(type== boolean.class) {
			String str = "is" + p.substring(0, 1).toUpperCase() + p.substring(1);
			return str;
		}
		String str = "get" + p.substring(0, 1).toUpperCase() + p.substring(1);
		return str;
	}
	
	static String findType(Class c, String p ) throws NoSuchFieldException, SecurityException, NoSuchMethodException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		if(c==Object.class) {
			return "Field Not Exist..";
		}
		if (doesObjectContainField(c, p)) {
			Field f = c.getDeclaredField(p);
			String str =genericType(f.getGenericType(), p) ;
			return str;	
		} 
		Class c1 = c.getSuperclass();
		return findType(c1, p );

	}
	static void invokeMethod(Class c,String method) {
		
		for(Method m :c.getDeclaredMethods() ) {
			if(method.equals(m.getName())) {
				
			}
		}
		
		
	}

}
class dis{
	String c = "a";
	boolean s = false;
}
class Disease extends dis{
	public String name = "infectious";
	public boolean infectious = true;
	public String getName() {
		return this.name;
	}

}

class Corona extends Disease {

	
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