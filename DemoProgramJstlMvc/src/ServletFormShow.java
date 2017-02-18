

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



import DAO.ShowDatabase;
import DaoVoClass.RegisterDetailsVo;

/**
 * Servlet implementation class ServletFormShow
 */
@WebServlet("/ServletFormShow")
public class ServletFormShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletFormShow() {
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
		if(click != null)
		{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		List<RegisterDetailsVo> regform = ShowDatabase.empListgetBy();
		
			HttpSession session =  request.getSession();
			session.setAttribute("reglist", regform);
			
			System.out.println(regform);
			 out.println("<script type=text/javascript>");
	         out.println("alert('Data show Successfully')");
	         out.println("</script>");
//	         out.println("<td><a href=\"EditRegister.jsp?tid="+rs.getInt(1)+"\">Edit</a></td>");
//       	  out.print("<td><a href=\"DeleteServlet?fid="+ rs.getInt(1) +"\">Delete</a></td></tr>");
       	
		RequestDispatcher rsd = request.getRequestDispatcher("/NewForm.jsp");
		rsd.forward(request, response);
		}   
			
		
	
	}

}
