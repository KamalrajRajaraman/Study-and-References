package colpack;

import java.util.concurrent.ExecutorService;

public class UtilDemo3 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.execute(()->{
			Thread.currentThread().setName("ramuramu");
			Suitcase s=new Suitcase("adidas");
			System.out.println("suitacase set..:"+s+"of user..:"+Thread.currentThread().getName());
			ClockRoom.setLuggage(s);
			System.out.println(ClockRoom.getLuggage()+"of user..:"+Thread.currentThread().getName());
			ClockRoom.removeLuggage();
			try {Thread.sleep(5000);}catch(Exception e) {}
//			s=new Suitcase("newvip");
//			System.out.println("suitacase set..:"+s+"of user..:"+Thread.currentThread().getName());
//			ClockRoom.setLuggage(s);
			System.out.println(ClockRoom.getLuggage()+"of user..:"+Thread.currentThread().getName());
			
		});
		es.execute(()->{
			Thread.currentThread().setName("somusomu");
			Suitcase s=new Suitcase("vip");
			System.out.println("suitacase set..:"+s+"of user..:"+Thread.currentThread().getName());
			ClockRoom.setLuggage(s);
			System.out.println(ClockRoom.getLuggage()+"of user..:"+Thread.currentThread().getName());
		});
		
		es.shutdown();
	}
}
class ClockRoom{
	private static ThreadLocal<Suitcase> tlocal=new ThreadLocal<Suitcase>();
	
	public static Suitcase getLuggage() {
		Suitcase s=tlocal.get();
		if(s!=null) {
			return s;
		}
		else {
			return null;
		}
	}
	public static void setLuggage(Suitcase sc) {
		Suitcase s=tlocal.get();
		if(s==null) {
			tlocal.set(sc);
		}
		else {
			System.out.println("already set....");
		}
	}
	
	public static void removeLuggage() {
		Suitcase s=tlocal.get();
		if(s!=null) {
			tlocal.remove();
		}
	}
}
class Suitcase{
	String name;
	public Suitcase(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return name+":suitcase";
	}
}


