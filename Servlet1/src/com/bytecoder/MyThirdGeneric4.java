package com.bytecoder;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fourth")
public class MyThirdGeneric4 extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws IOException
	{ 
		// res.setContentType("text/html");
		PrintWriter ps=res.getWriter();
	    ps.println("<html><body><form action='#' method='get'>"
         		+ "Username<input type='text' name='uname'>Password<input type='text' name='pass'>"
         		+ "<input type='submit' value='login'></form></body></html>");
	  
	}
}
