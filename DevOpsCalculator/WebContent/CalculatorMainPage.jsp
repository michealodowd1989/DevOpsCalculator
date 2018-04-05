<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<div class="mainHeader">
		<h1>Welcome to my Devops Calculator</h1>
	</div>
	<div class="calculator">
		<form method="post" action="Calculate">
			<table>
				<tr>
					<td>Number1 :</td>
					<td><input type="text" name="num1"></td>
				</tr>
				<tr>
					<td>Number 2:</td>
					<td><input type="text" name="num2"></td>
				</tr>
				<tr>
					<td>Select</td>
					<td><select name="select">
							<option  value="add">Add</option>
							<option value="subtract">subtract</option>
							<option value="divide">Divide</option>
							<option value="multiply">Multiply</option>
					</select></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="text" name="answer"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Calculate"></td>
				</tr>
				
			</table>
		</form>
	</div>
</body>
</html>