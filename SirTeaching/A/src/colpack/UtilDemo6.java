package colpack;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UtilDemo6 {
	public static void main(String[] args) {
		List<String> mylist=new ArrayList<String>();
		
		mylist.add("zain");
		mylist.add("anand");
		mylist.add("bala");
		mylist.add("govind");
		
		System.out.println(mylist);
		
		Collections.sort(mylist,new MyComparator());
		
		System.out.println(mylist);
	}
}
class MyComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
}


