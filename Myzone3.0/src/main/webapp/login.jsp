<%@page import="java.util.ResourceBundle"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Myzone Login</title>
<link rel="icon" type="image/x-icon" href="./image.jfif">
<link rel="stylesheet" href="./login.css">
</head>

<%
	ResourceBundle rb = (ResourceBundle) application.getAttribute("rb");
%>
<body>
	<div class="header">
		<nav>
			<h1>MyZone</h1>
		</nav>
	</div>
	<div class=body>
		<div class="login_wrapper-inner">

			<div>
				<div class="login_logo">Login</div>
				<form action="login.do" method="post">

					<div class="form_group">
						<input class="form_input"
							placeholder=<%=rb.getString("username")%> type="text"
							name="uname">
					</div>
					<div class="form_group">
						<input class="form_input"
							placeholder=<%=rb.getString("password")%> type="password"
							name="pass">
					</div>
					<input type="submit" class="submit-button" value="Login"> <input
						type="hidden" name="formid" value="login">
				</form>
				<div>
					<a href="./register.jsp">Registor</a>
				</div>

			</div>

		</div>
		
	</div>


</body>
</html>