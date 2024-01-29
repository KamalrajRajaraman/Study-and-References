package Unit;

import java.util.LinkedList;
import java.util.Queue;

public class Collection {
	public static void main(String[] args) {
		
		
		ll c = new ll();
		li l1 = c;
		l1.m1();
		
		ll d =(ll) l1;
		d.m1();
		d.m2();
	
		
	}
}

class li {
	 void m1() {
		 System.out.println("hiA");
	 }
}

class ll extends li{

	@Override
	public void m1() {
		System.out.println("hi");
		
	}
	public void m2() {
		System.out.println("him2");
		
	}
	
	
	

	
	
	
	
}