package com.bytecoder;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/second")
public class MySecondPage implements Servlet
{

	public void destroy()
	{}

	public void init(ServletConfig conf) throws ServletException
	{

	}

	public ServletConfig getServletConfig()
	{
		return null;
	}

	public String getServletInfo() 
	{
		return null;

	}

	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
         PrintWriter ps=   res.getWriter();
         res.setContentType("text/html");
         ps.println("<html><body><form action='#' method='get'>"
         		+ "Username<input type='text' name='uname'>Password<input type='text' name='pass'>"
         		+ "<input type='submit' value='login'></body></html>");
	}

	
}
