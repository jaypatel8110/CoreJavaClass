package com.jay.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jay.beans.BankBean;


public class BankServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String bankName=request.getParameter("bankname");
		int accountNO=Integer.parseInt(request.getParameter("accountNO"));
		int SSN=Integer.parseInt(request.getParameter("SSN"));
		
		HttpSession ss=request.getSession();
//		ss.setAttribute("bn",bankName);
//		ss.setAttribute("ab",accountNO);
//		ss.setAttribute("ssn",SSN);
		
		
		BankBean bbean=new BankBean();
		bbean.setBankName(bankName);
		bbean.setAccountNumber(accountNO);
		bbean.setSSN(SSN);
		
		ss.setAttribute("info", bbean);
		response.sendRedirect("jsp/Bankinfo.jsp");
	}


}
