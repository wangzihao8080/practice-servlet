package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo2 extends HttpServlet {
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
//		super.init();
		String name = this.getInitParameter("name");
		ServletConfig config = this.getServletConfig();
		String password = config.getInitParameter("password");
		
		System.out.println(" ¡¾name = "+name+"   password = "+password+"¡¿");
		
		ServletContext context = config.getServletContext();
		context.setAttribute("name", name);
	}
	
}
