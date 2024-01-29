package com;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(".com")
public class ActionServlet extends HttpServlet {
	private RequestProcessor rp;
	@Override
	public void init(ServletConfig congif) {
		rp = new RequestProcessor();
	}
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) {
		doPost(req, res);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) {
		//rp.process(req, res);
		System.out.println("ji");
	}

}
