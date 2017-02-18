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
 * Servlet implementation class deleteform
 */
@WebServlet("/deleteform")
public class DeleteForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		Employee e = new Employee();
		e.setEmpId(id);
		BlManager b = new BlManager();
		e = b.deleteMethod(e);
		
		RequestDispatcher rd = request.getRequestDispatcher("Employee.jsp");
		rd.include(request, response);
		
	}

}
