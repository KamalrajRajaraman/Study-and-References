package Courier;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
public class UtilDemo15 {
	public static void main(String[] args)throws Exception {
		Locale locale=Locale.getDefault();
		
		System.out.println(locale);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter ta for tamil and te for telugu..:");
		String lang=scan.nextLine();
		locale=new Locale(lang);
		Locale.setDefault(locale);
		
		locale=Locale.getDefault();
		
		System.out.println(locale);
		
		ResourceBundle rb=ResourceBundle.getBundle("dictionary",locale);
		
		String result=rb.getString("hello");
		
		FileWriter out=new FileWriter("abc2.html",Charset.forName("UTF-8"));
		
		
		out.write("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>");
		out.write("<body>");
		out.write(result);
		out.write("</body></html>");
		out.close();
	}
}