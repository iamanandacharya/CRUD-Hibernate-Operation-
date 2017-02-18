package com.texon.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.texon.Dao.Dao;
import com.texon.daolmpl.DaoLmpl;
import com.texon.vo.EmpListVO;

/**
 * Servlet implementation class EmpListingg
 */
@WebServlet("/EmpListingg")
public class EmpListingg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpListingg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Dao ObjDAO = new DaoLmpl();
		
		
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("emp_code");
		System.out.println(name);
		List<EmpListVO> empList = ObjDAO.empUserView(name);
		HttpSession session = request.getSession();
		session.setAttribute("EmpList", empList);
		
		RequestDispatcher rd= request.getRequestDispatcher("emp_listing.jsp");
		rd.forward(request, response);
		
	}

}
