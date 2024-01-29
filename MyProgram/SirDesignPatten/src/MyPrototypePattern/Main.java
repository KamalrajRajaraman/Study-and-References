package MyPrototypePattern;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Hari h = new Hari();
		Hari h1 =(Hari) h.clone();
		
		h.Office ="VastPro";
		h1.Office ="Not Work";
		h1.Office=" Work";
		System.out.println(h.Office);
		System.out.println(h1.Office);
	}
}
