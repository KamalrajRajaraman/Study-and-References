package Refering;

public class ConstructorRefering {
	public ConstructorRefering() {
		System.out.println("hi");
	}
	private static  String m1() {
		return "HEllo";

	}

	public static void main(String[] args) {
		run x = A::new;
		x.m1();
		
		System.out.println(x instanceof A);
	
		
		
		
	}
}
interface run{
		void m1();
		String toString();
}
class A implements run{
	public A() {
		System.out.println("A cons");
	}
	public   void m1() {
		System.out.println("m1");

	}
}
class B extends A{
	public  void m1() {
		System.out.println("m1");

	}
	Runnable x = super::m1;
}