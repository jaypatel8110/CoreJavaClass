package com.jay.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jay.beans.WelcomeOneBean;


public class Welcome1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String middleName = request.getParameter("middleName");
		String lastName = request.getParameter("lastName");
		String gender = request.getParameter("gender");
			
	HttpSession ss = request.getSession();
//		ss.setAttribute("fn", firstName);
//		ss.setAttribute("md", middleName);
//		ss.setAttribute("ln", lastName);
//		ss.setAttribute("gen", gender);
//		response.sendRedirect("jsp/PersonalInfo.jsp");
		
	WelcomeOneBean wbean=new WelcomeOneBean();
	wbean.setFirstName(firstName);
	wbean.setMiddleName(middleName);
	wbean.setLastName(lastName);
	wbean.setGender(gender);
	
	ss.setAttribute("info", wbean);
	response.sendRedirect("jsp/PersonalInfo.jsp");
	}


}
