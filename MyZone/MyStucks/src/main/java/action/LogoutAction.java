package action;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.UserDAO;
import DAO.UserDAOs;

public class LogoutAction extends Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("uname");

		Connection con = (Connection) request.getServletContext().getAttribute("con");
		UserDAOs userDao = new UserDAO(con);
		try {
			if (session != null) {

				session.invalidate();
				userDao.updateFlag(username, 0);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "login.html";

	}
}
