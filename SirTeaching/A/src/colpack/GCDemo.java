package colpack;

import java.lang.ref.SoftReference;

public class GCDemo {
	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Before Birth of Tatha..:"+r.freeMemory());
		Tatha tatha=new Tatha();
		System.out.println("After Birth of Tatha...:"+r.freeMemory());
		SoftReference<Tatha> soft=new SoftReference<Tatha>(tatha);
		tatha=null;
		System.out.println(tatha);
		System.out.println("After Death of Tatha..:"+r.freeMemory());
		System.out.println("sadangu......for tatha....");
		r.gc();
		System.out.println("After sadangu of tatha...:"+r.freeMemory());
		tatha=soft.get();
		System.out.println(tatha.getGold());
		
	}
}
class Tatha{
	String age=new String("1");
	private String gold="under the banyan tree....";
	public Tatha() {
		for(int i=0;i<10000;i++) {
			age=new String(i+"... "+i);
		}
	}
	protected String getGold() {
		return this.gold;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println(getGold());
	}
}
