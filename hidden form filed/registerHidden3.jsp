<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String username= request.getParameter("username"); 
String password=request.getParameter("password");
String email=request.getParameter("email");
%>
<center>
<table>
<form action="firstrun" method="post">
<input type="hidden" name="username" value="<%=username%>">
<input type="hidden" name="password" value="<%=password%>">
<input type="hidden" name="email" value="<%=email%>">
<tr><td>Mobileno<input type="text" name="mobno"></td></tr>
<tr><td><input type="submit" value="Signup"></td></tr>
</table>
</center>
</body>
</html>