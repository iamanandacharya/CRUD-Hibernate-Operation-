package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BlManager;

import com.view.Department;
import com.view.Employee;

/**
 * Servlet implementation class DepartmentInfo
 */
@WebServlet("/DepartmentInfo")
public class DepartmentInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BlManager b = new BlManager();
		Department d = new Department();
		if(request.getParameter("showEmployee")!= null ){
			List<Department> dmp = new ArrayList<Department>();
			dmp  = b.showDmp();
			request.setAttribute("dmpDetails", dmp);
			RequestDispatcher rd  = request.getRequestDispatcher("Department.jsp");
			rd.forward(request,response);
			}
	}

}
