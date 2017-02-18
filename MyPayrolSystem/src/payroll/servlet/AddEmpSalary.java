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
import payroll.vo.EmpDeductionVo;
import payroll.vo.SalaryVo;

/**
 * Servlet implementation class AddEmpSalary
 */
@WebServlet("/AddEmpSalary")
public class AddEmpSalary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmpSalary() {
        super();
        // TODO Auto-generated constructor stub
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  
		
		Dao ObjDAO = new Daolempl();
		String Month_Of_Salary= request.getParameter("Month_Of_Salary");
		String year_of_salary= request.getParameter("year_of_salary");
		String date_of_salary_pay= request.getParameter("date_of_salary_pay");
		String net_pay= request.getParameter("net_pay");
		String working_days= request.getParameter("working_days");
		String eff_days_work= request.getParameter("eff_days_work");
		String emp_code = request.getParameter("emp_code");
		
		
		
		HttpSession session = request.getSession();
		session.setAttribute("Month_Of_Salary", Month_Of_Salary);
		session.setAttribute("year_of_salary", year_of_salary);
		session.setAttribute("date_of_salary_pay", date_of_salary_pay);
		session.setAttribute("net_pay", net_pay);
		session.setAttribute("working_days", working_days);
		session.setAttribute("eff_days_work", eff_days_work);
		session.setAttribute("emp_code",emp_code);
		
		try {
			//this method and object call direct controller class(Logindata.java) 
			//List<EmpListVO> emplistss = LoginData.addEmpDatas(EmpName,Presentadd,City, Pincode, Permanantaddrss, Phnum, Mobnum,  Bloodgroup, Nationality ,Languageknown ,pancardNum, Emptype, Empgrade, Empcode, Empsignature);
			//session.setAttribute("emplists", emplistss);
			//this mathod and object implements in interface and classes and than call controller class (Logindata.java)
			List<SalaryVo> empSalLists = ObjDAO.addEmpSalData(emp_code,Month_Of_Salary,year_of_salary,date_of_salary_pay,net_pay,working_days, eff_days_work);
			session.setAttribute("empSalLists", empSalLists);
			response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<script type=text/javascript>");
		  	out.println("alert('Data Sent Successfully')");
		  	out.println("</script>");
			RequestDispatcher rd = request.getRequestDispatcher("/SalaryFormDetails");
			rd.forward(request, response);
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
		
	}
	
	}


