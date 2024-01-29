package MYDemo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ClassAnno {
	public static void main(String[] args) {
		 Class c = new Student().getClass();
		 MYclass ann = (MYclass) c.getAnnotation( MYclass.class);
		 System.out.println(ann);
		 System.out.println(ann.name());
	}
}


@Retention(RetentionPolicy.RUNTIME)
@interface MYclass{
	String name();
}

@MYclass(name = "Kamal")
class Student{
	
}