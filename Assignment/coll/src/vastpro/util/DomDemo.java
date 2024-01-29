package vastpro.util;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
public class DomDemo {
	public static void main(String[] args) throws Exception{
		
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder db=dbf.newDocumentBuilder();
		
		Document doc= db.parse("books.xml");
		doc.getDocumentElement().normalize();
		
		Element rootelement=doc.getDocumentElement();
		
		System.out.println("Books :: "+rootelement.getChildNodes().getLength());
		
		Node n1=rootelement.getFirstChild();
		
		System.out.println(n1.getNodeName());
		
		Node n2=n1.getFirstChild();
		
		System.out.println(n2.getNodeType());
		
		System.out.println(n2.getNodeName());
		
		Node n3=n2.getFirstChild();
		
		System.out.println(n3.getNodeType());
		
		System.out.println(n3.getNodeValue());
		
	}
}