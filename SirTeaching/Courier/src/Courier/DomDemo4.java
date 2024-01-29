package Courier;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class DomDemo4 {
	public static void main(String[] args) throws Exception{
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		
		dbf.setValidating(true);
		
		dbf.setIgnoringElementContentWhitespace(true);
		
		DocumentBuilder db=dbf.newDocumentBuilder();
		
		Document doc= db.parse("Books.xml");
		
		System.out.println(doc.getDocumentElement().getChildNodes().getLength());
				
	}
}






