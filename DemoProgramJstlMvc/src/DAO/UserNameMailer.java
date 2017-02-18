package DAO;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class UserNameMailer {

	public static void send(String userName,String password,String to)
	{
		final String from="opencloud20@gmail.com";
		final String pass="opencloud";
		Properties pros = new Properties();
		pros.put("mail.smtp.host","smtp.gmail.com");
		pros.put("mail.smtp.auth","true");
		pros.put("mail.smtp.starttls.enable", "true");
		pros.put("mail.smtp.port", "587");
		Session session = Session.getInstance(pros, new javax.mail.Authenticator() 
		{
			 protected PasswordAuthentication getPasswordAuthentication()
			{
				return new PasswordAuthentication(from, pass);
			}
		});
		try{
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to.trim()));
			message.setSubject("Forgot Password");
			message.setText("UserName" + userName);
			Transport.send(message);
		}
		catch(MessagingException e)
		{
			throw new RuntimeException(e);
		}
		
	}
	
	
}
