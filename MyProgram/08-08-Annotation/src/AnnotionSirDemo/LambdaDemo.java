

package AnnotionSirDemo;
public class LambdaDemo {
	public static void main(String[] args) {
		//Gandhi Way
		MyInterL myinter=new MyInterImpl();
		myinter.met();
		
		//RajivGandhi Way
		new MyInterL() {			
			@Override
			public void met() {
				System.out.println("rajiv gandhi way...");
			}
		}.met();
		
		//Priyanka Gandhi Way - Vadhra - Method Refrencing...
		MyInterL myinter2=LambdaDemo::vadhraMet;
		myinter2.met();
		
		myinter2=new LambdaDemo()::vadhraMetNonStatic;
		myinter2.met();
		
		int x[]= {10,20,30,40};
		MyPrint myprint=LambdaDemo::print;
		for(int a:x) {
			myprint.print(a);
		}
		
		//Rahul Gandhi Way - - Lambda Way
		
		MyInterL myinterlambda=()->{System.out.println("my way seperate way....");};
		myinterlambda.met();
		myprint=(int i)->{System.out.println(i);};
		for(int a:x) {
			myprint.print(a);
		}
		
		MyInterL2 m=(String s,int i)->{return "welcome..."+s+":"+i;};
		System.out.println(m.sayHello("vaspro", 10));
		
		m=(s,i)->{return "welcome..."+s+":"+i;};
		System.out.println(m.sayHello("vaspro", 10));
	}
	public static void vadhraMet() {
		System.out.println("vadhra met way............");
	}
	public void vadhraMetNonStatic() {
		System.out.println("vadhra non static met way............");
	}
	public static void print(int i) {
		System.out.println("Value..:"+i);
	}
}
//Gandhi Way
class MyInterImpl implements MyInterL{
	@Override
	public void met() {
		System.out.println("gandhi met called...");
	}
}
interface MyInterL{
	public void met();
}
interface MyPrint{
	public void print(int i);
}
interface MyInterL2{
	public String sayHello(String name,int age);
}