package com;
import java.io.IOException;

import javax.jws.soap.InitParam;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(
		initParams = {
				@WebInitParam(name="key",value="value"),
				@WebInitParam(name="key2",value="value2")},
		urlPatterns = {"/com","*.com"}
		
		) 
public class MyServlet extends HttpServlet {
	@Override
	public void init(ServletConfig s) throws ServletException {
		System.out.println("init called...");
		System.out.println(s.getInitParameter("key"));
		System.out.println(s.getInitParameter("key2"));
	}
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		System.out.println("do get called ....");
		doPost(req, res);
	}
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		System.out.println("do post called...");
		String p1 = req.getParameter("num1");
		String p2 = req.getParameter("num2");
		System.out.println(p1);
		System.out.println(p2);
//		ServletOutputStream out = res.getOutputStream();
//		out.println("<h1>"+p1+":"+p2+"</h2>");
	
//		res.sendRedirect("view/abcd.jsp");
		
		RequestDispatcher s = req.getRequestDispatcher("view/abcd.jsp");
		s.forward(req, res);
		
	
	}
	
	
	
	
	@Override
	public void destroy() {
		System.out.println("bye...............");
	}
	
	
	
}
