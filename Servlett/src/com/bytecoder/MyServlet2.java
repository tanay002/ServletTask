package com.bytecoder;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet2 extends HttpServlet
{
	 public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	 {
		 ServletConfig config=getServletConfig();
	String name=config.getInitParameter("Raka");
	              ServletContext sc=   getServletContext();    
	              String namee=sc.getInitParameter("driver");
	              System.out.println(namee);    
	             System.out.println(name);
		// PrintWriter ps=res.getWriter();
		 //ps.println("Hello Bawa");
	 }
}
