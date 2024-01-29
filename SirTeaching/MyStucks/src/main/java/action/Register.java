package action;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDAOs;
import DAO.UserDAO;
import DTO.User;

public class Register extends Action{
	private Connection con;
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		con=(Connection) request.getServletContext().getAttribute("con");

		String userName = request.getParameter("uname");
		String password = request.getParameter("pass");
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		user.setFlag(0);
		
		UserDAOs userDao = new UserDAO(con);
		int r =0;
		try {
			r =userDao.insertUser(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (r==1) {
			return "login.html";
		}
		return "register.html";
		
	}
}
