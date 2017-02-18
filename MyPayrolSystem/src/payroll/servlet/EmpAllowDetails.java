package payroll.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import payroll.serviceempl.LoginData;
import payroll.vo.EmpAllowances;
import payroll.vo.EmpListVO;

import java.util.*;
/**
 * Servlet implementation class EmpAllowDetails
 */
@WebServlet("/EmpAllowDetails")
public class EmpAllowDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpAllowDetails() {
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
		
		String Click = request.getParameter("submit");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			if(Click == null){
				List<EmpAllowances> empShowDetails = LoginData.empAllowListget();
				HttpSession session =  request.getSession();
				session.setAttribute("reglist", empShowDetails);
				System.out.println(empShowDetails);
				RequestDispatcher rsd = request.getRequestDispatcher("/EmpAllowDetails.jsp");
				rsd.forward(request, response);
			}
			else{
				String d1 = request.getParameter("emp_code");
				List<EmpAllowances> regform = LoginData.empAllowDisplaytBy(d1);
				HttpSession session =  request.getSession();
				session.setAttribute("regform", regform);
				System.out.println(regform);
			    out.println("<script type=text/javascript>");
			    out.println("alert('Data show Successfully')");
			    out.println("</script>");
//			         out.println("<td><a href=\"EditRegister.jsp?tid="+rs.getInt(1)+"\">Edit</a></td>");
//		       	  out.print("<td><a href=\"DeleteServlet?fid="+ rs.getInt(1) +"\">Delete</a></td></tr>");
		       	
				RequestDispatcher rsd = request.getRequestDispatcher("/EmpAllowDetails.jsp");
				rsd.forward(request, response);
//			         out.println("<td><a href=\"EditRegister.jsp?tid="+rs.getInt(1)+"\">Edit</a></td>");
//		       	  out.print("<td><a href=\"DeleteServlet?fid="+ rs.getInt(1) +"\">Delete</a></td></tr>");
		   }
			
		 
	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
