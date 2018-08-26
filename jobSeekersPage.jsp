<%@ page import="beans.DomainBean,java.util.List,daoImplementation.AdminDaoImplementation" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Job Seeker page</title>
</head>
<body>
	<form:form action="AdminController" method="display3">
	<table>
		<tr>
			
			<th> <% List<DomainBean> domainList =new AdminDaoImplementation().viewDomainTable();%>
					<select name="ViewDomainDropbox">
					<c:forEach items="${domainList}" var="List">
						<option value="DOMAIN">--DOMAIN--</option>
						<option value="DomainName">${List.domainName}</option>
					</c:forEach>
					</select>
			</th>
			
			<th>Company Name</th>
			<th>Post</th>
			<th>Location</th>
			<th>Required Qualification</th>
			<th>Required Experience</th>
			<th>Status</th>
		</tr>
		<form:select path="domain" items="${domainList}">
		<c:forEach items="${jobList}" var="List">
 		<tr>
  			
  			<td>${List.getCompanyName()}</td>
  			<td>${List.getPost()}</td>
  			<td>${List.getLocation()}</td>
  			<td>${List.getRequiredQualification()}</td>
  			<td>${List.getRequiredExperience()}</td>
  			<td> <input type="button" name="apply" value="Apply"></td>
 		</tr>
		</c:forEach>
		</form:select>
	</table>
	</form:form>
</body>
</html>