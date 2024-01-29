package SetSemo;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
public class UtilDemo11 {
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		
		String k1=new String("key1");
		String k2=new String("key2");
		
		map.put(k1, "anand");
		map.put(k2, "zain");
		
		System.out.println(map);
		k1=null;
		System.gc();
		System.out.println(map);
	}
}