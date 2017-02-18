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
 * Servlet implementation class EmpAllwUpdateServle
 */
@WebServlet("/EmpAllwUpdateServle")
public class EmpAllwUpdateServle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpAllwUpdateServle() {
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
			session.setAttribute("id", Id);
			session.setAttribute("basic", Basic);
			session.setAttribute("hra", HRA);
			session.setAttribute("con_allow", ConveyanceAllowances);
			session.setAttribute("medical_allow", MedicalAlowances);
			session.setAttribute("special_alow", SpecialAllowances);
			session.setAttribute("monthly_Ince", MonthlyIncentive);
			session.setAttribute("prec", Perquisites);
			session.setAttribute("child_allow", ChildEduAllow);
			session.setAttribute("gross", Gross);
			session.setAttribute("bala_forw", BalanceForward);
			session.setAttribute("reimb", Reimbursement);
			session.setAttribute("total_alllow", TotalAllow);
			session.setAttribute("month", Month);
			session.setAttribute("year", Year);
			session.setAttribute("mod_date", ModifiedDate);
			session.setAttribute("EmpCode", EmpCode);
			
			try {
				//this method and object call direct controller class(Logindata.java) 
				//List<EmpListVO> emplistss = LoginData.addEmpDatas(EmpName,Presentadd,City, Pincode, Permanantaddrss, Phnum, Mobnum,  Bloodgroup, Nationality ,Languageknown ,pancardNum, Emptype, Empgrade, Empcode, Empsignature);
				//session.setAttribute("emplists", emplistss);
				//this mathod and object implements in interface and classes and than call controller class (Logindata.java)
				List<EmpAllowances> empUpdateLists = ObjDAO.AllowupdateList(Id,Basic,HRA,ConveyanceAllowances, MedicalAlowances, SpecialAllowances, MonthlyIncentive, Perquisites,  ChildEduAllow, Gross ,BalanceForward ,Reimbursement, TotalAllow, Month, Year, ModifiedDate,EmpCode);
				session.setAttribute("emplists", empUpdateLists);
				
		        out.println("<script type=text/javascript>");
			  	out.println("alert('Data Sent Successfully')");
			  	 out.println("</javascript>");
				RequestDispatcher rd = request.getRequestDispatcher("/EmpAllowDetails.jsp");
				rd.forward(request, response);
			
			} catch (Exception e) {
				// TODO: handle exception
			}
		
			
			
		
	
	}
	}


