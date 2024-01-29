package DAO;

import java.sql.SQLException;

import DTO.User;

public interface UserDAOs {
	int insertUser(User user);
	User getUSer(String username) ;
	int updateUser(User user);
}
