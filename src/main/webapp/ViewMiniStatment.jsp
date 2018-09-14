
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ViewMiniStatment</title>
<style type="text/css">
body{
background:skyblue;
margin:0;
}
p{
color:red;
}
</style>
</head>
<body>

<div style="margin:5%;width:90%;background:white;;padding:20px;padding-right:0;">
<form method="get" action="ViewMiniStatment">
<b>Enter your account no:</b><br><input type="text" name="acno">
<input type="submit" value="View Statement">
</form>
<h1>Your Info:</h1>
Your amount:<p>${info.getTran_amount()}</p><br>
Date of transition:<p>${info.getDate_of_Trans()}</p><br>
<br><a href="Home.html">Back to Home</a>
</div>
</body>
</html>