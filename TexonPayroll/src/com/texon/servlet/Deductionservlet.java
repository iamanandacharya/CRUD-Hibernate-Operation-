package com.texon.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.texon.Dao.Dao;
import com.texon.daolmpl.DaoLmpl;
import com.texon.vo.BankVO;
import com.texon.vo.DeductionVO;

/**
 * Servlet implementation class Deductionservlet
 */
@WebServlet("/Deductionservlet")
public class Deductionservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Dao ObjDAO = new DaoLmpl();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Deductionservlet() {
        super();
        // TODO Auto-generated constructor stub
    }
/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("name");
		System.out.println("Name "+ name);
		List<DeductionVO> dedList = ObjDAO.deductionUserView(name);
		 String retVals = gson.toJson(dedList);
		 pw.append(retVals);
		
	}

}
