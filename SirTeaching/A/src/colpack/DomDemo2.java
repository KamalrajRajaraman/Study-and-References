package colpack;

import javax.lang.model.element.Element;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.NodeList;

public class DomDemo2 {
	public static void main(String[] args) throws Exception{
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder db=dbf.newDocumentBuilder();
		
		Document doc= db.parse("books.xml");
		
		Element rootelement=doc.getDocumentElement();
		
		NodeList nl= rootelement.getChildNodes();
		
		System.out.println(nl.getLength());
		
		for(int i=0;i<nl.getLength();i++) {
			for(int j=0;j<nl.item(i).getChildNodes().getLength();j++) {
				String value=rootelement.getChildNodes().item(i).getChildNodes().item(j).getFirstChild().getNodeValue();
				System.out.println("values...:"+value);
			}
		}
		
	}
}
