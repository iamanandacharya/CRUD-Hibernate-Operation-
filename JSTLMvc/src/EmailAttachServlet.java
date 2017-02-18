

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.activation.FileDataSource;
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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
/**
 * Servlet implementation class EmailAttachServlet
 */
@WebServlet("/EmailAttachServlet")
@MultipartConfig
public class EmailAttachServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmailAttachServlet() {
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
  
        String to=request.getParameter("to");
        String cc=request.getParameter("cc");
        String bcc=request.getParameter("bcc");
        String subject=request.getParameter("subject");  
        String msg=request.getParameter("msg");
        final Part filePart = request.getPart("file");
        final String fileName = getFileName(filePart);
        
//        System.out.println(fileName + "filename");
//        
//        if(filePart != null)
//        {
//        Upload.Attachment(filePart, fileName);
//        }
        //dummy gmail id and password,this email id is sender to send a message
        final String from="opencloud20@gmail.com"; 
        final String pass="opencloud";
        //properties is java.util package interface it is used for to set protocoals version,port,authentication
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");  
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "587");
        
        //session object is used for to get properties,aunthenticate password.
        Session session = Session.getInstance(props, new javax.mail.Authenticator() 
        {  
        protected PasswordAuthentication getPasswordAuthentication() 
        {  
        return new PasswordAuthentication(from,pass);  
        }
        });
        
        try
        {
        	//MIME is a Multipurpose Internet Mail Extensions.that can be sent data over the internet this data is file,images,charchter and etc.
        	//so session object is contains in MIMEMessage message object
        MimeMessage message = new MimeMessage(session);
        //this is send email by sender
        message.setFrom(new InternetAddress(from));
       
        //if sender send message to multiple user or multiple cc or bcc so this condition is used
        //so if "," i grater than two times so message send multiple  user bu sender else send message only one user 
        if (to.indexOf(',')>0 || cc.indexOf(',')>0 || bcc.indexOf(',')>0)
        {
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to.trim()));
    //        message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(cc.trim()));
    //        message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(bcc.trim()));
        }
        else
        {
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to.trim()));
    //        message.addRecipient(Message.RecipientType.CC, new InternetAddress(cc.trim()));
    //        message.addRecipient(Message.RecipientType.BCC, new InternetAddress(bcc.trim()));
        }
        
        //it must contains subject 
        message.setSubject(subject);
     //   message.setText(msg);
       //set Message from Contact form
        MimeBodyPart messagePart = new MimeBodyPart();
        messagePart.setText(msg);
        //
        
        MimeBodyPart attachPart = new MimeBodyPart();
      //  String filename = "C:/Users/Anand Acharya/Downloads/"+fileName+"";
        
        //files are stored in filedatasourse 
        FileDataSource fileDataSource = new FileDataSource(fileName);
      //  messagePart.setDataHandler(new DataHandler(fileDataSource));
        attachPart.attachFile(fileName);
        attachPart.setFileName(fileDataSource.getName());
        
        Multipart multipart = new MimeMultipart();
        
        //aal messagePart and attachPart is stored in Multipart object multipart object contains messageobject
        multipart.addBodyPart(messagePart);
        multipart.addBodyPart(attachPart);
        message.setContent(multipart);

        //Transport method is used for to send message
        Transport.send(message);
//        File f = new File(filename);
//        f.delete();
        out.println("<script type=text/javascript>");
        out.println("alert('Email Sent Successfully')");
        out.println("location='SendEmail.jsp';");
        out.println("</script>");
        
         
        }
    catch (MessagingException e) 
    {
     throw new RuntimeException(e);
    }
	
	
	}

	private String getFileName(final Part part) {
		// TODO Auto-generated method stub
		
		final String partHeader = part.getHeader("content-disposition");
		for(String content : part.getHeader("content-disposition").split(";")){
			if(content.trim().startsWith("filename"))
			{
				return content.substring(
						content.indexOf('=') +1).trim().replace("\"", "");
						
			}
		}
		
		return null;
	}

}
