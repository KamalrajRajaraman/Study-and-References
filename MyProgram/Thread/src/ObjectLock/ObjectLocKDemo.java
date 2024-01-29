package ObjectLock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ObjectLocKDemo {
	public static void main(String[] args) {
		Reservation central = new Reservation();
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(new Thread() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("Kamal");
				central.bookTicket(100);
				central.getChange();
			}
		});
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("Rajini");
				central.bookTicket(500);
				central.getChange();
			}
		});
		es.shutdown();
	}
}
