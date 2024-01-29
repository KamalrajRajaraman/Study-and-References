package threadpack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ObjectLock {
	public static void main(String[] args) {
		ReservationCounter central=new ReservationCounter();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new Runnable() {			
			@Override
			public void run() {
				synchronized (central) {							
				Thread.currentThread().setName("kamal");
				central.bookTicket(1000);				
				central.giveChange();
				}
			}
		});
		es.execute(new Runnable() {			
			@Override
			public void run() {
				synchronized(central) {
				Thread.currentThread().setName("rajini");
				central.bookTicket(500);			
				central.giveChange();
				}
			}
		});
		es.shutdown();
	}
}
class ReservationCounter{
	int amt;
	public void bookTicket(int amt) {
		String name=Thread.currentThread().getName();
		this.amt=amt;
		System.out.println(name+" is booking the ticket...");
	}
	public void giveChange() {
		String name=Thread.currentThread().getName();
		amt=amt-100;
		System.out.println("The Change.."+amt+" is given to.."+name);
	}
}



