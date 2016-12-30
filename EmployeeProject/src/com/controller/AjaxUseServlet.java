package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.model.BlManager;
import com.view.Employee;


/**
 * Servlet implementation class AjaxUseServlet
 */
@WebServlet("/AjaxUseServlet")
public class AjaxUseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxUseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	// TODO Auto-generated method stub
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		System.out.println(name);
		BlManager bl =new BlManager();
		List<Employee> e = bl.getName(name);
		Gson gs = new Gson();
		String json = gs.toJson(e);
		out.append(json);
		System.out.println(e);
	
	
		}

}
