
public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main starts");
		A a1 = new A();
		a1.start();	
		System.out.println("main ends 1");
		
		a1.join();
		System.out.println("main ends 2");
		
	}
}
class A extends Thread{
	@Override
	public void run() {
		System.out.println("i am Thread");
	}
	
}
