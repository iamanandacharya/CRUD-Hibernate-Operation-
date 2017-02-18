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

import payroll.serviceempl.LoginData;
import payroll.vo.EmpListVO;

/**
 * Servlet implementation class NewServletFormDetails
 */
@WebServlet("/NewServletFormDetails")
public class NewServletFormDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewServletFormDetails() {
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
		String click = request.getParameter("submit");
		if(click!=null){
	try {
		List<EmpListVO> empShowDetails = LoginData.empListgetByData();
		HttpSession session =  request.getSession();
		session.setAttribute("reglist", empShowDetails);
		System.out.println(empShowDetails);
		RequestDispatcher rsd = request.getRequestDispatcher("/EmpDtails.jsp");
		rsd.forward(request, response);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
			
	}
	}

}
