package threadpack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ClassLockDemo {
	public static void main(String[] args) {
		CinemaHall s1=new CinemaHall();
		CinemaHall s2=new CinemaHall();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new Runnable() {			
			@Override
			public void run() {
				synchronized(Toilet.class) {//class lock
				Thread.currentThread().setName("kamal");
				CinemaHall.toilet.useToilet();
				}
			}
		});
		es.execute(new Runnable() {			
			@Override
			public void run() {
				synchronized(Toilet.class) {
				Thread.currentThread().setName("rajini");
				CinemaHall.toilet.useToilet();
				}
			}
		});
		es.shutdown();
	}
}
class CinemaHall{
	static Toilet toilet=new Toilet();//class variable
	public CinemaHall() {
		System.out.println("cinema hall object created...");
	}
}
class Toilet{
	public Toilet() {
		System.out.println("toilet object created...");
	}
 public void useToilet() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is using the toilet...");
		try {Thread.sleep(2000);}catch(Exception e) {}
		System.out.println(name+" is comming out of toilet...");
	}
}


