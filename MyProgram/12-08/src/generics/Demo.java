package generics;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		Container<B> a = new Container();
		a.value=new C();
		a.demo(new ArrayList<A>());
		a.demo(new LinkedList<C>());
	}

}
class A{}
class B extends A {}
class C extends B {}
class D extends C{}

class Container<T extends A>//Accepts sub class Of A
{
	T value;
	
	public void demo(ArrayList<? super T> a) {}//Accepts super class Of T
	
	public void demo(LinkedList<? extends  T> a) {}//Accepts sub class Of T
}
