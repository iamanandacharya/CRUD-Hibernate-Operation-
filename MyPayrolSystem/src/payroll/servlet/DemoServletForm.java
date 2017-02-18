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
import payroll.serviceempl.AddData;
import payroll.serviceempl.LoginData;
import payroll.vo.EmpListVO;

/**
 * Servlet implementation class DemoServletForm
 */
@WebServlet("/DemoServletForm")
public class DemoServletForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServletForm() {
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
		String EmpName= request.getParameter("EmpName");
		String Presentadd= request.getParameter("Present_add");
		String City= request.getParameter("City");
		String Pincode= request.getParameter("Pincode");
		String Permanantaddrss= request.getParameter("Permanant_addrss");
		String Phnum= request.getParameter("Ph_num");
		String Mobnum= request.getParameter("Mob_num");
		String Bloodgroup= request.getParameter("Blood_group");
		String Nationality= request.getParameter("Nationality");
		String Languageknown= request.getParameter("Language_known");
		String pancardNum= request.getParameter("pan_card_num");
		String Emptype= request.getParameter("Emp_type");
		String Empgrade= request.getParameter("Emp_grade");
		String Empcode= request.getParameter("Emp_code");
		String Empsignature= request.getParameter("Emp_signature");
		
		HttpSession session = request.getSession();
		session.setAttribute("emp_name", EmpName);
		session.setAttribute("present_add", Presentadd);
		session.setAttribute("city", City);
		session.setAttribute("pincode", Pincode);
		session.setAttribute("permanant_addrss", Permanantaddrss);
		session.setAttribute("ph_num", Phnum);
		session.setAttribute("mob_num", Mobnum);
		session.setAttribute("blood_group", Bloodgroup);
		session.setAttribute("nationality", Nationality);
		session.setAttribute("language_known", Languageknown);
		session.setAttribute("pan_card_num", pancardNum);
		session.setAttribute("emp_type", Emptype);
		session.setAttribute("emp_grade", Empgrade);
		session.setAttribute("emp_image", Empcode);
		session.setAttribute("emp_signature", Empsignature);
		
		try {
			//this method and object call direct controller class(Logindata.java) 
			//List<EmpListVO> emplistss = LoginData.addEmpDatas(EmpName,Presentadd,City, Pincode, Permanantaddrss, Phnum, Mobnum,  Bloodgroup, Nationality ,Languageknown ,pancardNum, Emptype, Empgrade, Empcode, Empsignature);
			//session.setAttribute("emplists", emplistss);
			//this mathod and object implements in interface and classes and than call controller class (Logindata.java)
			List<EmpListVO> emplists = ObjDAO.addEmpData(EmpName,Presentadd,City, Pincode, Permanantaddrss, Phnum, Mobnum,  Bloodgroup, Nationality ,Languageknown ,pancardNum, Emptype, Empgrade, Empcode, Empsignature);
			session.setAttribute("emplists", emplists);
			response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<script type=text/javascript>");
		  	out.println("alert('Data Sent Successfully')");
			RequestDispatcher rd = request.getRequestDispatcher("/EmpDtails.jsp");
			rd.forward(request, response);
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
		
	}

}
