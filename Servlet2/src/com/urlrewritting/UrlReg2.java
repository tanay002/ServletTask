package com.urlrewritting;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/url2")
public class UrlReg2 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		try
		{
			res.setContentType("text/html");
      String uname=req.getParameter("uname");
      String upwd=req.getParameter("upwd");
      String umobno=req.getParameter("umobno");
      System.out.println(uname+" "+upwd);
     PrintWriter ps=res.getWriter();
     ps.print("Servlet 2");
     ps.println("<center><a href='url3?uname="+uname+"&upwd="+upwd+"&umobno="+umobno+"'>click here</a></center>");
     
     
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
