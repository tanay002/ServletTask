package com.dofilter;

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

@WebFilter("/filter")
public class FilterEdit implements Filter
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain ch)
			throws IOException, ServletException 
	     {
		System.out.println("PreProcessing");
		RequestDispatcher rd=null;
		PrintWriter ps=  res.getWriter(); 
		String umob=req.getParameter("umob");
		long k=Long.parseLong(umob);
		
	/*	int count=1;
		while(k/10!=0)
		{ 
			count++;
			k=k/10;
		}  
		
		System.out.println(count);
		*/
		if(umob.length()==10)                                     
		{
			ch.doFilter(req,res);
		}
		else
		{
		
			rd=req.getRequestDispatcher("/filterReg.jsp");
			rd.include(req, res);
			ps.print("<center>Mobile length should be 10 digit</center>");
		
		}

		System.out.println("PostProcessing");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
