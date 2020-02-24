package com.servlet.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/httpservlet2")
public class HttpServlet2 extends HttpServlet
{
 public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
 {
	String name= req.getParameter("uname");
	String pass=req.getParameter("pass");
	
	PrintWriter ps=res.getWriter();
	            ps.println("<html><body><center><table><tr><td>Thankyou for login</td></tr>"
	            		+ "<tr><td>Username is "+name+" and Password is "+pass+"</table></center></body>");
 }
}
