

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import DAO.LoginData;

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
		String userName = request.getParameter("Name");
		String password = request.getParameter("Password");
		if (request.getParameter("Remember") != null)
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
			
			RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
				rd.forward(request, response);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "UnSuccessfuly Logged In");
			RequestDispatcher rd = request.getRequestDispatcher("Failure.jsp");
			rd.forward(request, response);
		}
	}
		
//	try {
//		Connection connection;
//		Class.forName("com.mysql.jdbc.Driver");
//		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "anand");
//		PreparedStatement ps = connection.prepareStatement("select name,password from regtable where name=? and password=?");
//		ps.setString(1, userName);
//		ps.setString(2, password);
//		ResultSet rs  = ps.executeQuery();
//		
//		if(rs.next())
//		{
//		String n = rs.getString("name");
//		String p = rs.getString("password");
//		if(userName.equals(n) && password.equals(p))
//		{
//			JOptionPane.showMessageDialog(null, "Successfuly Logged In");
//		HttpSession session =  request.getSession();
//		session.setAttribute("user", userName);
//		session.setAttribute("pass", password);
//		
//		RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
//			rd.forward(request, response);
//			
//		}
//		}
//		else if(!rs.next())
//		{
//			JOptionPane.showMessageDialog(null, "UnSuccessfuly Logged In");
//			RequestDispatcher rd = request.getRequestDispatcher("Failure.jsp");
//			rd.forward(request, response);
//		}
//		} catch (SQLException |ClassNotFoundException e) {
//			System.err.println(e);
//		// TODO: handle exception
//	}
//	
//	
//	}

}
