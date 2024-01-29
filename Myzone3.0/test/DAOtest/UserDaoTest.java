package DAOtest;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import DAO.UserDAO;
import DTO.User;
@TestMethodOrder(OrderAnnotation.class)
class UserDaoTest {

	@Test
	@Order(1)
	public void insertUser() {
		UserDAO ud = UserDAO.getUserDao();
		User user = new User();
		user.setUserName("Ganesh");
		user.setPassword("123");
		user.setFlag(0);
		int result =ud.insertUser(user);
		assertEquals(1, result);
		
	}

	@Test
	@Order(2)
	public void updateUser()  {
		UserDAO ud = UserDAO.getUserDao();
		User user = new User();
		user.setUserName("Ganesh");
		user.setPassword("123");
		user.setFlag(1);
		int result =ud.updateUser(user);
		assertEquals(1, result);
	}
	@Test
	@Order(3)
	public void getUser() {
		UserDAO ud = UserDAO.getUserDao();
		User expected = new User();
		expected.setUserName("Ganesh");
		expected.setPassword("123");
		expected.setFlag(1);
		
		User actual =ud.getUSer("Ganesh");
		assertEquals(expected,actual);
	}
	@Test
	@Order(4)
	public void deleteUser()  {
		int expected =1;
		UserDAO ud = UserDAO.getUserDao();
		int actual=ud.deleteUser("Ganesh");
		assertEquals(expected,actual);
		
		
	}

	
	
}
