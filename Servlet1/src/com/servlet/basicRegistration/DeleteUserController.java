package com.servlet.basicRegistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deletec")
public class DeleteUserController extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{  try
	{
		String uemail=req.getParameter("uemail");
		System.out.println(uemail);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_task","root","root");
		PreparedStatement ps=con.prepareStatement("delete from servletbasic where uemail=?");
		ps.setString(1,uemail);
		int row=	ps.executeUpdate();
		if(row>0)
		{

			res.sendRedirect("viewall");	
		}

	}catch (Exception e) {
		e.printStackTrace();
	}

	}

}
