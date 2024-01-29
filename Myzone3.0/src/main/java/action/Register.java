package action;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import DTO.User;
import service.UserService;
import service.UserServices;

public class Register extends Action implements Cloneable{
	private static Register register;

	private Register() {
		System.out.println("Register action Object Created...");
	}

	public static Register getInstance() {
		if (register == null) {
			return register = new Register();
		}
		return register.getClone();

	}

	public Register getClone() {
		Register register = null;
		try {
			register = (Register) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return register;
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		String userName = request.getParameter("uname");
		String password = request.getParameter("pass");
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		user.setFlag(0);
		
		UserService service = UserServices.getUserService();
		int r =service.insertUser(user);
		
		if (r==1) {
			return "register.success";
		}
		return "register.failure";
		
	}
}
