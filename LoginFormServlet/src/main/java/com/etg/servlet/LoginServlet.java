package com.etg.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etg.servlet.services.LoginInterface;
import com.etg.servlet.services.impl.Login;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    PrintWriter out = response.getWriter();
	    LoginInterface login = new Login();
		boolean flag = true;
		flag = login.validateUser(request.getParameter("username"), request.getParameter("password"));
		System.out.println(flag);
		if(flag==true) {
			out.println("Successufly logged in !");
			
		}
		else {
			out.println("incorrect credentials, please check username and password !");
			
		}
	    
	    
		
	}


	}


