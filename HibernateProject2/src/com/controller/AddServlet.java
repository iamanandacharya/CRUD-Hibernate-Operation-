package com.controller;

import java.io.IOException;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.view.Employee;

import BlManager.BlManager;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
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
		BlManager  bl = new BlManager();
		Employee e =  new Employee();
		
		String name = request.getParameter("name");
		String adress = request.getParameter("adress");
		String gender = request.getParameter("M");
		
		/*byte gender = Byte.parseByte(request.getParameter("M"));
		*/
		Double salary = Double.parseDouble(request.getParameter("salary"));
		SimpleDateFormat format = new SimpleDateFormat("MM-dd-YYYY");	
		java.util.Date util_StartDate = null;
		try {
			util_StartDate = format.parse( request.getParameter("datetime") );
			e.setName(name);
			e.setAddress(adress);
			e.setGender(gender);
			e.setSalary(salary);
			e.setBirthDate(util_StartDate);
			bl.insetMethod(e);
			request.setAttribute("FromEmployeeInsertServlet", e);
			RequestDispatcher rd = request.getRequestDispatcher("Employee.jsp");
			rd.forward(request, response);
			
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			java.sql.Date mydatee = new java.sql.Date( util_StartDate.getTime() );
				
	
	}

}
