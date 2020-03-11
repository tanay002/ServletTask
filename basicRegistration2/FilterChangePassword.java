package com.servlet.basicRegistration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpSession;

@WebFilter("/changep")
public class FilterChangePassword implements Filter
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc)
			throws IOException, ServletException
	{
		PrintWriter ps=res.getWriter();
		String currentpass=req.getParameter("currentpass");
		String newpass= req.getParameter("newpass");
		String confp= req.getParameter("confpass");
		if(newpass.isEmpty()&&confp.isEmpty())
		{
			RequestDispatcher rd=req.getRequestDispatcher("changepasswordk");
			rd.include(req,res);
			ps.println("<center>New Password and Confirm Password can't be empty</center>");
		}
		else
		{
			fc.doFilter(req, res);
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
