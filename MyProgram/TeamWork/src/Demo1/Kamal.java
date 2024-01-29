package Demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Kamal {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
//		Priya p = new Priya();
//		Class c= p.getClass();//Class TypeObject
//		System.out.println(c);
//		
//		Field  f = c.getDeclaredField("name");
//		f.setAccessible(true);
//		System.out.println(f);
//		
//		System.out.println(f.get(p));
//		
//		Priya p1 = new Priya();
//		
//		Class c1 = p1.getClass();
//		Method m1 = c1.getDeclaredMethod("m1");
//		System.out.println(m1);
//		
//		m1.setAccessible(true);
//		m1.invoke(p1);
//		
//		
//		Priya p3 = new Priya();
//		Class c2 = p3.getClass();
//		Method m2 = c2.getDeclaredMethod("m1", int.class);
//		System.out.println(m2);
//		m2.setAccessible(true);
//		m2.invoke(p3, 5);
		
		
		Class c4 = Priya.class;
		System.out.println(c4);
		
		Constructor  con = Priya.class.getDeclaredConstructor(int.class);
		System.out.println(con);
		con.setAccessible(true);
		Priya p5 =(Priya) con.newInstance(5);
		
		
		
	}
}
class Priya{
	Integer a=4;
	private String name ="Sowmiya";
	
	private void m1() {
		System.out.println("hiiii....");
	}
	
	private void m1(int a) {
		System.out.println("Print"+a);
	}
	private Priya() {
		System.out.println("Const Calll");
	}
	private Priya(int a) {
		System.out.println("args Const Calll"+a);
	}
	
}