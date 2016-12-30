package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
 * Servlet implementation class UpdateEmpServlet
 */
@WebServlet("/UpdateEmpServlet")
public class UpdateEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Employee e = new Employee();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("editid"));
		BlManager bl =new BlManager();
		Employee e = bl.getId(id);
		request.setAttribute("empId", e);
		RequestDispatcher rd = request.getRequestDispatcher("UpdateEmp.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BlManager bl2= new BlManager();
		Employee e2 = new Employee();
		Integer id = Integer.parseInt(request.getParameter("id"));
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
			e2.setEmpId(id);
			e2.setFirstName(fname);
			e2.setLastName(lname);
			e2.setAddress(address);
			e2.setPhone(phNumber);
			e2.setGender(gender);	
			e2.setRole(role);
			e2.setDateOfBirth(mydate);
			bl2.updateMethod(e2);
			request.setAttribute("updateEmpServletAtribute", e2);
			response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<script type=text/javascript>");
		  	out.println("alert('Data Upadte Successfully')");
		  	out.println("</script>");
			RequestDispatcher rd= request.getRequestDispatcher("EmpView.jsp");
			rd.include(request, response);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
