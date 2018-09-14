<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Password Chang</title>
<style type="text/css">
body{
background:skyblue;
margin:10%;
}
p{
color:red;
}
</style>
</head>
<body>
<form method="get" action="ChangPassword">
Your Id:<input type="text" name="uid"><br>
<b>Enter your Password:</b>
<input type="text" name="password"><br>
<b>Enter your nPassword</b>
<input type="text" name="npassword"><br>
<b>Enter your cPassword</b>
<input type="text" name="cpassword"><br>
<input type="submit" value="new password">
</form>
Your info: ${info}
</body>
</html>