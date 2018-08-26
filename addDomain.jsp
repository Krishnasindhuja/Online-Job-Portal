<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page import="beans.DomainBean,java.util.List,daoImplementation.AdminDaoImplementation" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Domain</title>
</head>
<body>
	<h1>Add Domain</h1>
	
	<form:form action="AdminController/display3.htm?action=display3">
	

	Enter Domain: <input type="text" name="enterDomain"> <br>
	<input type="submit" value="Add">
	
	<br/><br/><br/>	<br/><br/><br/>
	
	<a href="jobUpdated.jsp">Submit</a>
	<a href="adminPage.jsp">Back</a>
	</form:form>
</body>
</html>