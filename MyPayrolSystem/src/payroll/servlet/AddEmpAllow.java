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
import payroll.vo.EmpAllowances;
import payroll.vo.EmpListVO;

/**
 * Servlet implementation class AddEmpAllow
 */
@WebServlet("/AddEmpAllow")
public class AddEmpAllow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmpAllow() {
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
		Dao ObjDAO = new Daolempl();
		 
		String Basic= request.getParameter("Basic");
		String HRA= request.getParameter("HRA");
		String ConveyanceAllowances= request.getParameter("ConveyanceAllowances");
		String MedicalAlowances= request.getParameter("MedicalAlowances");
		String SpecialAllowances= request.getParameter("SpecialAllowances");
		String MonthlyIncentive= request.getParameter("MonthlyIncentive");
		String Perquisites= request.getParameter("Perquisites");
		String ChildEduAllow= request.getParameter("ChildEduAllow");
		String Gross= request.getParameter("Gross");
		String BalanceForward= request.getParameter("BalanceForward");
		String Reimbursement= request.getParameter("Reimbursement");
		String TotalAllow= request.getParameter("TotalAllow");
		String Month= request.getParameter("Month");
		String Year= request.getParameter("Year");
		String ModifiedDate= request.getParameter("ModifiedDate");
		String EmpCode= request.getParameter("EmpCode");
		HttpSession session = request.getSession();
		session.setAttribute("Basic", Basic);
		session.setAttribute("HRA", HRA);
		session.setAttribute("ConveyanceAllowances", ConveyanceAllowances);
		session.setAttribute("MedicalAlowances", MedicalAlowances);
		session.setAttribute("SpecialAllowances", SpecialAllowances);
		session.setAttribute("MonthlyIncentive", MonthlyIncentive);
		session.setAttribute("Perquisites", Perquisites);
		session.setAttribute("ChildEduAllow", ChildEduAllow);
		session.setAttribute("Gross", Gross);
		session.setAttribute("BalanceForward", BalanceForward);
		session.setAttribute("Reimbursement", Reimbursement);
		session.setAttribute("TotalAllow", TotalAllow);
		session.setAttribute("Month", Month);
		session.setAttribute("Year", Year);
		session.setAttribute("ModifiedDate", ModifiedDate);
		session.setAttribute("EmpCode", EmpCode);
		try {
			//this method and object call direct controller class(Logindata.java) 
			//List<EmpListVO> emplistss = LoginData.addEmpDatas(EmpName,Presentadd,City, Pincode, Permanantaddrss, Phnum, Mobnum,  Bloodgroup, Nationality ,Languageknown ,pancardNum, Emptype, Empgrade, Empcode, Empsignature);
			//session.setAttribute("emplists", emplistss);
			//this mathod and object implements in interface and classes and than call controller class (Logindata.java)
			List<EmpAllowances> empAllowLists = ObjDAO.addEmpAllowData(Basic,HRA,ConveyanceAllowances, MedicalAlowances, SpecialAllowances, MonthlyIncentive, Perquisites,  ChildEduAllow, Gross ,BalanceForward ,Reimbursement, TotalAllow, Month, Year, ModifiedDate,EmpCode);
			session.setAttribute("empAllowLists", empAllowLists);
			response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<script type=text/javascript>");
		  	out.println("alert('Data Sent Successfully')");
		  	out.println("</script>");
			RequestDispatcher rd = request.getRequestDispatcher("/EmpAllowDetails.jsp");
			rd.forward(request, response);
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
		
	}
	}


