
public class Demo2 {
	public static void main(String[] args) {
		System.out.println("main starts");
		
		B b1 = new B();
		
		Thread t1 = new Thread(b1);
		t1.start();
		
		
		System.out.println("main ends 1");
	}
}
class B implements Runnable{
	@Override
	public void run() {
		
			
			System.out.println("i am implement");
		
		
	}
}