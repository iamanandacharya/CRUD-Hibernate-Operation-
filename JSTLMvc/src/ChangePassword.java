

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

/**
 * Servlet implementation class ChangePassword
 */
@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePassword() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
				 
		String password = request.getParameter("pass");
		String Newpass = request.getParameter("Newpass");
		String Conpass = request.getParameter("Conpass");
		
		if(request.getParameter("Remembers") != null ){
			Cookie c = new Cookie("password", password);
		c.setMaxAge(3600);
		response.addCookie(c);
		}
		
			if(Newpass.equals(Conpass))
			{
				try{
				Connection connection;
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "anand");
				PreparedStatement ps = connection.prepareStatement("select password from regtable where password=?");
				ps.setString(1, password);
				ResultSet rs = ps.executeQuery();
				if(rs.next())
				{
					do
					{
						String pass = rs.getString("password");
						if(password.equals(pass))
						{
					ps =connection.prepareStatement("update regtable set password=? where password=?");
					ps.setString(1, Newpass);
					ps.setString(2, password);
					int i = ps.executeUpdate();
					if(i>0)
					{
					out.print("<script type=\"text/javascript\">");	
					out.print("alert('password Change succesfully')");
					out.print("location='Success.jsp'");
					out.print("</script>");
					RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
					rd.include(request, response);
					}
						}
					}
					while(rs.next());
				}
				else {
					  out.println("<script type=\"text/javascript\">");
			            out.println("alert('Password is Incorrect!');");
			            out.println("location='Changepass.jsp';");
			            out.println("</script>");
			            RequestDispatcher rd=request.getRequestDispatcher("Changepass.jsp");
			            rd.include(request, response);
						}
				
				
			}
		 catch (Exception e) {
			// TODO: handle exception
		}
			}
			else
			{
			      out.println("<script type=\"text/javascript\">");
		            out.println("alert('Passwords Do Not Match');");
		            out.println("location='Changepass.jsp';");
		            out.println("</script>");
		            RequestDispatcher rd=request.getRequestDispatcher("Changepass.jsp");
		            rd.include(request, response);
			}
	}

}
