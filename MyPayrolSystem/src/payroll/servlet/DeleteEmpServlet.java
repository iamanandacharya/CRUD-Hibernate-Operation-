package payroll.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteEmpServlet
 */
@WebServlet("/DeleteEmpServlet")
public class DeleteEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        String Id = request.getParameter("fid");
	        //int Id = Integer.parseInt(request.getParameter("fid"));
	       // String Id = request.getParameter("fid");
	        try {
	            Connection connection ;
			 Class.forName("com.mysql.jdbc.Driver");
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "anand");
			
			 PreparedStatement ps = connection.prepareStatement("delete from texon.employeeinfo where emp_code=?");
	         ps.setString(1, Id);
			          
			 int i =  ps.executeUpdate();
			  
	         if(i>0)
	         {
	        	 out.print("Row deleted succesfuley");
	        	 out.println("<br/><br/><br/>");
	             out.println("<a href=\"EmpDtails.jsp\">Go to Home Page</a>");
	         }
			 
//			 ps = connection.prepareStatement("select * from new.regtable");
//			 ResultSet rs= ps.executeQuery();
//			 ResultSetMetaData rsmd = ps.getMetaData();
//	         
//			 out.println("<table>");
//			 out.println("<caption>Register</caption>");
//			 out.println("<tr><td>"+rsmd.getColumnName(1)+"</td>");
//			 out.println("<td>"+rsmd.getColumnName(2)+"</td>");
//			 out.println("<td>"+rsmd.getColumnName(3)+"</td>");
//			 out.println("<td>"+rsmd.getColumnName(4)+"</td>");
//			 out.println("<td>"+rsmd.getColumnName(5)+"</td></tr>");
//			 
//	          while(rs.next())
//	          {
//	        	  out.println("<tr><td>"+rs.getInt(1)+"</td>");
//	        	  out.println("<td>"+rs.getString(2)+"</td>");
//	        	  out.println("<td>"+rs.getString(3)+"</td>");
//	        	  out.println("<td>"+rs.getString(4)+"</td>");
//	        	  out.println("<td>"+rs.getString(5)+"</td>");
//	        	  out.println("<td><a href=\"EditRegister.jsp?tid="+rs.getInt(1)+"\">Edit</a></td>");
//	        	  out.println("<td><a href='DeleteServlet?fid="+ rs.getInt(1) +"'>Delete</a></td></tr>");
//	        	
//	         }
//	          out.println("</table>");
	            
	        } catch (NumberFormatException | ClassNotFoundException | SQLException e) {
	        	System.out.println(e);
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
