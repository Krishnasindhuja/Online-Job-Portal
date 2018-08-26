<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
</head>

<style type="text/css">
H1
{
    COLOR: #6666CC;
    FONT-FAMILY: 'Times New Roman';
    TEXT-TRANSFORM: capitalize
}
</style>
<body bgcolor="white">

<div align="center">
<center><h1><b>MAN RESOURCE</b></h1></center>
          <h1> <b>ONLINE JOB SEARCH PORTAL</b></h1>
<img src="jobimage1.jpg" alt="Home" height="200" width="1100"> <br><br>
<center>
<font size="4">
<b><a href="home.jsp" target="_self">Home</a></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b><a href="aboutUs.jsp" target="_self">About us</a></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b><a href="terms.jsp" target="_self">Terms and Conditions</a></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b><a href="contactUs.jsp" target="_self">Contact us</a></b></font></center>
<br><br><br><br>
</div>

<form:form method="POST" commandName="login" action="login.htm">
 <table align="center" border="0">
 <tbody>
 <tr>
 <td>RegistrationID</td>
 <td><input type="text" name="userName"/></td>
 </tr>
 <tr>
 <td>Password</td>
<td><input type="password" name="password"/></td>
 </tr>
 <tr>
<td><input type="submit" value="Login"/></td><td>
New User&nbsp;&nbsp;&nbsp;<a href="DomainController">Register here</a></td>
</tr>
 </tbody>
 </table>
</form:form>
</body>
</html>