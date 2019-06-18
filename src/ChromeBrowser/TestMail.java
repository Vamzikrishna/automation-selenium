package ChromeBrowser;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class TestMail {

	public static void main(String[] args) throws EmailException {
		// TODO Auto-generated method stub
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("sai.degala11@gmail.com", "59139269sai"));
		email.setSSLOnConnect(true);
		email.setFrom("sai.degala11@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("satya.degala@technocentra.com");
		email.send();

	}

}
