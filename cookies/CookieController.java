package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie2")
public class CookieController extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
	Cookie c []=	req.getCookies();
	
	for(int i=0;i<c.length;i++)
	{
	System.out.println(c[i].getName()+" "+c[i].getValue());
	}
 
//Delete Cookies Now	

	Cookie cm=new Cookie("sname","");
	Cookie c1=new Cookie("smob","");
	cm.setMaxAge(0);
	cm.setMaxAge(0);
	res.addCookie(cm);
	res.addCookie(c1);
	}
}