package com.servlet.basicRegistration;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/homej")
public class HomeController extends HttpServlet
{

	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		HttpSession sess=req.getSession(false);
		try
		{ 
			res.setContentType("text/Html");
			PrintWriter out=res.getWriter();
		
             
			if(sess!=null)
			{
					res.sendRedirect("Login.jsp");
			}
			String uemail=  (String)sess.getAttribute("uemail");    
			String password=  (String)sess.getAttribute("upass");  
	
			out.print("<html><body><center><h4>Welcome "+uemail+"</h4></center>");
			out.println("<center><table><tr><td><a href='viewpuserr'>View User Details</a></td></tr>"
					+"<tr><td><a href='viewall'>All User Details</a></td></tr>" 
					+"	<tr><td><a href='changepasswordk'>Password</a></td></tr>"
					+"<tr><td><a href='logout'>Logout</a></td></tr>"
					+"</table></center></body></html>");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
