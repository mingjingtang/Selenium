package Module_21;

/**
 * Created by mingjingtang on 3/16/17.
 */
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMailUsingAuthentication {

	public static final String SMTP_HOST_NAME = "smtp.gmail.com";

	public static final String SMTP_AUTH_USER = "tmjcsh@gmail.com";

	public static final String SMTP_AUTH_PWD = "9D3-9Gs-D4E-X5W";

	public static final String emailMsgTxt = "Error found while clicking on an element";

	public static final String emailSubjectTxt = "Please correct the Xpath, since on a click event no element was found";

	public static final String emailFromAddress = "tmjcsh@gmail.com";

	// Add List of Email address to who email needs to be sent to
	public static final String[] emailList = { "mingjing.gnat@gmail.com" };

//	public static void main(String args[]) throws Exception {
//		SendMailUsingAuthentication smtpMailSender = new SendMailUsingAuthentication();
//		smtpMailSender.postMail(emailList, emailSubjectTxt, emailMsgTxt,
//				emailFromAddress);
//		System.out.println("Sucessfully Sent mail to All Users");
//	}

	public void postMail(String recipients[], String subject, String message,
						 String from) throws MessagingException {
		boolean debug = false;
		java.security.Security
				.addProvider(new com.sun.net.ssl.internal.ssl.Provider());

		//Set the host smtp address
		Properties props = new Properties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.starttls.enable","true");
		props.put("mail.smtp.host", SMTP_HOST_NAME);
		props.put("mail.smtp.auth", "true");

		Authenticator auth = new SMTPAuthenticator();
		Session session = Session.getDefaultInstance(props, auth);

		session.setDebug(debug);

		// create a message
		Message msg = new MimeMessage(session);

		// set the from and to address
		InternetAddress addressFrom = new InternetAddress(from);
		msg.setFrom(addressFrom);

		InternetAddress[] addressTo = new InternetAddress[recipients.length];
		for (int i = 0; i < recipients.length; i++) {
			addressTo[i] = new InternetAddress(recipients[i]);
		}
		msg.setRecipients(Message.RecipientType.TO, addressTo);

		// Setting the Subject and Content Type
		msg.setSubject(subject);
		msg.setContent(message, "text/plain");
		Transport.send(msg);
	}

	/**
	 * SimpleAuthenticator is used to do simple authentication when the SMTP
	 * server requires it.
	 */
	private class SMTPAuthenticator extends javax.mail.Authenticator {

		public PasswordAuthentication getPasswordAuthentication() {
			String username = SMTP_AUTH_USER;
			String password = SMTP_AUTH_PWD;
			return new PasswordAuthentication(username, password);
		}
	}

}