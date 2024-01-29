package colpack;

import java.util.StringTokenizer;

public class UtilDemo13 {
	public static void main(String[] args) {
		String str="jack,and,jill,went,the,hill";
		
		StringTokenizer st=new StringTokenizer(str,",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}
}


