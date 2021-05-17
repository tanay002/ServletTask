package com.task.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String name=req.getParameter("ename");
		PrintWriter ps=res.getWriter();
		ps.print("<table><form action='third' method='get'>"
				+ "<input type='hidden' name='ename' value='"+name+"'>"
						+ "MobileNo<input type='text' name='emob'>"
						+ "<input type='submit' value='register'></form></table>");
	}
}
