package DAO;

import java.sql.SQLException;

import DTO.User;

public interface UserDAOs {
	int insertUser(User user)throws SQLException ;
	User getUSer(String username)throws SQLException ;
	int updateFlag(String username,int value)throws SQLException;
}
