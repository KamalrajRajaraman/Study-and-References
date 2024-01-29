
public class Synchronise {
	
	public static void main(String[] args) throws InterruptedException {
		C c1 = new C();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 0;i<1000;i++) {
					c1.increment();
				}

			}
			
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i = 0;i<1000;i++) {
					c1.increment();
				}

			}
			
		};
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c1.count);
	}

}
class C{
	int count;
	synchronized public void increment() {
		count++;
	}
}
