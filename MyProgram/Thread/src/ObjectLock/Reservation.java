package ObjectLock;

public class Reservation {
	int amt;
	public void bookTicket(int amt) {
		String name = Thread.currentThread().getName();
		this.amt=amt;
		System.out.println(name+"is booking Ticket");
	}
	public void getChange() {
		amt=amt-100;
		String name = Thread.currentThread().getName();
		System.out.println("The Change"+amt+"is given to "+name);
	}
}
