package com.servlet.basicRegistration;

import java.io.PrintWriter;
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

@WebServlet("/viewpuserr")
public class ViewUserController extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		try
		{
			res.setContentType("text/Html");
			PrintWriter out=res.getWriter();	
			HttpSession sess=req.getSession(false);
			if(sess!=null)
			{
				
				
				//String user=(String)sess.getAttribute("user");
			//	String upass=(String)sess.getAttribute("upass");
				String uemail=(String) sess.getAttribute("uemail");

				Class.forName("com.mysql.jdbc.Driver");

				Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_task","root","root");
				PreparedStatement ps=con.prepareStatement("select * from servletbasic where uemail='"+uemail+"'");
				ResultSet rs =ps.executeQuery();
				if(rs.next())
				{ 
					out.println("<center><table><form action='updatec' method='post'>"
							+ "<tr><td>Username</td><td><input type='text' name='uname' value='"+rs.getString("uname")+"'></td></tr>"
							+ "<tr><td>Email</td><td><input type='text' name='uemail' value='"+rs.getString("uemail")+"' readonly></td></tr>"
							+ "<tr><td>Umob</td><td><input type='text' name='umob' value='"+rs.getString("umob")+"'></td></tr>"
							+"<tr><td><input type='submit' value='update'></td></tr>");
				}
			}
			else
			{
				res.sendRedirect("Login.jsp");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}