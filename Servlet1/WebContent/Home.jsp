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
HttpSession sess=request.getSession(false);

    String User=  (String)sess.getAttribute("user");    
    String password=  (String)sess.getAttribute("upass");    
%>    
<center>
	<h4>Welcome <%=User%></h4>
<table>
   <tr><td><a href="viewpuser">View User Details</a></td></tr>
    <tr><td><a href="viewall">All User Details</a></td></tr>
	<tr><td><a href="changepassword.jsp">Password</a></td></tr>
    <tr><td><a href="logout">Logout</a></td></tr>
	</table>
	</center>
</body>
</html>