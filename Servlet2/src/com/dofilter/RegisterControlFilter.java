package com.dofilter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/filter")
public class RegisterControlFilter extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
      System.out.println("accepted");
	}
}