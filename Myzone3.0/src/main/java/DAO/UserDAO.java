package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ConnectionUtility;

import DTO.User;

public class UserDAO implements UserDAOs, Cloneable {
	
	private static UserDAO ud = null;
	
//	
//	private Connection con = null;
//	public UserDAO(Connection con) {
//		this.con = con;
//	}

	private UserDAO() {
		System.out.println("UserDao created");
	}

	public static UserDAO getUserDao() {
		if (ud == null) {
			return ud = new UserDAO();
		}
		return ud.createClone();

	}

	public UserDAO createClone() {
		UserDAO UserDAO = null;
		try {
			UserDAO = (UserDAO) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return UserDAO;

	}

	@Override
	public int insertUser(User user) {
		int result = 0;
		Connection con = ConnectionUtility.getConnection();
		String sql = "insert into User values(?,?,?)";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, user.getUserName());
			st.setString(2, user.getPassword());
			st.setInt(3, user.getFlag());
			result = st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConnectionUtility.closeConnection(null, null);
		return result;

	}

	@Override
	public User getUSer(String username) {

		User user = null;
		Connection con = ConnectionUtility.getConnection();
		String sql = "select * from User where username =?";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, username);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				user=new User();
				user.setUserName(rs.getString(1));
				user.setPassword(rs.getString(2));
				user.setFlag(rs.getInt(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		ConnectionUtility.closeConnection(null, null);
		return user;
	}

	public int updateUser(User user) {
		int result=0;
		Connection con = ConnectionUtility.getConnection();
		String sql = "update user set password =? ,flag = ? where username =? ";
		try {
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, user.getPassword());
		st.setInt(2, user.getFlag());
		st.setString(3, user.getUserName());
		result = st.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		ConnectionUtility.closeConnection(null, null);
		return result;

	}

	public int deleteUser(String username) {
		int result=0;
		Connection con = ConnectionUtility.getConnection();
		String sql = "delete from user  where username =? ";
		try {
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, username);
		result = st.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		ConnectionUtility.closeConnection(null, null);
		return result;

	}

}
