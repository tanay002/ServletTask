package com.servlet.basicRegistration;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class Logout extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		try
		{
			PrintWriter out=res.getWriter();
			HttpSession sess=req.getSession(false);
			if(sess!=null)
			{
				sess.invalidate();
				RequestDispatcher rd=req.getRequestDispatcher("/Login.jsp");
				rd.include(req, res);
				out.print("<center>Successfully logout....!</center>");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
