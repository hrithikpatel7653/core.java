<%@page import="java.util.Iterator"%>
<%@page import="in.co.rays.bean.UserBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="Header.jsp"%>
	<form action="UserListCtl.do" method="post">
		<%
			List list = (List) request.getAttribute("list");
			Iterator it = list.iterator();
		%>
		<tr>

			<th>Name: <input type="text" name="name"> <input
				type="submit" value="Search" name="Operation"></th>

		</tr>

		<br>
		<center>

			<table border="2" cellpadding="5" cellspacing="5" bgcolor="black"
				width="1200px" style="color: blue">

				<tr style="color: red">
					<th>Id</th>
					<th>FirstName</th>
					<th>LastName</th>
					<th>LoginId</th>
					<th>Password</th>
					<th>MobileNo</th>
					<th>Edit</th>
				</tr>

				<tr>

					<%
						while (it.hasNext()) {

							UserBean bean = (UserBean) it.next();
					%>
				
				<tr style="text-align: center">

					<td><%=bean.getId()%></td>
					<td><%=bean.getFistName()%></td>
					<td><%=bean.getLastName()%></td>
					<td><%=bean.getLoginId()%></td>
					<td><%=bean.getPassword()%></td>
					<td><%=bean.getMobileNo()%></td>
					<td><a href="UserCtl?id=<%=bean.getId()%>">Edit</a></td>

					<%
						}
					%>
				
			</table>

		</center>
		<%@ include file="Footer.jsp"%>
	</form>

</body>
</html>