package payroll.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import javax.websocket.Session;

import payroll.serviceempl.LoginData;



/**
 * Servlet implementation class LoginForm
 */
@WebServlet("/LoginForm")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginForm() {
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
		String userName= request.getParameter("Name");
		String password = request.getParameter("Password");
		
		if (request.getParameter("remember_me") != null)
		{
			Cookie c = new Cookie("userid", userName);
			c.setMaxAge(60*30);
			response.addCookie(c);
		}
		
		if(LoginData.validate(userName, password))
		{
			JOptionPane.showMessageDialog(null, "Successfuly Logged In");
			HttpSession session =  request.getSession();
			session.setAttribute("user", userName);
			session.setAttribute("pass", password);
			
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
				rd.forward(request, response);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "UnSuccessfuly Logged In");
			RequestDispatcher rd = request.getRequestDispatcher("LoginForm.jsp");
			rd.forward(request, response);
		}
		
		
		
	}

}
