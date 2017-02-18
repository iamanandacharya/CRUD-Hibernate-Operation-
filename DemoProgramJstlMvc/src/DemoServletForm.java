

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import DAO.ShowDatabase;
import DaoVoClass.RegisterDetailsVo;

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
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		String username = request.getParameter("name");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String Number = request.getParameter("number");
		String Email = request.getParameter("email");
		
		HttpSession session =  request.getSession();
		
		session.setAttribute("user", username);
		session.setAttribute("pass", password);
		session.setAttribute("add", address);
		session.setAttribute("num", Number);
		session.setAttribute("email", Email);
//		String errmsg="";
//		Map<String, String> messages = new HashMap<String, String>();
//		request.setAttribute("messages", messages);
//		if((username.trim().isEmpty()))
//		{
//			 messages.put("username", "Please enter title");
//		}
//		else if(password.trim().isEmpty()) {
//			messages.put("username", "Please enter title");
//		}
		
		
		try{ 	
		 Connection connection ;
		 Class.forName("com.mysql.jdbc.Driver");
		 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "anand");
		 
		
		 PreparedStatement ps = connection.prepareStatement("insert into regtable(`name`,`password`,`date`,`address`,`phoneNumber`,`email`) values (?,?,Now(),?,?,?)");
         ps.setString(1, username);
         ps.setString(2, password);
         ps.setString(3, address);
         ps.setString(4, Number);
         ps.setString(5, Email);
         ps.executeUpdate();
         out.println("<script type=text/javascript>");
  	    out.println("alert('Data Sent Successfully')");
         RequestDispatcher rd =request.getRequestDispatcher("ServletFormShow");
         rd.forward(request, response);
         
        
         	List<RegisterDetailsVo> regform = ShowDatabase.empListgetBy();
         	session.setAttribute("reglist", regform);
 		
 	         
 	
      
		}
		catch(SQLException|ClassNotFoundException  e)
		{
			e.printStackTrace();
		}
	}
		
	
	
}
