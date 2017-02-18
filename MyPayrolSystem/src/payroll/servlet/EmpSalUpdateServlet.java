package payroll.servlet;

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

import payroll.dao.Dao;
import payroll.daolempl.Daolempl;
import payroll.serviceempl.LoginData;
import payroll.vo.EmpAllowances;
import payroll.vo.SalaryVo;

/**
 * Servlet implementation class EmpSalUpdateServlet
 */
@WebServlet("/EmpSalUpdateServlet")
public class EmpSalUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpSalUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 

          response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        String Id = request.getParameter("sid");
	     //   int Id = Integer.parseInt(request.getParameter("sid"));
	        System.out.println("ID :"+Id);
	        Dao ObjDAO = new Daolempl();
	        String monthOfSalary= request.getParameter("Month Of Salary");
			String yearOfSalary= request.getParameter("year_of_salary");
			String dateOfSalary_pay= request.getParameter("date_of_salary_pay");
			String netPay= request.getParameter("net_pay");
			String workingDays= request.getParameter("working_days");
			String effDays_work= request.getParameter("eff_days_work");
			String empCode= request.getParameter("emp_Code");
			
			HttpSession session = request.getSession();
			session.setAttribute("id", Id);
			session.setAttribute("monthOfSalary", monthOfSalary);
			session.setAttribute("yearOfSalary", yearOfSalary);
			session.setAttribute("dateOfSalary_pay", dateOfSalary_pay);
			session.setAttribute("netPay", netPay);
			session.setAttribute("workingDays", workingDays);
			session.setAttribute("effDays_work", effDays_work);
			session.setAttribute("empCode", empCode);
			
			
			try {
				//this method and object call direct controller class(Logindata.java) 
				List<SalaryVo> salaryUpdateList = LoginData.salaryUpdateList(Id,monthOfSalary,yearOfSalary,dateOfSalary_pay, netPay, workingDays, effDays_work, empCode);
				session.setAttribute("reglist", salaryUpdateList);
				//session.setAttribute("emplists", emplistss);
				//this mathod and object implements in interface and classes and than call controller class (Logindata.java)
				//List<SalaryVo> salaryUpdateList = ObjDAO.salaryUpdateList(Id,monthOfSalary,yearOfSalary,dateOfSalary_pay, netPay, workingDays, effDays_work, empCode);
				
				
		        out.println("<script type=text/javascript>");
			  	out.println("alert('Data Sent Successfully')");
			  	 out.println("</javascript>");
				RequestDispatcher rd = request.getRequestDispatcher("/EmpSalaryDetails.jsp");
				rd.forward(request, response);
			
			} catch (Exception e) {
				// TODO: handle exception
			}
		
			
			
		
	
	
	}

}
