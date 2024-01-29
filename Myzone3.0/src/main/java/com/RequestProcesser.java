package com;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
		
		Class<?> cls =Class.forName(ActionClass);
		Method method=cls.getDeclaredMethod("getInstance");
		Action action = (Action) method.invoke(null);
		
		
		String result =action.execute(request, response);
		
		String nextpage =  prop.getProperty(result);
		System.out.println(nextpage);
		RequestDispatcher rs = request.getRequestDispatcher(nextpage);
		rs.forward(request, response);
		
		
	}

}
