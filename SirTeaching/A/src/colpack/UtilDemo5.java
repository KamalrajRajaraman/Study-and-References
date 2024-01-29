package colpack;

import java.awt.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.function.Consumer;

public class UtilDemo5 {
	public static void main(String[] args) {
		List<String> mylist=new LinkedList<String>();
		
		mylist.add("a");
		mylist.add("b");
		mylist.add("c");
		
		System.out.println(mylist);
		
		mylist.add("d");
		
		System.out.println(mylist);
		
		System.out.println(mylist.get(0));
		System.out.println(mylist.remove(0));
		System.out.println(mylist.get(0));
		System.out.println(mylist);
		
		for(int i=0;i<mylist.size();i++) {
			System.out.println(mylist.get(i));
		}
		
		for(String s:mylist) {
			System.out.println(s);
		}
		
		//mylist.stream().forEach(new MyConsumer());
		//mylist.stream().forEach((s)->{System.out.println(s);});
		mylist.stream().forEach(UtilDemo5::myprint);
		
		Object o[]=mylist.stream().toArray();
		System.out.println(o);
		
		Iterator<String> iter=mylist.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		ListIterator<String> liter=mylist.listIterator();
		while(liter.hasNext()) {
			System.out.println(liter.next());
		}
		while(liter.hasPrevious()) {
			System.out.println(liter.previous());
		}
	}
	public static void myprint(String s) {
		System.out.println(s);
	}
}
class MyConsumer implements Consumer<String>{
	@Override
	public void accept(String t) {
		System.out.println(t);
	}
}

