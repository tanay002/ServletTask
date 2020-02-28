package com.understand.forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class loginController extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{

		String uemail=req.getParameter("uemail");
		String upass=req.getParameter("upass");
		RequestDispatcher rd=req.getRequestDispatcher("/check");
		rd.forward(req,res);
	}
}
