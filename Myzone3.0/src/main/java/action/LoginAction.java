package action;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService;
import service.UserServices;

public class LoginAction extends Action implements Cloneable {
	
	private static LoginAction login;

	private LoginAction() {
		System.out.println("Login action Object Created...");
	}

	public static LoginAction getInstance() {
		if (login == null) {
			return login = new LoginAction();
		}
		return login.getClone();
	}

	public LoginAction getClone() {
		LoginAction login = null;
		try {
			login = (LoginAction) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return login;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {

		String result = null;
		String userName = request.getParameter("uname");
		String password = request.getParameter("pass");
		List<String> list = new LinkedList<String>();
		UserService service = UserServices.getUserService();

		if (service.checkUser(userName))
		{
			if (service.checkPassword(userName, password)){
				if (service.checkFlag(userName)) {
					request.getSession().setAttribute("uname", userName);
					request.getSession().setAttribute("list",list);
					service.UpdateFlag(1, userName);
					result = "login.success";
				} 
				else {
					result = "login.alreadylogin";
				}

			} else {
				result = "login.passwordincorrect";
			}

		} else {
			result = "login.noUser";
		}
		return result;

	}

}
