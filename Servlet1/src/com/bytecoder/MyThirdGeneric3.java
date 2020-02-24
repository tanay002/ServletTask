package com.bytecoder;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/third")
public class MyThirdGeneric3 extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws IOException
	{
		PrintWriter ps=res.getWriter();
		ps.println("This is program of generic servlet");
	}
}
