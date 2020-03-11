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

@WebServlet("/viewall")
public class ViewAllUserController extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
	
		HttpSession sess=req.getSession(false);
		try
		{		
			
			PrintWriter out=res.getWriter();
			if(sess!=null)
			{
				res.setContentType("text/Html");

				String uemail=(String)sess.getAttribute("uemail");

				Class.forName("com.mysql.jdbc.Driver");
				Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_task","root","root");
				PreparedStatement ps=con.prepareStatement("select * from servletbasic");
				ResultSet rs =ps.executeQuery();
				out.println("<center><h3>Welcome "+uemail+"</h3></center>");



				out.println("<center><table border=1%>");
				out.println("<tr>");
				out.println("<th>Username</th>");
				out.println("<th>Mobileno</th>");
				out.println("<th>Email</th>");
				out.println("<th>Delete</th>");
				out.println("</tr>");
				while(rs.next())
				{ 
					out.println("<tr><td><input type='text' name='uname' value='"+rs.getString("uname")+"' readonly></td>"
							+"<td><input type='text' name='umob' value='"+rs.getString("umob")+"' readonly></td>"
							+"<td><input type='text' name='uemail' size='30' value='"+rs.getString("uemail")+"' readonly></td>"
							+"<td><a href='deletec?uemail="+rs.getString("uemail")+"'>Delete</a></td></tr></form>");

				}
				out.println("</table></center>");
			}
			else
			{
				res.sendRedirect("Login.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}