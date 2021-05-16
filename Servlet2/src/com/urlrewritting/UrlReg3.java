package com.urlrewritting;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/url3")
public class UrlReg3 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		try
		{
			PrintWriter ps=res.getWriter();
			res.setContentType("text/html");
			String uname=req.getParameter("uname");
			String upwd=req.getParameter("upwd");
			String umobno=req.getParameter("umobno");
			System.out.println(uname+" "+upwd);
			  ps.print("Servlet 3");
			ps.println("uname is= "+uname+" upwd is= "+upwd+" umobno is= "+umobno );
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
