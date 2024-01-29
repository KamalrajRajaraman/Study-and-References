package com.vastPro.Service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import DAO.UserDAO;
import DTO.User;
import service.UserService;
import service.UserServices;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(OrderAnnotation.class)
class UserServiceTest {
	@BeforeAll
	static void beforeAll() {
		UserDAO ud = UserDAO.getUserDao();
		User user = new User();
		user.setUserName("Ganesh");
		user.setPassword("123");
		user.setFlag(0);
		int result =ud.insertUser(user);
		assertEquals(1, result);
	}
	@Test@Order(1)
	void checkFlag() {
		UserService service=UserServices.getUserService();
		boolean actual =service.checkFlag("Ganesh");
		assertTrue(actual);
	}
	@Test@Order(2)
	void checkUser1() {
		UserService service=UserServices.getUserService();
		boolean actual =service.checkUser("Ganesh");
		assertTrue(actual);
		
	}
	@Test@Order(3)
	void checkUser2() {
		UserService service=UserServices.getUserService();
		boolean actual =service.checkUser("Hari");
		assertFalse(actual);
		
	}
	@Test@Order(4)
	void checkPassword() {
		UserService service=UserServices.getUserService();
		boolean actual =service.checkPassword("Ganesh", "123");
		assertTrue(actual);
		
		
	}
	@Test@Order(5)
	void checkPassword2() {
		UserService service=UserServices.getUserService();
		boolean actual =service.checkPassword("Ganesh", "456");
		assertFalse(actual);
		
		
	}
	@Test@Order(6)
	void updateFlag() {
		UserService service=UserServices.getUserService();
		int actual =service.UpdateFlag(1, "Ganesh");
		assertEquals(1, actual);
		
	}
	@Test@Order(7)
	void checkFlag2() {
		UserService service=UserServices.getUserService();
		boolean actual =service.checkFlag("Ganesh");
		assertFalse(actual);
	}
	
	@AfterAll
	static void afterAll(){
		int expected =1;
		UserDAO ud = UserDAO.getUserDao();
		int actual=ud.deleteUser("Ganesh");
		assertEquals(expected,actual);
	}

}
