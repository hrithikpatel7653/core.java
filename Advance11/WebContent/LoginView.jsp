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
	<center>

		<form action="LoginCtl" method="post">

			<%
				String msg = (String) request.getAttribute("msg");
				String uri = (String) request.getAttribute("uri");
				String sucess = (String) request.getAttribute("Sucess");
				String val1 = (String) request.getAttribute("val1");
				String val2 = (String) request.getAttribute("val2");
			%>



			<%
				if (msg != null) {
			%>

			<h3>
				<%=msg%></h3>

			<%
				} else {
			%>
			<%
				}
			%>




			<table>
				<input type="hidden" name="uri" value="<%=uri%>">
				<tr>
					<h1>
						<font color="red">Login 
					</h1>
					<h2>
						<%
							if (sucess != null) {
						%>
						<h4>
							<font color="green"><%=sucess%>
						</h4>
						<%
							} else {
						%>
						<%
							}
						%>

					</h2>
				</tr>
				<tr rowspan="2">
					<th>LoginId*</th>
					<td><input type="text" size="30" name="loginId"
						placeholder="Enter your Email Id" />
					<td>
						<%
							if (val1 != null) {
						%>
						<h4>
							<font color="red"><%=val1%>
						</h4> <%
 	} else {
 %> <%
 	}
 %>
					</td>


				</tr>
				<tr>
					<th>Password*</th>
					<td><input type="password" size="30" name="password"
						placeholder="Enter your password" /> <td><%
 	if (val2 != null) {
 %>
						<h4>
							<font color="red"><%=val2%>
						</h4> <%
 	} else {
 %> <%
 	}
 %></td></td>
				</tr>
				<tr>
					<td></td>
					<td><a href="LoginCtl"><input type="submit" value="SignIn"
							name="operation" /></a> <a href="LoginCtl"><input type="submit"
							value="SignUp" name="operation" /></a></td>
				</tr>
				<tr>
					<td></td>
					<th><a href=""></a><a href=""> Forget my password ? </a></th>
				</tr>

				<%
					String name = (String) request.getAttribute("name");
				%>

				<%
					if (name != null) {
				%>
				<h3>
					<%=name%></h3>
				<%
					} else {
				%>

				<%
					}
				%>


			</table>
		</form>
		<br> <br> <br> <br> <br> <br> <br>
		<br> <br> <br> <br> <br>


	</center>

	<%@ include file="Footer.jsp"%>


</body>
</html>