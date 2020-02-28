package com.understand.forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/number2")
public class NumberSendRedirect2 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		res.sendRedirect("https://www.google.com/");
	}
}
