package com.aditya.servlets;

import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ServletReq extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				response.setContentType("text/html");
				PrintWriter out=response.getWriter();
				out.println("<html><body><h1>");
				String name=request.getParameter("name");
				out.println("Welcome:"+name+"<br>");
				int cl=request.getContentLength();
				out.println("Content Length is:"+cl+"<br>");
				String ce=request.getCharacterEncoding();
				out.println("Character Encoding is:"+ce+"<br>");
				String ct=request.getContentType();
				out.println("Content Type is:"+ct+"<br>");
				int sp=request.getServerPort();
				out.println("Server Port Number is:"+sp+"<br>");
				String sn=request.getServerName();
				out.println("Server Name is:"+sn+"<br>");
				out.println("</h1></body></html>");
	}

}
