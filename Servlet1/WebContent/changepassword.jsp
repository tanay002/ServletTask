<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%HttpSession sess=request.getSession(false);
String user=(String)sess.getAttribute("user");
%>
<center>
<h4>Welcome <%=user%></h4>
<table>
<form action="changep" method="post">
<tr><td>Current Password</td><td><input type="password" name="currentpass"></td></tr>
<tr><td>New Password</td><td><input type="password" name="newpass"></td></tr>
<tr><td>Confirm Password</td><td><input type="password" name="confpass"></td></tr>
<tr><td><input type="submit" value="change"></td></tr>
<tr><td>
</form>
</table>
</center>
</body>
</html>