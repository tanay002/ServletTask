<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String username= request.getParameter("username"); 
String password=request.getParameter("password");
%>
<center>
<table>
<form action="registerHidden3.jsp" method="post">
<input type="hidden" name="username" value="<%=username%>">
<input type="hidden" name="password" value="<%=password%>">
<tr><td>Email<input type="email" name="email"></td></tr>
<tr><td><input type="submit" value="Next"></td></tr>
</table>
</center>
</body>
</html>