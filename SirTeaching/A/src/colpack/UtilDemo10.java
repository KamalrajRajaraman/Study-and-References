package colpack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UtilDemo10 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String, String>();
		
		map.put("b1", "anand");
		map.put("a1", "zain");
		map.put("z1", "badr");
		
		System.out.println(map);
		
		System.out.println(map.get("z1"));
		
		Set<Map.Entry<String, String>> set=map.entrySet();
		
		Iterator<Map.Entry<String,String>> iter=set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String,String> me=iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}
}


