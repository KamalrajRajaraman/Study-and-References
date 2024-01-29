package com;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.Action;

public class RequestProcesser {
	public void process(HttpServletRequest request, HttpServletResponse response) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, ServletException, IOException {
		
		ServletContext app = request.getServletContext();
		
		Properties prop = (Properties) app.getAttribute("prop");
		String formid = request.getParameter("formid");
		String ActionClass = prop.getProperty(formid);
		
	
		Action action = (Action) Class.forName(ActionClass).getConstructor().newInstance();
		
		String result =action.execute(request, response);
		
		RequestDispatcher rs = request.getRequestDispatcher(result);
		rs.forward(request, response);
		//response.sendRedirect(result);
		
	}

}
