package service;

import java.sql.SQLException;

import DTO.User;

public interface UserService {
	
	boolean checkFlag(String username);

	boolean checkUser(String username);

	boolean checkPassword(String username, String password);

	int UpdateFlag(int flag, String username);

	int insertUser(User user);

}
