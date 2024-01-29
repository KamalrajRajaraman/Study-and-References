package Reflection;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Scanner scan = new Scanner(System.in);		
		Disease corona = new Corona();
		System.out.println("Please enter the property name...:");
		System.out.println("property names are..:name,infectious,c,s");
		String p = scan.nextLine();
		
		Class c = corona.getClass();
		
		String str =findField(c, p);
		
		if(!str.equals("Field Not Exist..")) {
			invokeMethod(corona ,c, str);
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
	
	public static String getMethodName(Type type,String p) {
		if(type== boolean.class) {
			return "is" + p.substring(0, 1).toUpperCase() + p.substring(1);
		}
		return  "get" + p.substring(0, 1).toUpperCase() + p.substring(1);
	}	
	
	public static String findField(Class c, String fieldName ) throws NoSuchFieldException, SecurityException, NoSuchMethodException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		if (doesObjectContainField(c, fieldName )) {
			Field f = c.getDeclaredField(fieldName );
			return getMethodName(f.getGenericType(), fieldName ) ;
		} 
		 
		if(c==Object.class) {
			return "Field Not Exist..";
		}
		
		Class c1 = c.getSuperclass();
		return findField(c1, fieldName  );
	}
	
	public static boolean doesMethodExist(Class c,String method) {	
		for(Method m :c.getDeclaredMethods() ) {
			if(method.equals(m.getName())) {
				return true;
			}
		}
		return false;		
	}
	
	public static void invokeMethod(Disease disease,Class c, String  method) 
			throws IllegalAccessException, IllegalArgumentException, 
			InvocationTargetException, NoSuchMethodException, SecurityException  {
		
		if (doesMethodExist( c, method) ) {
			Method m =c.getDeclaredMethod(method);
			m.setAccessible(true);
			System.out.println(m.invoke(disease));
			return;
		}
		
		if (c == Object.class) {
			System.out.println("Method not Found");
			return;
		}
		
		Class c1 = c.getSuperclass();
		invokeMethod(disease,c1, method);
	}
	

}


class Dis{
	String c = "a";
	boolean s = false;
	private boolean isS() {
		return this.s;
	}
}

class Disease extends Dis{
	public String name = "infectious";
	public boolean infectious = true;
	protected  String getName() {
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
}