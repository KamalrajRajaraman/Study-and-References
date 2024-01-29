package action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.UserService;
import service.UserServices;

public class LogoutAction extends Action implements Cloneable {

	private static LogoutAction logout;

	private LogoutAction() {
		System.out.println("logout action Object Created...");
	}

	public static LogoutAction getInstance() {
		if (logout == null) {
			return logout = new LogoutAction();
		}
		return logout.getClone();

	}

	public LogoutAction getClone() {
		LogoutAction logout = null;
		try {
			logout = (LogoutAction) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return logout;
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("uname");
		UserService service = UserServices.getUserService();
		service.UpdateFlag(0, username);
		return "logout.success";

	}
}
