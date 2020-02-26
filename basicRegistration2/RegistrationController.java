package com.servlet.basicRegistration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegistrationController extends HttpServlet
{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String uname=req.getParameter("uname");
		String upass=req.getParameter("upass");
		String uemail=req.getParameter("uemail");
		String umob=req.getParameter("umob");

		try {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_task","root","root");
	   PreparedStatement ps= con.prepareStatement("insert into servletbasic (uname,upass,uemail,umob) values(?,?,?,?)");
	   ps.setString(1, uname);
	   ps.setString(2, upass);
	   ps.setString(3, uemail);
	   ps.setString(4, umob);
	   ps.executeUpdate();
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		PrintWriter ps=res.getWriter();
		ps.print("Thankyou for registration.....");
	}
}
