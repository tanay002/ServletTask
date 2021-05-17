package com.cookies;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookie1")
public class LoginCookieController extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String name=req.getParameter("sname");
		String mob=req.getParameter("smob");
	Cookie c=new Cookie("sname",name);
	Cookie c1=new Cookie("smob",mob);
	
res.addCookie(c);
res.addCookie(c1);
res.sendRedirect("cookie2");
	}
}