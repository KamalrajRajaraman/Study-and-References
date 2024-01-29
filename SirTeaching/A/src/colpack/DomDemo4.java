package colpack;
public class DomDemo4 {
	public static void main(String[] args) throws Exception{
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		dbf.setValidating(true);
		dbf.setIgnoringElementContentWhitespace(true);
		DocumentBuilder db=dbf.newDocumentBuilder();
		
		Document doc= db.parse("books.xml");
		
		System.out.println(doc.getDocumentElement().getChildNodes().getLength());
				
	}
}


