package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class LoginControllerSession extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		//res.setContentType("text/Html");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		if(email.equals("tanay@gmail.com")&&pass.equals("12345"))
		{
			HttpSession session=req.getSession(true);
			session.setAttribute("uEmail",email);
			session.setAttribute("uPass",pass);
			RequestDispatcher rd=req.getRequestDispatcher("sessionPage2.jsp");
			rd.forward(req, res);
			}
		}
}
