package com.jay.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jay.beans.ContactBean;

public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String address=request.getParameter("add");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String country=request.getParameter("countey");
		int phone=Integer.parseInt(request.getParameter("phone"));
		
//		ss.setAttribute("ad",address);
//		ss.setAttribute("city",city);
//		ss.setAttribute("state",state);
//		ss.setAttribute("country",country);
//		ss.setAttribute("phone",phone);
		
		HttpSession ss=request.getSession();
		ContactBean cBean = new ContactBean();
		cBean.setAddress(address);
		cBean.setCity(city);
		cBean.setState(state);
		cBean.setCountry(country);
		cBean.setPhone(phone);
		
		ss.setAttribute("info", cBean);
		response.sendRedirect("jsp/Contactinfo.jsp");
		
	}

}
