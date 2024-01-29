package logix;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.util.Properties;
public class UtilDemo14 {
	public static void main(String[] args) throws Exception{
		Properties prop=new Properties();
		prop.load(new FileInputStream("dictionary_ta.properties"));
		
		String result=(String)prop.get("hello");
		
//		FileWriter out=new FileWriter("abc.html",Charset.forName("UTF-8"));
//		
//		
//		out.write("<!DOCTYPE html>\r\n"
//				+ "<html>\r\n"
//				+ "<head>\r\n"
//				+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n"
//				+ "<title>Insert title here</title>\r\n"
//				+ "</head>");
//		out.write("<body>");
//		out.write(result);
//		out.write("</body></html>");
//		
//		out.close();
		
	}
}



	
