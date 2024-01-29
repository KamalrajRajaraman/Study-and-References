package colpack;

import java.util.HashSet;
import java.util.Set;

public class UtilDemo8 {
	public static void main(String[] args) {
		Set<String> hs=new HashSet<>();
		hs.add("banana");
		hs.add("jack");
		hs.add("apple");
		hs.add("orange");
		
		System.out.println(hs);
		
		Iterator<String> iter=hs.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		hs.forEach(System.out::println);
		
		System.out.println(hs.contains("jack"));
		Object o[]=hs.toArray();
		for(Object oo:o) {
			System.out.println((String)oo);
		}
		System.out.println(hs.size());
		System.out.println(hs.remove("jack"));
		System.out.println(hs.size());
		hs.removeAll(hs);
		System.out.println(hs.size());
		
		
	}
}




