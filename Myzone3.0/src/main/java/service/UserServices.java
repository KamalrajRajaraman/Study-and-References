package service;

import DAO.UserDAO;
import DTO.User;

public class UserServices implements UserService, Cloneable {

	private static UserServices us = null;

	private UserServices() {
		System.out.println("user service created");
	}

	public static UserServices getUserService() {
		if (us == null) {
			return us = new UserServices();
		}
		return us.createClone();

	}

	public UserServices createClone() {
		UserServices UserServices = null;
		try {
			UserServices = (UserServices) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return UserServices;

	}

	@Override
	public boolean checkFlag(String username) {
		UserDAO us = UserDAO.getUserDao();
		User user = us.getUSer(username);
		if (user != null) {
			if (user.getFlag() == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public boolean checkUser(String username) {
		boolean result = false;
		UserDAO us = UserDAO.getUserDao();
		User user = us.getUSer(username);

		if (user != null) {
			result = true;
		}
		return result;

	}

	@Override
	public boolean checkPassword(String username, String password) {
		UserDAO us = UserDAO.getUserDao();
		User user = us.getUSer(username);
		if (user.getPassword().equals(password)) {
			return true;
		}
		return false;

	}

	@Override
	public int UpdateFlag(int flag, String username) {
		UserDAO us = UserDAO.getUserDao();
		User user = us.getUSer(username);
		user.setFlag(flag);
		int result = us.updateUser(user);
		return result;
	}
	
	public int insertUser(User user) {
		UserDAO us = UserDAO.getUserDao();
		int result=us.insertUser(user);
		return result;
		
	}

}
