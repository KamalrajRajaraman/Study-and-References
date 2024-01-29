package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.User;

public class UserDAO implements UserDAOs{
	private Connection con;
	public UserDAO(Connection con) {
		this.con=con;
	}
	@Override
	public int insertUser(User user) throws SQLException {
		String sql ="insert into User values(?,?,?)";
		PreparedStatement st= con.prepareStatement(sql);
		st.setString(1, user.getUserName());
		st.setString(2, user.getPassword());
		st.setInt(3, user.getFlag());
		int result = st.executeUpdate();
		return result;
		
	}
	@Override
	public User getUSer(String username) throws SQLException {
		String sql ="select password,flag from User where username =?";
		PreparedStatement st= con.prepareStatement(sql);
		st.setString(1, username);
		ResultSet rs = st.executeQuery();
		
		User user = new User();
		user.setUserName(username);
		
		if(rs.next()) {
			user.setPassword(rs.getString(1));
			user.setFlag(rs.getInt(2));
		}
		return user;
	}
	@Override
	public int updateFlag(String username,int value) throws SQLException {
		String sql ="update user set flag = ? where username =? ";
		PreparedStatement st= con.prepareStatement(sql);
		st.setInt(1, value);
		st.setString(2,username);
		int result = st.executeUpdate();
		return result;
		
	}
	
	

}
