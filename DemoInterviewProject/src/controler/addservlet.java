package controler;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.mail.Address;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Employee;
import BlManager.BlManager;

/**
 * Servlet implementation class addservlet
 */
@WebServlet("/addservlet")
public class addservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addservlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
		String name = request.getParameter("name");
		String adress = request.getParameter("adress");
		String gender = request.getParameter("M");
		
		/*byte gender = Byte.parseByte(request.getParameter("M"));
		*/double salary = Double.parseDouble(request.getParameter("salary"));
		SimpleDateFormat format = new SimpleDateFormat("MM-dd-YYYY");	
		java.util.Date util_StartDate = format.parse( request.getParameter("datetime") );
			java.sql.Date mydatee = new java.sql.Date( util_StartDate.getTime() );
				
		BlManager bl = new BlManager();
		List<Employee> list = bl.insertMethod(name,mydatee,adress,gender,salary);
		System.out.println(list);
		HttpSession session =request.getSession();
		session.setAttribute("Name", name);
		session.setAttribute("address", adress);
		session.setAttribute("gender", gender);
		session.setAttribute("salary", salary);
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("NewFile.jsp");
		rd.forward(request,response);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		} 
		
	}
