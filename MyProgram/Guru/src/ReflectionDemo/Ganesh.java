package ReflectionDemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ganesh {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, InstantiationException {
		
		Class.forName("ReflectionDemo.ABC");
			
	}
}
class ABC{
	static {
		System.out.println(" iam static");
	}
}
class EFG extends ABC
{
	
	
}