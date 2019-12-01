package com.brainmentors.ims.common;

import java.util.Properties;
import java.util.ResourceBundle;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public interface MailSender {
	ResourceBundle rb = ResourceBundle.getBundle("config");
	static boolean sendMail(int otpNumber, String mailId) throws AddressException, MessagingException{
		final String username = rb.getString("userid");
        final String password = rb.getString("password");

        Properties prop = new Properties();
		prop.put("mail.smtp.host", rb.getString("smtp"));
        prop.put("mail.smtp.port", rb.getString("port"));
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS
        
        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(mailId)
            );
            message.setSubject("OTP Number Send");
            message.setText("Dear User,"
                    + "\n\n Your OTP Number is "+otpNumber);
            System.out.println("Before Send ......");
            Transport.send(message);
            System.out.println("mail Send SuccessFully");

            return true;
       
	} 
}
