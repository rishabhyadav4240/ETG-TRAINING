package com.etg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		response.setBufferSize(1000);
		String firstname=request.getParameter("fname");
		HttpSession session = request.getSession();
		session.setAttribute("personname", firstname);
		String lastname=request.getParameter("lname");
		request.getServletContext().setAttribute("lname", lastname);
		String classname=request.getParameter("cname");
		out.println(firstname+ "<br>");
		out.println(lastname+ "<br>");
		out.println(classname+ "<br>");
		out.println(new java.util.Date());
		out.println(response.getStatus());
		//out.println(request.getProtocol());
		//Enumeration headerNames = request.getHeaderNames();
				//while(headerNames.hasMoreElements()) {
				//	String headerName = (String)headerNames.nextElement();
				//	out.println("<TR><TD>" + headerName);
				//	out.println(" <TD>" + request.getHeader(headerName));
				//}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request,response);
	}
}
