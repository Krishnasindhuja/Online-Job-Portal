<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload Job</title>
</head>
<body>
	<h1> Upload a New Job</h1>
	<form:form action="AdminController" method="display3">
	<table>
		<tr>
			<th>jobID</th>
			<th>companyName</th>
			<th>post</th>
			<th>location</th>
			<th>requiredQualification</th>
			<th>requiredExperience</th>
		</tr>
		<c:forEach items="${jobList}" var="List">
 		<tr>
  			<td>${List.getJobID()}</td>
  			<td>${List.getCompanyName()}</td>
  			<td>${List.getPost()}</td>
  			<td>${List.getLocation()}</td>
  			<td>${List.getRequiredQualification()}</td>
  			<td>${List.getRequiredExperience()}</td>
 		</tr>
		</c:forEach>
	
	</table>	
	Company Name: <input type="text" name="companyName"> <br>
	Domain: <input type="text" name="domainName"> <br>
	Post: <input type="text" name="post"> <br>
	Required Qualification: <input type="text" name="requiredQualification"> <br>
	Work Experience Required(in years): <input type="text" name="workEx"> <br>
	Location : <input type="text" name="workLocation"> <br>
	<a href="jobUpdated.jsp">Submit</a>
	<a href="adminPage.jsp">Back</a>
	</form:form>
</body>
</html>