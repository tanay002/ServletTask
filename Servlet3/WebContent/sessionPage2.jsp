<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% HttpSession sess=request.getSession(false);
 String email= (String)sess.getAttribute("uEmail");
 String uPass= (String)sess.getAttribute("uPass");

 out.print("Welcome...."+email);
%>
<a href="logout">Logout</a>
</body>
</html>