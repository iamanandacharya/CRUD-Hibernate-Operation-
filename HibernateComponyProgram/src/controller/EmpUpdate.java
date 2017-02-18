package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BlManager;

import com.view.Employee;

/**
 * Servlet implementation class EmpUpdate
 */
@WebServlet("/EmpUpdate")
public class EmpUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpUpdate() {
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
		int id_1 = Integer.parseInt(request.getParameter("id"));
		String empName = request.getParameter("empName");
		String empPhoneNo = request.getParameter("empNo");
		String empEmail = request.getParameter("empemail");
		Employee e = new Employee();
		BlManager b = new BlManager();
		 e = b.updateMethod(id_1,empName,empPhoneNo,empEmail);
		 response.sendRedirect("Employee.jsp");
		/*RequestDispatcher rd = request.getRequestDispatcher("Employee.jsp");
		rd.include(request, response);*/
	}

}
