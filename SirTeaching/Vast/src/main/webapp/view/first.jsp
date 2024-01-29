hello world
<!-- 
	Scripting tag
 -->
 <%=application.getRealPath("")%>
 
 <%
 	out.println("C:\\Users\\Dell\\Desktop\\SirTeaching\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\work\\Catalina\\localhost\\Vast\\org\\apache\\jsp\\view");
 %>
 <%
 	out.println("<h1>hi</h1>");
 %>
 <%
 	String name=request.getParameter("uname");
 	out.println("<h1>java code written here...</h1>"+name);
 	
 
 %>