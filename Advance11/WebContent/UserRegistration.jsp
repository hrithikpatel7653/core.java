<%@page import="in.co.rays.bean.UserBean"%>
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

	<form action="UserCtl" method="post">

		<%
			UserBean bean = (UserBean) request.getAttribute("bean");
		%>
		<center>
			<table>

				<%
					if (bean != null) {
				%>

				<tr>
					<td><input type="hidden" name="id" value=<%=bean.getId()%>>
					</td>
				</tr>

				<tr>
					<th>FirstName:</th>
					<td><input type="text" name="fname"
						value=<%=bean.getFistName()%>></td>
				</tr>
				<tr>
					<th>LastName:</th>
					<td><input type="text" name="lname"
						value=<%=bean.getLastName()%>></td>
				</tr>
				<tr>
					<th>LoginId:</th>
					<td><input type="text" name="login"
						value=<%=bean.getLoginId()%>></td>
				</tr>
				<tr>
					<th>Password:</th>
					<td><input type="password" name="pwd"
						value=<%=bean.getPassword()%>></td>
				</tr>
				<tr>
					<th>MobileNo :</th>
					<td><input type="text" name="mobno"
						value=<%=bean.getMobileNo()%>></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Update" name="Operation"></td>

				</tr>
				<%
					} else {
				%>

				<tr>
					<th>FirstName:</th>
					<td><input type="text" name="fname"></td>
				</tr>
				<tr>
					<th>LastName:</th>
					<td><input type="text" name="lname"></td>
				</tr>
				<tr>
					<th>LoginId:</th>
					<td><input type="text" name="login"></td>
				</tr>
				<tr>
					<th>Password:</th>
					<td><input type="password" name="pwd"></td>
				</tr>
				<tr>
					<th>MobileNo :</th>
					<td><input type="text" name="mobno"></td>
				<tr>
					<th></th>
					<td><input type="submit" value="Add" name="Operation"></td>
				</tr>


				<%
					}
				%>



			</table>

		</center>
		<br> <br> <br> <br> <br> <br> <br>
		<br> <br> <br> <br> <br>
	</form>
	<%@ include file="Footer.jsp"%>


</body>
</html>