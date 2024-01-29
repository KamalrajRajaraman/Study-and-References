package basics;
public class OverRidingDemo {
	public static void main(String[] args) {
		OverRide or=new SubOverRide();
		or.met();
	}
}
class Hall {
	public Hall() {
		System.out.println("super class object created...");
	}
	public void met() {
		System.out.println("over ride class method called..");
	}
}
class MarriageHall extends Hall{
	public MarriageHall() {
		System.out.println("sub class object created....");
	}
}