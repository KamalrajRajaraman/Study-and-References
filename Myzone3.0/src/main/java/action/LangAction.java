package action;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LangAction extends Action implements Cloneable {

	private static LangAction lang;

	private LangAction() {
		System.out.println("LangAction Object Created...");
	}

	public static LangAction getInstance() {
		if (lang == null) {
			return lang = new LangAction();
		}
		return lang.getClone();

	}

	public LangAction getClone() {
		LangAction lang = null;
		try {
			lang = (LangAction) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return lang;
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String lang = request.getParameter("language");
		ResourceBundle rb =ResourceBundle.getBundle("dictionary", new Locale(lang));
		ServletContext app = request.getServletContext();
		app.setAttribute("rb", rb);
		return "lang.success";
		
		
	}

}
