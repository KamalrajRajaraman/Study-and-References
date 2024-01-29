package MetodLock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class MethodLockDemo {
	public static void main(String[] args) {
		CounsellingHall annahall=new CounsellingHall();
		ExecutorService es=Executors.newFixedThreadPool(3);
		es.execute(new Runnable() {			
			@Override
			public void run() {										
				Thread.currentThread().setName("kamal");
				annahall.table1();
				annahall.table2();
				annahall.table3();
			}
		});
		es.execute(new Runnable() {			
			@Override
			public void run() {			
				Thread.currentThread().setName("rajini");				
				annahall.table1();
				annahall.table2();
				annahall.table3();
				}			
		});
		es.execute(new Runnable() {
			@Override
			public void run() {
				Thread.currentThread().setName("gokul");
				annahall.sideDish();
				annahall.sideDish();
			}
		});
		es.shutdown();
	}
}
class CounsellingHall{
	 synchronized public void table1() {
		String name=Thread.currentThread().getName();
		System.out.println(name+" is in table1....");
		try {Thread.sleep(2000);}catch(Exception e) {}
		System.out.println(name+" is out of table 1...");
	}
	 synchronized  public void table2() {
		String name=Thread.currentThread().getName();
		System.out.println(name+" is in table2....");
		try {Thread.sleep(1500);}catch(Exception e) {}
		System.out.println(name+" is out of table 2...");
	}
	 synchronized  public void table3() {
		String name=Thread.currentThread().getName();
		System.out.println(name+" is in table3....");
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println(name+" is out of table 3...");
	}
	public void sideDish() {
		String name=Thread.currentThread().getName();
		System.out.println(name+" is in food area....");
		try {Thread.sleep(500);}catch(Exception e) {}
		System.out.println(name+" is out of food area...");
	}
}