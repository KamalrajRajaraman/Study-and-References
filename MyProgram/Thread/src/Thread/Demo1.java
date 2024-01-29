package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TJob implements Runnable{

	@Override
	public void run() {
		Thread t =Thread.currentThread();
		System.out.println(t);
		System.out.println("thread....");
		
	}
	
}
class T2Job implements Callable<String>{

	@Override
	public String call() throws Exception {
	
		return "KAMAL";
	}

	
	
}
public class Demo1 {
	public Demo1() {
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(new  TJob());
		ExecutorService es1 =  Executors.newFixedThreadPool(1);
		Future<String> s =es1.submit(new  T2Job());
		System.out.println(s);
	}
	public static void main(String[] args) {
		new Demo1();
		new Demo1();
		new Demo1();
		
		System.out.println("main");
	}
}
