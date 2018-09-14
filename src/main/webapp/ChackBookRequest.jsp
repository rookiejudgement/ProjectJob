<%@page import="com.teamsankya.bankingsystem.dto.ServiceTrackerBean"%>
<%@page import="com.teamsankya.bankingsystem.dto.UserInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	UserInfoBean usf = (UserInfoBean) session.getAttribute("sss");
%>
<%
	String Acc_idno = request.getParameter("Acc_idno");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RequestCheckBook</title>
<style type="text/css">
body {
	background: skyblue;
	margin: 5%;
}

p {
	color: red;
}
h1{
margin-left:40px;
}
span{
color:blue;
padding:0 20px;
}
</style>
</head>
<body>
	<form method="get" action="RequestCheckBook">
		<b>Enter your description:</b> <input type="text" name="descripition"/>
		<br>
		 
		<input type="submit">
		
	</form>
	<h1>Message:<span>${msg}</span></h1>
	<h1>Your service request id:<span>${info}</span></h1>

<br><a href="Home.html">Back to Home</a>
</body>
</html>