package ThreadDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadBasicDemo{
	public ThreadBasicDemo() throws InterruptedException, ExecutionException {
			ExecutorService es = Executors.newFixedThreadPool(1);
			Runnable a =(Runnable) es.submit(new ThreadJob2()).get();
			es.execute(a);
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		new ThreadBasicDemo();
		System.out.println("Main Thread is Executed.....");
	}
}
class ThreadJob implements Runnable{
	public ThreadJob() {
		System.out.println("ThreadJob Constructor Called.....");
		
	}
	@Override
	public void run() {
		System.out.println("Child Thread is Executed.....");
	}
}
class ThreadJob2 implements Callable{

	@Override
	public Object call() throws Exception {
		System.out.println("Callable Thread is Executed......");
		return new ThreadJob();
	}
	
}