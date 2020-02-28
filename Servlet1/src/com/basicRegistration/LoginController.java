package com.servlet.basicRegistration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginController extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{

		try
		{
			String uemail=req.getParameter("uemail");
			String upass=req.getParameter("upass");
			Class.forName("com.mysql.jdbc.Driver");

			Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_task","root","root");
			PreparedStatement ps=con.prepareStatement("select * from servletbasic where uemail='"+uemail+"' and upass='"+upass+"'");
			ResultSet rs =ps.executeQuery();
			if(rs.next())
			{  
				PrintWriter ps1=res.getWriter();
				RequestDispatcher rd=req.getRequestDispatcher("Home.jsp");
				rd.include(req,res);
				ps1.println("You have successfully login!....");
			}
			else
			{
				PrintWriter ps1=res.getWriter();
				RequestDispatcher rd=req.getRequestDispatcher("Login.jsp");
				rd.include(req,res);
				ps1.println("Invalid Login or Password Try Again!....");
			}

		}catch (Exception e) 
		{
			RequestDispatcher rd=req.getRequestDispatcher("Contact.jsp");
			rd.forward(req,res);
		}
	}

}
