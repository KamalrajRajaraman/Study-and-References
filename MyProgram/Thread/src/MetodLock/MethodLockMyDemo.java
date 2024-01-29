package MetodLock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MethodLockMyDemo {
	public static void main(String[] args) {
		System.out.println("main starts");
		A a1= new A();
		ExecutorService es =Executors.newFixedThreadPool(3);
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("Kamal");
				
					A.m1();
				
				
				
			}
		});
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("Hari");
				A.m2();
				
			}
		});
		
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("Ganesh");
				A.m3();
				
			}
		});
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				Thread.currentThread().setName("super Hari");
				A.m2();
			}
		};
		t1.start();
		System.out.println("main ends");
	}


}
class A{
	synchronized static public void m1() {
		String name = Thread.currentThread().getName();
		
		System.out.println(name+"m1 Stats");
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+"m1 ends");
	}
	synchronized static public void m2() {
		String name = Thread.currentThread().getName();
		System.out.println(name+"m2 Stats");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+"m2 ends");
	}
	 static public void m3() {
		String name = Thread.currentThread().getName();
		System.out.println(name+"m3 Stats");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+"m3 ends");
	}
}