package com.servlet.basicRegistration;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/changep")
public class PasswordController extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		try
		{
			PrintWriter out=res.getWriter();
			HttpSession ses=req.getSession(false);
			String upass=(String) ses.getAttribute("upass");
			String user=(String) ses.getAttribute("user");
			String currentpass=req.getParameter("currentpass");
			String newpass= req.getParameter("newpass");
			String confp= req.getParameter("confpass");

			if(newpass.equals(confp))  //&&newpass!=null)
			{
				if(upass.equals(currentpass))
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_task","root","root");
					PreparedStatement ps=con.prepareStatement("update servletbasic set upass='"+newpass+"' where upass='"+upass+"' and uname='"+user+"' ");
				     int row=ps.executeUpdate();
				     if(row>0)
				     {
				    	 RequestDispatcher rd=req.getRequestDispatcher("/Home.jsp");
							rd.include(req, res);
							out.println("<center>Password Set Successfully.....!</center"); 
				     }
				}
				else
				{
					RequestDispatcher rd=req.getRequestDispatcher("/changepassword.jsp");
					rd.include(req, res);
					out.println("<center>Current Password doesn't match...Try Again</center");
				}

			}
			else
			{
				RequestDispatcher rd=req.getRequestDispatcher("/changepassword.jsp");
				rd.include(req, res);
				out.println("<center>New Password and Confirm Password doen't matched...Try Again</center");
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
