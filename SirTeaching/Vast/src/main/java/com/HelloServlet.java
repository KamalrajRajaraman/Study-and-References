package com;
import java.io.IOException;
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
				@WebInitParam(name="mykey", value="myvalue"),
				@WebInitParam(name="mykey2", value="myvalue22222")
		},
		urlPatterns = { "/ben", "/muthu", "*.mat" }
)
public class HelloServlet extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method called...");
		String m=config.getInitParameter("mykey");
		System.out.println("Config value..:"+m);
		System.out.println(config.getInitParameter("mykey2"));
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do get called....");
		doPost(request,response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do post called....");
		String username=request.getParameter("uname");
		String password=request.getParameter("upass");
		//ServletOutputStream out=resp.getOutputStream();
		//out.println("<h1>"+username+":"+password+"</h1>");
		//resp.sendRedirect("views/anotherpage.jsp");
		RequestDispatcher rd=request.getRequestDispatcher("views/anotherpage.jsp");
		rd.forward(request, resp);
	}
	@Override
	public void destroy() {
		System.out.println("destroy method called...");
	}
	
}