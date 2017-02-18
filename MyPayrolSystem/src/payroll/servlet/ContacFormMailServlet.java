package payroll.servlet;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class ContacFormMailServlet
 */
@WebServlet("/ContacFormMailServlet")
@MultipartConfig
public class ContacFormMailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContacFormMailServlet() {
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
		String Name = request.getParameter("name");
		String email = request.getParameter("email");
		String number = request.getParameter("number");
		String comments = request.getParameter("comments");
		String to = request.getParameter("to");
		String cc = request.getParameter("cc");
		String bcc = request.getParameter("bcc");
		String filename = "C:/Users/Anand Acharya/Documents/resume_anand.docx";
//		final Part p = request.getPart("fileUpload");
//		String fileName = p.getName();
//		
//		if (p != null)
//		{
//			Upload.Attach(p,fileName);
//		}
		
		final String from = "opencloud20@gmail.com";
		final String pass = "opencloud";
		
		
		
		Properties props = new Properties();
		 props.put("mail.smtp.host", "smtp.gmail.com");  
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.port", "587");
		Session session = Session.getDefaultInstance(props,  
			    new javax.mail.Authenticator() {  
			     protected PasswordAuthentication getPasswordAuthentication() {  
			      return new PasswordAuthentication(from,pass);  
			     }  
			      });  
		try {
			
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			 if (to.indexOf(',')>0 || cc.indexOf(',')>0 || bcc.indexOf(',')>0)
	            {
				 msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to.trim()));
			//	 msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(cc.trim()));
			//	 msg.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(bcc.trim()));
	            }
	            else
	           {
	            	msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to.trim()));
		//	msg.addRecipient(Message.RecipientType.CC, new InternetAddress(cc.trim()));
	      //      	msg.addRecipient(Message.RecipientType.BCC, new InternetAddress(bcc.trim()));
	            }
		
			msg.setSubject("Message");
			
			MimeBodyPart messageBodyPart1 = new MimeBodyPart();  
	    	messageBodyPart1.setText("MessageBody");
			
	    	MimeBodyPart messageBodyPart2 = new MimeBodyPart(); 
	    	
	    	FileDataSource ds= new FileDataSource(filename); 
			messageBodyPart1.setDataHandler(new DataHandler(ds));
			messageBodyPart1.setFileName(ds.getName());
			System.out.println("file: "+ds);
			
			Multipart multiPart = new MimeMultipart();
			multiPart.addBodyPart(messageBodyPart1);
			multiPart.addBodyPart(messageBodyPart2);
			
			msg.setContent(multiPart);
//			msg.setText("Name" + Name);
//			msg.setText("email" + email);
//			msg.setText("Number" + number);
//			msg.setText("commentss" + comments);
//			msg.setText("File" +file);
			Transport.send(msg);
			System.out.println("msg Send" + msg );
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<script type=text/javascript>");
	         out.println("alert('Email Sent Successfully')");
	         out.println("location='Success.jsp';");
	         out.println("</script>");
	        
		}
		
		
		
	
	
		catch (MessagingException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
		
	}	
		
	}


