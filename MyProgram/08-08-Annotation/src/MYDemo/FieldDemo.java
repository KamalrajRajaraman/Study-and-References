package MYDemo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class FieldDemo {
	public static void main(String[] args) {
		
	}
}
@Retention(RetentionPolicy.RUNTIME)
@interface MyField{
	String name();
}
class MyStudent
{
	@MyField(name ="MystudentField")
	String str ="this is an example";
}
