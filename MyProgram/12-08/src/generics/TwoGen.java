package generics;
/*class TwoGen<T, V>
 * It specifies two type parameters: T and V, separated by a comma.
 * 
 * Because it
has two type parameters, two type arguments must be passed to TwoGen when
an object is created

	TwoGen<Integer,String> obj = new TwoGen<>(123,"kamal");
	
	 
 A parameter is a variable defined by a method that receives a value when the
method is called. For example, in square( ), i is a parameter. An argument is a
value that is passed to a method when it is invoked. For example, square(100)
passes 100 as an argument
*/
public class TwoGen<T,V>{
	T ob1;
	V ob2;
	public TwoGen(T o1,V o2) {
		ob1=o1;
		ob2 =o2;
	}
	
	public T getOb1(){
		return ob1;
	}
	
	public V getOb2() {
		return ob2;
	}
	
	public void showType() {
		System.out.println(ob1.getClass().getName());
		System.out.println(ob2.getClass().getName());
	}
	
	

}
