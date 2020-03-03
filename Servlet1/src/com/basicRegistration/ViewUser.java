package com.servlet.basicRegistration;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/viewpuser")
public class ViewUser extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		try
		{
			res.setContentType("text/Html");
			PrintWriter out=res.getWriter();	
			HttpSession sess=req.getSession(false);
			String user=(String)sess.getAttribute("user");
			String upass=(String)sess.getAttribute("upass");

			Class.forName("com.mysql.jdbc.Driver");

			Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_task","root","root");
			PreparedStatement ps=con.prepareStatement("select * from servletbasic where uname='"+user+"' and upass='"+upass+"'");
			ResultSet rs =ps.executeQuery();
			if(rs.next())
			{ 
				out.println("<center><table><form action='#' method='get'>"
						+ "<tr><td>Username<input type='text' name='uname' value='"+rs.getString("uname")+"'></td></tr>"
						+ "<tr><td>Email<input type='text' name='uemail' value='"+rs.getString("uemail")+"' readonly></td></tr>"
						+ "<tr><td>Umob<input type='text' name='umob' value='"+rs.getString("umob")+"'></td></tr>"
						+"<tr><td><input type='submit' value='update'></td></tr>");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}