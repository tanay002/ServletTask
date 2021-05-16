package com.servlet.basicRegistration;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/changepasswordk")
public class ChangePasswordPage extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		HttpSession sess=req.getSession(false);
		try
		{
			PrintWriter out=res.getWriter();


			if(sess!=null)
			{
				String uemail=(String)sess.getAttribute("uemail");
				out.println("<html><body><center><h4>Welcome "+uemail+"</h4>");
				out.println("<table><form action='changep' method='post'>");
				out.println("<tr><td>Current Password</td><td><input type='password' name='currentpass'></td></tr>");
				out.println("<tr><td>New Password</td><td><input type='password' name='newpass'></td></tr>");
				out.println("<tr><td>Confirm Password</td><td><input type='password' name='confpass'></td></tr>");
				out.println("<tr><td><input type='submit' value='change'></td></tr></form></table></body></html>");
			}
			else
			{
				res.sendRedirect("Login.jsp");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}