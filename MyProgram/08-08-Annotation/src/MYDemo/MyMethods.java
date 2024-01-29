package MYDemo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class MyMethods {
	public static void main(String[] args) throws Exception {
		System.out.println("hi");
		Class c = new Students().getClass();
        Method m = c.getDeclaredMethod("read");
        Mymethod ann = (Mymethod) m.getAnnotation(Mymethod.class);
		System.out.println(ann);
		System.out.println(ann.name());
		
	}
}

@Retention(RetentionPolicy.RUNTIME)
@interface Mymethod{
	String name();
}

class Students{
	@Mymethod(name = "CompleteReference")
	public void read() {
		
	}
}