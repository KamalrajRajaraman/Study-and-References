package colpack;

import javax.lang.model.element.Element;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.Node;

public class DomDemo {
	public static void main(String[] args) throws Exception{
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder db=dbf.newDocumentBuilder();
		
		Document doc= (Document) db.parse("books.xml");
		
		Element rootelement=doc.getDocumentElement();
		
		System.out.println(rootelement.getNodeName());
		
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

