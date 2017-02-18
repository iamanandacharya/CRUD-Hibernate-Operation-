

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import DAO.DatabaseFetchMail;
import DAO.LoginData;
import DAO.Mailer;


/**
 * Servlet implementation class EmailServlet
 */
@WebServlet("/EmailServlet")
public class EmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmailServlet() {
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
		String to = request.getParameter("email");
		
		
		String username = request.getParameter("uname");
		 String password = request.getParameter("password");
		
		 if(DatabaseFetchMail.fetchdata(username,password))
		 {
		 Mailer.send(to , username, password);
         out.println("<script type=text/javascript>");
         out.println("alert('Email Sent Successfully')");
         out.println("location='ForgotPassword.jsp';");
         out.println("</script>");
         
		 }
		 else {
			 out.println("<script type=text/javascript>");
	         out.println("alert('Email Sent UnSuccessfully')");
	         out.println("location='ForgotPassword.jsp';");
	         out.println("</script>");
//			 JOptionPane.showMessageDialog(null, "Unsuccesfull");
//			 RequestDispatcher rsd =request.getRequestDispatcher("ForgotPassword.jsp");
//			 rsd.forward(request, response);
			
		}
	}
}




