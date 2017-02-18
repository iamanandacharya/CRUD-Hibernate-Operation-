package DAO;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer {
	public static void send(String to, String username ,String password )
	{
		final String from="opencloud20@gmail.com"; 
        final String pass="opencloud";
       
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");  
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "587");
        Session session = Session.getInstance(props, new javax.mail.Authenticator() 
        {  
        protected PasswordAuthentication getPasswordAuthentication() 
        {  
        return new PasswordAuthentication(from,pass);  
        }
        });
        
        try
        {
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));

        
//            if (to.indexOf(',')>0 || cc.indexOf(',')>0 || bcc.indexOf(',')>0)
//            {
//                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to.trim()));
//                message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(cc.trim()));
//                message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(bcc.trim()));
//            }
//            else
//           {
//                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to.trim()));
//                message.addRecipient(Message.RecipientType.CC, new InternetAddress(cc.trim()));
//                message.addRecipient(Message.RecipientType.BCC, new InternetAddress(bcc.trim()));
//            }
            message.setSubject("Forgot Password");
            message.setText("Your Message is: " +"UserName:" + username + "Passwords" +password  );
            Transport.send(message);
        }
        catch (MessagingException e) 
        {
         throw new RuntimeException(e);
        }
	}

}
