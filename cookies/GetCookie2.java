package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logincook2")
public class GetCookie2 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter out=res.getWriter();
          Cookie c[]=req.getCookies();
          
          int size=c.length;
          for(int i=0;i<size;i++)
          {
        	  out.println(c[i].getValue());
          }

	}
}
