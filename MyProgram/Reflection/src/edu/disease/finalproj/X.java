package edu.disease.finalproj;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class B extends A{
	public void m2() {
		System.out.println("hi m2");
	}
	
}

public class X{
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		B b1 = new B();
		Class c = b1.getClass();
		Method m = c.getMethod("m2");
		m.invoke(b1);
	}
}