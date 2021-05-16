package com.hidden;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firstrun")
public class HiddenRegisterController extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)
{
	/*try
	{*/
	String uname=req.getParameter("username");
	String password=req.getParameter("password");
	String email=req.getParameter("email");
	String mobno=req.getParameter("mobno");
	
	System.out.println(uname+" "+password+" "+email+" "+mobno);
	/*
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_task","root","root");
PreparedStatement ps=	con.prepareStatement("insert into servletbasic (uname,upass,uemail,umob) value (?,?,?,?);");
     
     ps.setString(1, uname);
     ps.setString(2,password);
     ps.setString(3,email);
     ps.setString(4,mobno);
     int row=ps.executeUpdate();
     if(row>0)
     {
    	 PrintWriter psk=res.getWriter();
    	 psk.println("Registration successfully done..........!");
     }
	
	}catch (Exception e) {
	e.printStackTrace();
	}
	*/
}
}
