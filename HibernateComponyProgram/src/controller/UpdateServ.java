package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.view.Department;
import com.view.Employee;

import model.BlManager;

/**
 * Servlet implementation class UpdateServ
 */
@WebServlet("/UpdateServ")
public class UpdateServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int eid = Integer.parseInt(request.getParameter("editid"));
		BlManager b = new BlManager();
		
		//List<Employee> list = b.empIdMethod(eid);
		Employee e = b.empIdMethod(eid);
		request.setAttribute("empListId", e);
		RequestDispatcher req = request.getRequestDispatcher("editform.jsp");
		req.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BlManager b1 = new BlManager();
		Employee e1 = new Employee();
		Department D  = new Department();
		Integer id = Integer.parseInt(request.getParameter("id"));
		String name  = request.getParameter("empName");
		String empNo = request.getParameter("empNo");
		String empemail = request.getParameter("empemail");
		String dId1 =request.getParameter("dId");
		D = b1.getDepartIdByName(dId1);
		e1.setEmpId(id);
		e1.setEmpName(name);
		e1.setEmpPhoneNo(empNo);
		e1.setEmpEmail(empemail);
		e1.setDepartment(D);
		b1.update(e1);
		request.setAttribute("e1", e1);
		RequestDispatcher rd = request.getRequestDispatcher("Employee.jsp");
		rd.forward(request, response);
	}

}
