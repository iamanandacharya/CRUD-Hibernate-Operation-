

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import DAO.ForgotUsername;
import DAO.UserNameMailer;

/**
 * Servlet implementation class ChangeUsernameServlet
 */
@WebServlet("/ChangeUsernameServlet")
public class ChangeUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeUsernameServlet() {
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
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String userName= request.getParameter("username");
		String password = request.getParameter("Password");
		String to = request.getParameter("email");
		
		if(ForgotUsername.validate(userName, password))
		{
			UserNameMailer.send(userName, password, to);
			JOptionPane.showMessageDialog(null, "succesfull");
			 RequestDispatcher rsd =request.getRequestDispatcher("ForgotPassword.jsp");
			rsd.forward(request, response);
			out.print("<script type=text/javascript");
			out.print("alert('Succesfully Mail')");
			out.print("location=location='ForgotPassword.jsp';");
			out.print("</script>");
		}
		else{
//			 out.println("<script type=text/javascript>");
//	         out.println("alert('Email Sent UnSuccessfully')");
//	         out.println("location='ForgotPassword.jsp';");
//	         out.println("</script>");
			JOptionPane.showMessageDialog(null, "Unsuccesfull");
			 RequestDispatcher rsd =request.getRequestDispatcher("ForgotPassword.jsp");
			rsd.forward(request, response);
		}
		
		
		
		
		
	}

}
