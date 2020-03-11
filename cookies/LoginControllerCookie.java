package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logincook")
public class LoginControllerCookie extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/Html");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		Cookie c=new Cookie("uemail",email);
		Cookie c1=new Cookie("upass",pass);
		res.addCookie(c);
		res.addCookie(c1);
		PrintWriter out=res.getWriter();
		out.println("<tr><td><center><a href='logincook2'>Next</a></center></td></tr>");
	}
}
