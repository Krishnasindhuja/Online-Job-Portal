<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> View User Table</title>
</head>
<body>
<form:form action="AdminController" method="display1">

	<table>
		<tr>
			<th>Name</th>
			<th>Contact Number</th>
			<th>Email ID</th>
			<th>Academic Qualification</th>
			<th>Percentage</th>
			<th>Work Experience</th>
			<th>Skill Set</th>
			<th>Domain</th>
			<th>Registration Duration</th>
		</tr>
	<c:forEach items="${userList}" var="List">
 		<tr>
  			<td>${List.getFirstName()+List.getLastName()}</td>
  			<td>${List.getDateOfBirth()}</td>
  			<td>${List.getContactNumber()}</td>
  			<td>${List.getEmailID()}</td>
  			<td>${List.getAcademicQualification()}</td>
  			<td>${List.getPercentage()}</td>
  			<td>${List.getExperience()}</td>
  			<td>${List.getSkillSet()}</td>
  			<td>${List.getRegistrationDuration()}</td>
 		</tr>
</c:forEach>
	
	</table>
</form:form>
</body>
</html>