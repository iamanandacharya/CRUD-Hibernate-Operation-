package com.jwt.hibernate.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.jwt.hibernate.dao.RegisterDAO;

/**
 * Servlet implementation class RegisetrControlerServlet
 */
public class RegisetrControlerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisetrControlerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Name= request.getParameter("Name");
		String Password = request.getParameter("Password");
		String Address= request.getParameter("Address");
		String Email = request.getParameter("Email");
		String PhNumber = request.getParameter("PhoneNumber");
		HttpSession session = request.getSession();
		
		try {
			RegisterDAO red = new RegisterDAO();
			red.validate(Name, Password , Address , Email, PhNumber);
			RequestDispatcher rds = request.getRequestDispatcher("Success.java");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
