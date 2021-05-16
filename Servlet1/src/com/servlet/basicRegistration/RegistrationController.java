package com.servlet.basicRegistration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegistrationController extends HttpServlet
{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		try {
			PrintWriter pw=res.getWriter();
			String uname=req.getParameter("uname");
			String upass=req.getParameter("upass");
			String uemail=req.getParameter("uemail");
			String umob=req.getParameter("umob");
            int umob1=Integer.parseInt(umob);

			Class.forName("com.mysql.jdbc.Driver");

			Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_task","root","root");
			PreparedStatement ps= con.prepareStatement("insert into servletbasic (uname,upass,uemail,umob) values(?,?,?,?)");
			ps.setString(1, uname);
			ps.setString(2, upass);
			ps.setString(3, uemail);
			ps.setInt(4, umob1);
			int row= ps.executeUpdate();

			if(row>0)
			{
				RequestDispatcher rd=req.getRequestDispatcher("Login.jsp");	
				rd.include(req,res);
				pw.print("Thankyou for registration.....");
			}

		} 
		catch (Exception e) {

			RequestDispatcher rd=req.getRequestDispatcher("Contact.jsp");
			rd.forward(req,res);
		}
	}
}
