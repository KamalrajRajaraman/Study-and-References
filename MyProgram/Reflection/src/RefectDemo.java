import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import edu.disease.finalproj.A;
import edu.disease.finalproj.X;

public class RefectDemo {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
		A a = new A();
		Class gotClassName = a.getClass();
		System.out.println(gotClassName);
		
		Field gotName = gotClassName.getDeclaredField("name");
		System.out.println(gotName);
		gotName.setAccessible(true);
		System.out.println(gotName.get(a));
		
//		Method gotMethod = gotClassName.getDeclaredMethod("m1");
//		gotMethod.setAccessible(true);
//		gotMethod.invoke(a);
	//	Class<Integer> a1;
		
		
		
		Method gotMethod1 = gotClassName.getDeclaredMethod("m1",int.class);
		System.out.println(gotMethod1);
		gotMethod1.setAccessible(true);
		gotMethod1.invoke(a,5);
		
		
//		Constructor gotConstructor = A.class.getConstructor();
//		System.out.println(gotConstructor);
		
//		Constructor gotConstructor = B.class.getDeclaredConstructor();
//		gotConstructor.setAccessible(true);
//		System.out.println(gotConstructor);
//		
//		B b1 = (B) gotConstructor.newInstance();
//		b1.m1();
		
		Constructor gotConstructor2 = B.class.getDeclaredConstructor(int.class);
		gotConstructor2.setAccessible(true);
		
		B b2 = (B) gotConstructor2.newInstance(6);
		b2.m1();
		
		
	}
}
class A{
	
	private String name ="kamal";
	
	private void m1() {
		System.out.println("I am Private...");
	}
	private void m1(int a) {
		System.out.println("I am Private "+a);
	}
	
}

class B{
	
	private B(int a) {
		System.out.println("i am Arg Const");
	}
//	private B() {
//		// TODO Auto-generated constructor stub
//	}
	public void m1() {
		System.out.println("In B");

	}
}