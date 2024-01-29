package ClassLock;

public class Toilet {
	public Toilet() {
		System.out.println("Toilet Object is created....");
	}
	public void useToilet() throws InterruptedException {
		String name = Thread.currentThread().getName();
		System.out.println(name+"is using Toilet");
		Thread.sleep(2000);
		System.out.println(name+"is coming out of Toilet");		
	}
	
}
