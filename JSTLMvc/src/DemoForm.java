

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DemoForm
 */
@WebServlet("/DemoForm")
public class DemoForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoForm() {
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
	                HttpSession session = request.getSession();
	                session.setAttribute("user", username);
	                session.setAttribute("pass", password);
	                session.setAttribute("add", address);
			
			try{ 	
			 Connection connection ;
			 Class.forName("com.mysql.jdbc.Driver");
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "anand");
			
			 PreparedStatement ps = connection.prepareStatement("insert into regtable(`name`,`password`,`date`,`address`) values (?,?,Now(),?)");
	         ps.setString(1, username);
	         ps.setString(2, password);
	         ps.setString(3, address);
	        
			 ps.executeUpdate();
	         
			 ps = connection.prepareStatement("select * from regtable");
			 ResultSet rs= ps.executeQuery();
			 ResultSetMetaData rsmd = ps.getMetaData();
	         
			 out.println("<table>");
			 out.println("<caption>Register</caption>");
			 out.println("<tr><td>"+rsmd.getColumnName(1)+"</td>");
			 out.println("<td>"+rsmd.getColumnName(2)+"</td>");
			 out.println("<td>"+rsmd.getColumnName(3)+"</td>");
			 out.println("<td>"+rsmd.getColumnName(4)+"</td>");
			 out.println("<td>"+rsmd.getColumnName(5)+"</td></tr>");
			 
	          while(rs.next())
	          {
	        	  out.println("<tr><td>"+rs.getInt(1)+"</td>");
	        	  out.println("<td>"+rs.getString(2)+"</td>");
	        	  out.println("<td>"+rs.getString(3)+"</td>");
	        	  out.println("<td>"+rs.getString(4)+"</td>");
	        	  out.println("<td>"+rs.getString(5)+"</td>");
	        	  out.println("<td><a href=\"EditRegister.jsp?tid="+rs.getInt(1)+"\">Edit</a></td>");
	        	  out.print("<td><a href=\"DeleteServlet?fid="+ rs.getInt(1) +"\">Delete</a></td></tr>");
	        	//  out.println("<td><a href=\"DeleteServletPro.java?fid="+rs.getInt(1)+"\">Delete</a></td></tr>");
	          }
			out.println("</table>");
			}
			
			catch(Exception e)
	                {
	                    System.err.println(e);
	                }
			
	}

}
