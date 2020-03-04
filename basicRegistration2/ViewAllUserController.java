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
		try
		{		
			PrintWriter out=res.getWriter();
			HttpSession sess=req.getSession(false);

			
				res.setContentType("text/Html");

				String user=(String)sess.getAttribute("user");

				Class.forName("com.mysql.jdbc.Driver");
				Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_task","root","root");
				PreparedStatement ps=con.prepareStatement("select * from servletbasic");
				ResultSet rs =ps.executeQuery();
				out.println("<center><h3>Welcome "+user+"</h3></center>");



				out.println("<center><table border=1%>");
				out.println("<tr>");
				out.println("<th>Username</th>");
				out.println("<th>Mobileno</th>");
				out.println("<th>Email</th>");
				out.println("</tr>");
				while(rs.next())
				{ 
					out.println("<tr><td><input type='text' name='uname' value='"+rs.getString("uname")+"' disabled></td>"
							+"<td><input type='text' name='umob' value='"+rs.getString("umob")+"' disabled></td>"
							+"<td><input type='text' name='uemail' size='30' value='"+rs.getString("uemail")+"' disabled></td></tr>");

				}
				out.println("</table></center>");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}