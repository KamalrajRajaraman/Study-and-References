
public class StaticDemo {
	public static void main(String[] args) {
		TraningRoom t1 = new TraningRoom();
		
		TraningRoom t2 = new TraningRoom();
		
	}
	
}
class TraningRoom{
	/*public TraningRoom() {
		System.out.println("TR is created");
	}*/
	Projector p1 = new Projector();
	static Toilet t1 = new Toilet();
	
}
















class Projector{
	public Projector() {
		System.out.println("P is created");
	}
}
class Toilet{
	public Toilet() {
		System.out.println("T is created");
	}
}

