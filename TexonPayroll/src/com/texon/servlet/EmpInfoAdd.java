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
 * Servlet implementation class EmpInfoAdd
 */
@WebServlet("/EmpInfoAdd")
public class EmpInfoAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpInfoAdd() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*
		 * add,update,delete servlet call using empInfoDisplay
		 * 
		 */
		Dao ObjDAO = new DaoLmpl();
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("submit");
		String name1 = request.getParameter("update");
		String name2 = request.getParameter("edit");
		System.out.println(name);
		if(name!=null)
		{
			String emplName = request.getParameter("empName");
			String empCode = request.getParameter("empCode");
			String city = request.getParameter("city");
			String designation = request.getParameter("designation");
			
			List<EmpListVO> empLists = ObjDAO.empUserAdds(name,emplName,city,designation);
			HttpSession session = request.getSession();
			session.setAttribute("EmpList", empLists);
			
			RequestDispatcher rd= request.getRequestDispatcher("EmpInfoAdd.jsp");
			rd.forward(request, response);
		}
		else if(name1 != null)
		{
			
		}
		else if(name2 != null)
		{
			
			
		}
		
	}

}
