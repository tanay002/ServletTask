package com.servlet.basicRegistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/updatec")
public class UpdateController extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		HttpSession sess=req.getSession(false);
		try
		{
			
			if(sess!=null)
			{
				String  uname=req.getParameter("uname");   
				String  email=req.getParameter("uemail");  
				String  umob=req.getParameter("umob");  
				//System.out.println(uname+" "+email+" "+umob);
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_task","root","root");
				PreparedStatement ps=con.prepareStatement("update servletbasic set uname='"+uname+"' ,umob='"+umob+"' where uemail='"+email+"'");
				int row =ps.executeUpdate();
				if(row>0)
				{
                      res.sendRedirect("viewpuserr");
					//sess.invalidate();
					//res.sendRedirect("Login.jsp");

				}
			}
			else
			{
				res.sendRedirect("Login.jsp");
			}
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}

}
