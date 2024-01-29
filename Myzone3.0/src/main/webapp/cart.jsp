<%@page import="DTO.Item"%>
<%@page import="DAO.ItemsDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.item {
	
}
</style>
</head>
<body>
	<table border="1">
		<tr>
			<td>ItemNo</td>
			<td>Name</td>
			<td>Unit</td>
			<td>Price</td>
		</tr>
		<%
			ItemsDAO item = new ItemsDAO();
		List<String> list = (List<String>) session.getAttribute("list");
		for (String l : list) {

			Item i = item.retrieveItem(Integer.parseInt(l));
			if (i.getItemId() != 0) {
				out.println("<tr><td class =\"item\" >" + i.getItemId() + "</td>");
				out.println("<td class =\"item\">" + i.getItemName() + "</td>");
				out.println("<td class =\"item\">" + i.getUnit() + "</td>");
				out.println("<td class =\"item\">" + i.getPrice() + "</td></tr>");
			}
		}
		%>
	</table>
</body>
</html>