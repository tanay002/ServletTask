package com.bytecoder;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DetailAuth extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String name=req.getParameter("name");
		String pwd=req.getParameter("pwd");
		String percent=req.getParameter("percent");
		/*int pass=Integer.parseInt("pwd");*/

		if(name.equals("abc"))
		{
			ServletContext sctx=getServletContext();
			if(pwd.equals(sctx.getInitParameter("pwd")))
			{
				RequestDispatcher rd=req.getRequestDispatcher("FetchData");
				rd.forward(req, res);

			}
			else 
			{
				RequestDispatcher rd=req.getRequestDispatcher("Invalid Username/Password");
				rd.forward(req, res);

			}
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("Invalid Username/Password for main");
			rd.forward(req, res);

		}

	}
}
