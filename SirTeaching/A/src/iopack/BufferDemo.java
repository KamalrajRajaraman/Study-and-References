package iopack;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
public class BufferDemo {
	public static void main(String[] args)throws Exception {
		String str="jack and &copy; jill went up &copy; the &copy hill to fetch a .....";
		
		ByteArrayInputStream bis=new ByteArrayInputStream(str.getBytes());
		BufferedReader br=new BufferedReader(new InputStreamReader(bis));
		
		int i=0;
		char c=0;
		boolean marked=false;
		while((i=br.read())!=-1) {
			c=(char)i;
			switch(c){
			case '&':{
				br.mark(50);
				marked=true;
				break;
			}
			case ';':{
				if(marked) {
					System.out.print((char)169);
					marked=false;
				}
				break;
			}
			case ' ':{
				if(marked) {
					br.reset();
					System.out.print("&");
					marked=false;
				}else {
					System.out.print(" ");
				}
				break;
			}
			default:{
				if(!marked) {
					System.out.print(c);
				}
			}
			}
		}
	}
}
