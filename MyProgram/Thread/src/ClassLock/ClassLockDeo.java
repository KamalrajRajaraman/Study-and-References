package ClassLock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClassLockDeo {
	public static void main(String[] args) {
		CinemaHall c1 = new CinemaHall();
		CinemaHall c2 = new CinemaHall();
		ExecutorService es =Executors.newFixedThreadPool(2);
		
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				synchronized (Toilet.class) {
					Thread.currentThread().setName("kamal");
					try {
						CinemaHall.toilet.useToilet();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				
				
			}
		});
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				synchronized (Toilet.class) {
					Thread.currentThread().setName("rajini");
					try {
						CinemaHall.toilet.useToilet();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				
				
			}
		});
	}
}
