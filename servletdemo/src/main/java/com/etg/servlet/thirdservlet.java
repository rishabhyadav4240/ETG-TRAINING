package com.etg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class thirdservlet
 */
@WebServlet("/thirdservlet")
public class thirdservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		//String name = (String)getServletConfig().getServletContext().getAttribute("personname");
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("personname");
		ServletContext context = request.getServletContext();
		String lname = (String) context.getAttribute("lname");
		out.println(lname);
		out.println(name);
	}

	
	}


