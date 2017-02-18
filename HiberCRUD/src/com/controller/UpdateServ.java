package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BlManager;
import com.view.Dept;
import com.view.Emp;

/**
 * Servlet implementation class UpdateServ
 */
@WebServlet("/UpdateServ")
public class UpdateServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");

		BlManager bl = new BlManager();

		Emp e = bl.SearchByEmpIDSingle(Integer.parseInt(id));

		System.out.println(e.getEmpName());
		
		HttpSession session = request.getSession();
		session.setAttribute("e", e);
		response.sendRedirect("Update.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("empId");
		String name = request.getParameter("empName");
		
		String salary = request.getParameter("empSal");
		String drop = request.getParameter("drop");

		//System.out.println(salary);
		BlManager bl = new BlManager();
		Dept d = new Dept();
		d = bl.searchbyDept(drop);

		Emp empl = new Emp();
		empl.setEmpId(Integer.parseInt(id));
		empl.setEmpName(name);
		
		empl.setEmpSalary(salary);
		empl.setDept(d);

		bl.UpdateEmployee(empl);

		List<Emp> elist = bl.SearchAllEmployee();

		HttpSession session = request.getSession();
		session.setAttribute("emplist", elist);

		response.sendRedirect("ShowList.jsp");

	}

}
