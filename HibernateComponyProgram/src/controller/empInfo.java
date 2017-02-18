package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BlManager;

import com.view.Department;
import com.view.Employee;

/**
 * Servlet implementation class empInfo
 */
@WebServlet("/empInfo")
public class empInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
      Employee e = new Employee();
      BlManager b = new BlManager();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public empInfo() {
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
		HttpSession session = request.getSession();
		
		String empName = request.getParameter("empName");
		String empPhoneNo = request.getParameter("empNo");
		String empEmail = request.getParameter("empemail");
		
		/*SimpleDateFormat format = new SimpleDateFormat("0000-00-00");	
		java.util.Date util_StartDate = null;
		try {
			util_StartDate = format.parse( request.getParameter("date") );
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			java.sql.Date mydatee = new java.sql.Date( util_StartDate.getTime() );*/
			
		session.setAttribute("empName",empName);
		session.setAttribute("empPhoneNo",empPhoneNo);
		session.setAttribute("empEmail", empEmail);
		//session.setAttribute("date", mydatee);
		e.setEmpName(empName);
		e.setEmpPhoneNo(empPhoneNo);
		e.setEmpEmail(empEmail);
	//	e.setEmpDate(mydatee);
		
		String dId1  = request.getParameter("dId");
	
		Department d = new Department();
		d = b.getDepartIdByName(dId1);
		
		e.setDepartment(d);
		
		session.setAttribute("E",e);
		
		b.insertOperation(e);
		response.sendRedirect("Employee.jsp");
		
	}

}
