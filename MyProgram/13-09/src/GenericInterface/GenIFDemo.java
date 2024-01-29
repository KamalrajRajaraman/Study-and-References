package GenericInterface;

public class GenIFDemo {
	public static void main(String[] args) {
		Integer[] iob = {2,5,8,9};
		Character[] cob = {'b','n','a'};
		
		Myclass<Integer> iOb = new Myclass<>(iob);
		Myclass<Character> cOb = new Myclass<>(cob);
		
		System.out.println("max :"+iOb.max());
		System.out.println("min :"+iOb.min());
		
		System.out.println("max :"+cOb.max());
		System.out.println("min :"+cOb.min());
	}
}
