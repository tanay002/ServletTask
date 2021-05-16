package com.understand.forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check")
public class CheckForwardRequest extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{

		String uemail=req.getParameter("uemail");
		String upass=req.getParameter("upass");
		System.out.println(uemail+" "+upass);
		RequestDispatcher rd=req.getRequestDispatcher("/Login.jsp");
		rd.forward(req,res);
	}
}
