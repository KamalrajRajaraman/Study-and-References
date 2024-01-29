//
//package ReflectionDemo;
//
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//import java.lang.reflect.Type;
//import java.util.Scanner;
//
//import PracticePrograms.Corona;
//import PracticePrograms.Disease;
//import PracticePrograms.DiseaseParent;
//
//public class Assignment {
//	 
//	public static void main(String[] args) throws Exception {
//		Scanner scan = new Scanner(System.in);
//		DiseaseParent corona = new Corona();
//
//		System.out.println("Please enter the property name...:");
//		System.out.println("property names are..:name,infectious,c,s");
//
//		String propertyName = scan.next();
//		System.out.println(getPropertyName(corona, propertyName));
//	}
//
//	public static Object getPropertyName(DiseaseParent obj, String propertyName) throws Exception {
//		Class className = null;
//		try {
//			if (obj != null) {
//				className = obj.getClass();
//			} else {
//				throw new NoSuchFieldException("Field Not Available");
//			}
//			if (className == Object.class) {
//				throw new NoSuchFieldException("Field Not Available");
//			}
//			return callGetterRecursively(obj, propertyName, className);
//		} catch (NoSuchFieldException | NoSuchMethodException e) {
//			System.out.println("catch... Field Not Available");
//			e.printStackTrace();
//			return null;
//		}
//
//	}
//
//	private static Object callGetterRecursively(DiseaseParent obj, String propertyName, Class className)
//			throws Exception {
//		if (className == null || className == Object.class) {
//			throw new NoSuchFieldException("Field Not Available");
//		}
//
//		try {
//			Class na=new Corona().getClass();
//			Method method = na.getDeclaredMethod(getGetterMethodName(propertyName, className));
//			if (method != null) {
//				return method.invoke(new Corona());
//			}
//		} catch (Exception e) {
//			System.out.println(" Field Not Available");
//		}
//		return callGetterRecursively(obj, propertyName, className.getSuperclass());
//	}
//
//	private static String getGetterMethodName(String propertyName, Class className) throws Exception {
//		char firstChar = Character.toUpperCase(propertyName.charAt(0));
//		
//		Field field = className.getDeclaredField(propertyName);
//		//System.out.println("field executed....."+field.get(corona));
//		//Type type = field.getType();
//		if (field.getType().getName().equals("boolean")) {
//			if (propertyName.length() == 1) {
//				return "is" + firstChar;
//			}
//			return "is" + firstChar + propertyName.substring(1);
//		}
//		if (propertyName.length() == 1) {
//			return "get" + firstChar;
//		}
//		//System.out.println("get" + firstChar + propertyName.substring(1));
//		return "get" + firstChar + propertyName.substring(1);
//	}
//
//}
//
//class DiseaseParent {
//
//}
//
//class Disease extends DiseaseParent {
//	public String name = "infectious";
//	public boolean infectious = true;
//	String c = "a";
//	boolean s = false;
//}
//
//class Corona extends Disease {
//	public String getName() {
//		return this.name;
//	}
//
//	public boolean isInfectious() {
//		return infectious;
//	}
//
//	String getC() {
//		return this.c;
//	}
//
//	boolean isS() {
//		return this.s;
//	}
//}