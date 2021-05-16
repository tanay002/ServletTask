package com.servlet.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/httpservlet1")
public class HttpServlet1 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{ 
		// res.setContentType("text/html");
		PrintWriter ps=res.getWriter();
		ps.print("<html><body><form action='httpservlet2' method='get'>"
				+ "Username<input type='text' name='uname'>Password<input type='password' name='pass'>"
				+ "<input type='submit' value='login'></form></body></html>");
	}
}
