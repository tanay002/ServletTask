package com.bytecoder;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet/* extends GenericServlet */
{

	@Override
	public void service(HttpServletRequest req ,HttpServletResponse res) throws ServletException, IOException {
		//String name=req.getParameter("namee");
		//PrintWriter ps=res.getWriter(); ps.println(name);
           res.sendRedirect("https://www.google.co.in/name=tanay");
	}
	
	
 /*public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
 {
		
		 * PrintWriter ps=res.getWriter(); ps.println("Hello");
		 
	 
	// RequestDispatcher rd=req.getRequestDispatcher("second");
	 //rd.include(req,res);
	 res.sendRedirect("second");
 }*/
}
