package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManager;
import com.view.Employee;

/**
 * Servlet implementation class AddEmpServlet
 */
@WebServlet("/AddEmpServlet")
public class AddEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
       BlManager b = new BlManager();
       Employee e = new Employee();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname =request.getParameter("fname");
		String lname =request.getParameter("lname");
		String address =request.getParameter("address");
		int phNumber = Integer.parseInt(request.getParameter("phNumber"));
		String gender =request.getParameter("gender");
		String role =request.getParameter("role");
		
		SimpleDateFormat format = new SimpleDateFormat("MM-dd-YYYY");
		
		try {
			java.util.Date date = format.parse(request.getParameter("date"));
			java.sql.Date mydate = new java.sql.Date( date.getTime());
			System.out.println(mydate);
			e.setFirstName(fname);
			e.setLastName(lname);
			e.setAddress(address);
			e.setPhone(phNumber);
			e.setGender(gender);
			e.setRole(role);
			e.setDateOfBirth(mydate);
			b.insertMethod(e);
			response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<script type=text/javascript>");
		  	out.println("alert('Data Sent Successfully')");
		  	out.println("</script>");
			RequestDispatcher rd = request.getRequestDispatcher("EmpView.jsp");
			rd.forward(request, response);
			System.out.println(e);
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
