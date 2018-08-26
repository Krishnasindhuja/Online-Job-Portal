<%@ page import="beans.DomainBean, daoImplementation.AdminDaoImplementation, java.util.List"contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="controllers.RegistrationController"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">  
<title>Billing Page</title>  
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css"> 
<script src="//code.jquery.com/jquery-1.10.2.js"></script> 
<script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script> 
<link rel="stylesheet" href="/resources/demos/style.css"> 
<script language="javascript">  
 	$(function(){    
		$( "#datepicker0" ).datepicker({dateFormat:"dd/mm/yy"}); 
    }); 	
</script>
<title>Registration page</title>
<SCRIPT LANGUAGE="javascript">
</script>
</head>

<style type="text/css">
H1
{
    COLOR: #6666CC;
    FONT-FAMILY: 'Times New Roman';
    TEXT-TRANSFORM: capitalize
}
</style>
<body onLoad="noback">
<center><h1><b>MAN RESOURCE ONLINE JOB PORTAL</b></h1></center>
<center><img src="jobimage3.jpg" alt="Home" height="200" width="980"></center> <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<div align="center">
<font size="4">
 <b><a href="home.jsp" target="_self">Home</a></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b><a href="aboutUs.jsp" target="_self">About us</a></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b><a href="./Logoutcontroller" target="_self">Logout</a></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <b><a href="contactUs.jsp" target="_self">Contact us</a></b>
 </font>
<br>
<br>
</div>

<form name="register" action="register.htm" method="post">

<h1 align="center">Registration Form</h1>
<table ALIGN="CENTER" ><tr></tr>

<tr><td><b>FirstName</b></td>
<td><input type="text" name="firstName"></td></tr>
<tr><td><b>LastName</b></td>
<td><input type="text" name="lastName"></td></tr>
<tr><td><b>Date of Birth</b></td>
<td><input type="text" name="dateOfBirth" id="datepicker0"/></td></tr>
<tr><td><b>Mobile Number.</b></td>
<td><input type="text" name="contactNumber"></td></tr>
<tr><td><b>Email ID</b></td>
<td><input type="text" name="emailID"></td></tr>
<tr><td><b>Academic Qualification</b></td>
<td><input type="text" name="academicQualification"></td></tr>
<tr><td><b>Percentage (for Highest Qualification)</b></td>
<td><input type="text" name="percentage"></td></tr>
<tr><td><b>Experience</b></td>
<td><input type="text" name="experience"></td></tr>
<tr><td><b>Skill Set</b></td>
<td><input type="text" name="skill"></td></tr>
<tr><td><b>Duration of Registration</b></td>
<td><select name="registrationDuration">
	<option>30</option>
	<option>60</option>
	<option>90</option>
</select></td></tr>
<tr><td><b>Select Domain(upto 3):</b></td>
<td>
			<c:forEach items="${domainList}" var="List">
				<input type="checkbox" name="domainName" value="List.domainName">${List.domainName}<br>
			</c:forEach></td>
</tr>


<tr><td><b>DD Date</b></td>
<td><input type="text" name="ddDate" id="datepicker0"/></td></tr>
<tr><td><b>DD Number</b></td>
<td><input type="text" name="ddNumber"></td></tr>
<tr><td><b>Bank Name</b></td>
<td><input type="text" name="bankName"></td></tr>
<tr><td><b>Branch Name</b></td>
<td><input type="text" name="bankBranch"></td></tr>
<tr><td><b>DD Amount</b></td>
<td><input type="text" name="ddAmount"></td></tr>
</table><BR>

<table align="center"><tr>

<td><input type="submit" value="Submit" />
&nbsp;<td>
<input type="reset" value="Clear"/></tr>
</table>

<br>
<br>
</form>
</body>
</html>