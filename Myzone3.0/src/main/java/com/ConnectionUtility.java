package com;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Savepoint;


public class ConnectionUtility {
	private static ThreadLocal<Connection> tlocal = new ThreadLocal<>();
	private static String url = null;
	private static String username = null;
	private static String password = null;
	private static String driver = null;

	synchronized public static Connection getConnection() {

		Connection con = tlocal.get();
		if (con == null) {
			url = "jdbc:mysql://localhost:3306/jdbcDemo";
			driver = "com.mysql.cj.jdbc.Driver";
			username = "root";
			password = "12345678";
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, username, password);
				con.setAutoCommit(false);
			} catch (Exception e) {
				e.printStackTrace();
			}

			tlocal.set(con);
		}
		return con;
	}

	synchronized public static void closeConnection(Exception ex, Savepoint sp) {
		Connection con = tlocal.get();
		if (con == null) {
			System.out.println("No connection for closing");
		} else {
			try {
				if (ex == null) {
					con.commit();
				} else {
					if (sp != null) {
						con.rollback(sp);
						con.commit();
					} else {
						con.commit();
					}

				}
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			tlocal.remove();
		}
	}

}
