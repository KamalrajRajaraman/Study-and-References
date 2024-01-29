package _09_08_Dem03;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
public class AnnoDemo2 {
	public static void main(String[] args) {
		AnnoSam obj=new AnnoSam();
		Class c=obj.getClass();
		MyAnno myan=(MyAnno)c.getAnnotation(MyAnno.class);
		System.out.println(myan.name());
	}
}
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	String name() default "hello";
}
@MyAnno(name="this is not default")
class AnnoSam{
	
	String s;
}