

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
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
	        //String name = request.getParameter("sid");
	        int Id = Integer.parseInt(request.getParameter("sid"));
	        System.out.println("ID :"+Id);
	        String Name = request.getParameter("name");
	        String Password = request.getParameter("password");
	        String Address = request.getParameter("address");
	        String Number = request.getParameter("number");
			String Email = request.getParameter("email");
	        try {
	            Connection connection;
	             Class.forName("com.mysql.jdbc.Driver");
	             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "anand");
	             
	             PreparedStatement ps = connection.prepareStatement("update regtable set name=?, password=?, date=Now(), address=?, phoneNumber=?, email=? where id=? ");                                
	             ps.setString(1, Name);
	             ps.setString(2, Password);
	             ps.setString(3, Address);
	             ps.setString(4, Number);
	             ps.setString(5, Email);
	             ps.setInt(6, Id);
	             int i = ps.executeUpdate();
	             if(i>0)
	             {
	            	 out.println("<script type=\"text/javascript\">");
	            	 out.println("alert('Register Successful')");
	            	 out.println("location=NewForm.jsp;");
	            	 out.println("</script>");
	            	 RequestDispatcher rd = request.getRequestDispatcher("NewForm.jsp");
	            	 rd.include(request, response);
	             }
//	             ps = connection.prepareStatement("select * from regtable");
//	             ResultSet rs= ps.executeQuery();
//	             ResultSetMetaData rsmp = ps.getMetaData();
//	             out.print("<table>");
//	             out.print("<caption> Register </caption>");
//	             out.print("<tr><td>" + rsmp.getColumnName(1) + "</td>");
//	             out.print("<td>" + rsmp.getColumnName(2) + "</td>");
//	             out.print("<td>" + rsmp.getColumnName(3) + "</td>");
//	             out.print("<td>" + rsmp.getColumnName(4) + "</td>");
//	             out.print("<td>" + rsmp.getColumnName(5) + "</td></tr>");
//	         
//	             while(rs.next())
//	             {
//	                 out.print("<tr><td>" + rs.getInt(1) + "</td>");
//	                 out.print("<td>" + rs.getString(2) + "</td>");
//	                 out.print("<td>" + rs.getString(3) + "</td>");
//	                 out.print("<td>" + rs.getString(4) + "</td>");
//	                 out.print("<td>" + rs.getString(5) + "</td></tr>");
//	             }
//	             out.printf("</table>");
	        } catch (SQLException|ClassNotFoundException|NumberFormatException e) 
	        {
	            System.out.println(e);
	        }
	
	
	}

}
