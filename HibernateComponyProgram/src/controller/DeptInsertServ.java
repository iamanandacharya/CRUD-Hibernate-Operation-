package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BlManager;

import com.view.Department;

/**
 * Servlet implementation class DeptInsertServ
 */
@WebServlet("/DeptInsertServ")
public class DeptInsertServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

Department d = new Department();
BlManager bl = new BlManager();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeptInsertServ() {
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
		
		String dname = request.getParameter("deptname");
		String code = request.getParameter("code");
		
		d.setDepName(dname);
		d.setDepCode(code);
		
		bl.InsertDept(d);
		
		BlManager b = new BlManager();
		List<Department> list = b.showDmp(); 
		HttpSession session = request.getSession();
		session.setAttribute("list", list);
		
		response.sendRedirect("DepartmentView.jsp");
		
	}

}
