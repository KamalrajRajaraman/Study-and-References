package action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.UserDAO;
import DAO.UserDAOs;
import DTO.User;

public class LoginAction extends Action {
	private Connection con;

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		
		
		User user = null;
		con = (Connection) request.getServletContext().getAttribute("con");
		String userName = request.getParameter("uname");
		String password = request.getParameter("pass");

		UserDAOs userDao = new UserDAO(con);
		
		try {
			user = userDao.getUSer(userName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (user.getPassword() == null) {
			return "loginnouser.html";
		}
		if (user.getPassword().equals(password)) {
			if( user.getFlag()==0) {
				try {
					
					HttpSession session=request.getSession();
					boolean b=session.isNew();
					if(b) {
						String name =request.getParameter("uname");
						session.setAttribute("uname",name);
					}
					userDao.updateFlag(userName, 1);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return "Welcome.html";
			}
			return "alreadyLogin.html";
		}
		return "passwordincorrect.html";

	}

}
