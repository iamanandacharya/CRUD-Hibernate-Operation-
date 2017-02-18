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
import com.view.Emp;

/**
 * Servlet implementation class DeleteServ
 */
@WebServlet("/DeleteServ")
public class DeleteServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BlManager bl=new BlManager();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");

		Emp emp = bl.SearchByEmp(Integer.parseInt(id));

		bl.DeleteEmp(emp);
		
		
		//again create list after deleting record

		List<Emp> em = bl.SearchAllEmployee();

		HttpSession session = request.getSession();
		session.setAttribute("emplist", em);

		response.sendRedirect("ShowList.jsp");
	}


	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
