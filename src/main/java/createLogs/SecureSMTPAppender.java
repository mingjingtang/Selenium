package createLogs;

import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.appender.SmtpAppender;
import org.apache.logging.log4j.core.net.SmtpManager;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.io.Serializable;
import java.util.Properties;

/**
 * Created by mingjingtang on 3/6/17.
 */
public class SecureSMTPAppender{//}  extends SMTPA{

//	private boolean useStartTLS;
//
//	private SecureSMTPAppender(String name, Filter filter, Layout<? extends Serializable> layout, SmtpManager manager, boolean ignoreExceptions) {
//		super(name, filter, layout, manager, ignoreExceptions);
//	}
//
//	public void setUseStartTLS(boolean useStartTLS) {
//		this.useStartTLS = useStartTLS;
//	}
//
//	@Override
//	protected Session createSession() {
//		Properties props = null;
//		try {
//			props = new Properties(System.getProperties());
//		} catch (SecurityException ex) {
//			props = new Properties();
//		}
//		if (getSMTPHost() != null) {
//			props.put("mail.smtp.host", getSMTPHost());
//		}
//		if (useStartTLS) {
//			props.put("mail.smtp.starttls.enable", "true");
//		}
//		Authenticator auth = null;
//		if (getSMTPPassword() != null && getSMTPUsername() != null) {
//			props.put("mail.smtp.auth", "true");
//			auth = new Authenticator() {
//				protected PasswordAuthentication getPasswordAuthentication() {
//					return new PasswordAuthentication(getSMTPUsername(), getSMTPPassword());
//				}
//			};
//		}
//		Session session = Session.getInstance(props, auth);
//		if (getSMTPDebug()) {
//			session.setDebug(true);
//		}
//		return session;
//	}
}
