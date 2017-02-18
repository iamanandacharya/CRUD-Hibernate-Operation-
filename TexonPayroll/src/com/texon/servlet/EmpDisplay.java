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

import com.texon.vo.EmpListVO;
import com.texon.Dao.Dao;
import com.texon.daolmpl.DaoLmpl;

/**
 * Servlet implementation class EmpDisplay
 */
@WebServlet("/EmpDisplay")
public class EmpDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		Dao ObjDAO = new DaoLmpl();
		PrintWriter pw = response.getWriter();
		List<EmpListVO> empList = ObjDAO.empDisplayView();
		HttpSession session = request.getSession();
        session.setAttribute("EmpList", empList);
        System.out.println(empList.get(0).getEmpName());
        RequestDispatcher rd=request.getRequestDispatcher("/EmpDisplyData.jsp");
		rd.forward(request, response);
	
	
	}

}
