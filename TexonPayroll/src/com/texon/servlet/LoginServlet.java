package com.texon.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.texon.Dao.Dao;
import com.texon.daolmpl.DaoLmpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Dao ObjDAO = new DaoLmpl(); 
    
    public LoginServlet() {
        super();
      
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//
//		String user_N = "root";
//		String Password_N = "123";
		String user_Name = request.getParameter("user_name");
		String Password_Name = request.getParameter("user_password");
		
		RequestDispatcher rd = null;
		boolean result = ObjDAO.login(user_Name, Password_Name);
		if(result==true){
//			boolean result = ObjDAO.login(user_Name, Password_Name);
			request.getSession().setAttribute("user", user_Name);
			rd = request.getRequestDispatcher("/dashboard.jsp");
			rd.forward(request, response);
		}else{
			String msg="Incorrect userid or password ";
			request.setAttribute("msg", msg);
			rd = request.getRequestDispatcher("/login.jsp");
			rd.forward(request, response);
		}
				
		
	}

}
