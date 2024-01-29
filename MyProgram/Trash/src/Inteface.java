import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Inteface {
	public static void main(String[] args) {
		A98 a = new A98();
		Class c = a.getClass();
		Course d =(Course) c.getAnnotation(Course.class);
		System.out.println(d.name());
		
		Class f = Course.class;
		f.getMethods()
	}
}
@Course
class A98{
	void m1() {
		
	}

}
@Retention(RetentionPolicy.RUNTIME)
@interface Course{
	String name() default "kamal";
}