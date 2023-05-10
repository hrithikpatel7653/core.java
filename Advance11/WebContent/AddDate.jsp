<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title> 
</head>
<body>
	<center>
		<form action="AddDateCtl" method="post">
			<table>
				<tr>
					<th align="left">DOB<span style="color: dark pink"></span></th>
					<td><input type="date" name="Dob"></td>

				</tr>

				<tr>
					<td align="left" colspan="2"><input type="submit"
						name="Operation" value="Add"></td>
				</tr>
			</table>

		</form>

	</center>
</body>
</html>