package Thread;

public class Synchronise {
	
	public static void main(String[] args) throws InterruptedException {
		C c1 = new C();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				
					c1.m1();
				

			}
			
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				
					c1.m2();
				

			}
			
		};
		t1.start();
		t2.start();
		
	}

}

