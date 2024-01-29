class Base{  
      public void amethod(int i) {  } 
}  
public class Scope extends Base{ 
        public static void main(String argv[]){ 
        	String s=new String("Bicycle");  
        	int iBegin=1;  
        	char iEnd=3;  
        	System.out.println(s.substring(iBegin,iEnd));
        }  
       
} 