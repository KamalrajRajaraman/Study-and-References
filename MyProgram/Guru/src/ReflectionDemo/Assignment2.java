package ReflectionDemo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		DiseaseParent corona = new Corona();

		System.out.println("\t: PROPERTIES ARE :\n--> Name\n--> Infectious\n--> C\n--> S");
		System.out.print("Please Enter the Property Name :: ");

		String propertyName = input.next();
		if(getPropertyName(corona, propertyName)!=null)
				System.out.println(getPropertyName(corona, propertyName));
	}

	private static Object getPropertyName(DiseaseParent corona, String propertyName) throws Exception {
		Class currentClass = corona.getClass();
		return callGetterMethodRecursively(corona, propertyName, currentClass);
	}

	private static Object callGetterMethodRecursively(DiseaseParent corona, String propertyName, Class currentClass)
			throws Exception {
		if (currentClass == null || currentClass == Object.class) {
			return null;
		}
		try {
			// Class clazz = corona.getClass();
			String str = getMethodName(currentClass, propertyName);
			System.out.println(str);
			Method method = currentClass.getDeclaredMethod(str);
			System.out.println("hi");
			if (method != null)
				method.invoke(corona);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(currentClass);
			System.err.println("Field is Not-Available");
		}
		return callGetterMethodRecursively(corona, propertyName, currentClass.getSuperclass());
	}

	private static String getMethodName(Class currentClass, String propertyName) throws Exception {
		char firstChar = Character.toUpperCase(propertyName.charAt(0));
		Field field = currentClass.getDeclaredField(propertyName);
		if (field.getType() == Boolean.class) {
			return "is" + firstChar + propertyName.substring(1);
		}
		return "get" + firstChar + propertyName.substring(1);
	}
}

class DiseaseParent {

}

class Disease extends DiseaseParent {
	public String name = "infectious";
	public boolean infectious = true;
	String c = "a";
	boolean s = false;
}

class Corona extends Disease {
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