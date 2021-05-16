package com.bytecoder;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/alpha")
public class MyFilter implements Filter
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc)
			throws IOException, ServletException {

		String name=req.getParameter("uname");
			String pwd=	  req.getParameter("pwd");
			if(name=="tanay"&&pwd=="1234")
			{
				fc.doFilter(req, res);
			}
			else
			{
				req.setAttribute("msg","Galat Password");
		RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
		rd.include(req,res);
			}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
