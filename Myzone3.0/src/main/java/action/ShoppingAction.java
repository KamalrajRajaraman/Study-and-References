package action;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingAction extends Action implements Cloneable{
	
	private static ShoppingAction shoppingAction;

	private ShoppingAction() {
		System.out.println("ShoppingAction Object Created...");
	}

	public static ShoppingAction getInstance() {
		if (shoppingAction == null) {
			return shoppingAction = new ShoppingAction();
		}
		return shoppingAction.getClone();

	}

	public ShoppingAction getClone() {
		ShoppingAction shoppingAction = null;
		try {
			shoppingAction = (ShoppingAction) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return shoppingAction;
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
	
		String shopid =request.getParameter("shopid");
		HttpSession session = request.getSession();
		List<String> list =(List<String>) session.getAttribute("list");
		Enumeration<String> e = request.getParameterNames();
		
		while(e.hasMoreElements()) {
			
			String name = e.nextElement().toString();
			if(!(name.equals("shopid")||name.equals("formid"))) {
				String value =request.getParameter(name);
				list.add(value);
			}
		}
		return shopid+".success";
		
	}

}
