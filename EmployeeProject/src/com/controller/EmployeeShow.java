package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BlManager;
import com.view.Employee;

/**
 * Servlet implementation class EmployeeShow
 */
@WebServlet("/EmployeeShow")
public class EmployeeShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Employee e = new Employee();
       BlManager bl = new BlManager();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeShow() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("showEmployee") != null){
			List<Employee> list = bl.showData();
			System.out.println(list);
			HttpSession session = request.getSession();
			session.setAttribute("emplShowAttribute", list);
			RequestDispatcher rd = request.getRequestDispatcher("EmpView.jsp");
			rd.forward(request, response);
			
		}
	}

}
