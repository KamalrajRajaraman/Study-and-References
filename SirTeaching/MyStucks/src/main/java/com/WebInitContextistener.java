package com;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class WebInitContextistener
 *
 */
@WebListener
public class WebInitContextistener implements ServletContextListener {


	public void contextInitialized(ServletContextEvent sce) {
		try {
			ServletContext app = sce.getServletContext();

			Properties p = new Properties();
		
			String path = app.getRealPath("/WEB-INF/config.properties");
			p.load(new FileInputStream(path));
			
			String url =p.getProperty("url");
			String user =p.getProperty("username");
			String pass =p.getProperty("password");
			Connection con = DriverManager.getConnection(url,user,pass);
			
			app.setAttribute("prop", p);
			app.setAttribute("con", con);

		} catch (IOException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
