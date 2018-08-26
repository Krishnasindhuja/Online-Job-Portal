<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home Page</title>
</head>
<body>
	<h1> Admin HomePage</h1>
	
	<form:form action="admin.htm" >
	<a href="AdminController/display1.htm?action=display1">View Registered Users</a><br> 
	<a href="AdminController/display2.htm?action=display2">Upload New Job</a><br>
	<a href="AdminController/display3.htm?action=display3">Add New Domain</a><br>
	</form:form>
</body>
</html>