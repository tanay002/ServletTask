package com.understand.forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/send1")
public class NumberSendRedirect1 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{

		String uemail=req.getParameter("num1");
		String upass=req.getParameter("num2");
		res.sendRedirect("number2");
	}
}
