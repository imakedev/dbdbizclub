package th.go.dbd.bizclub.mail;

import java.util.ArrayList;
import java.util.List;

public class Test { 
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		/*public MailRunnable(String protocal_,String  host_,String email_ ,String  password_,String  useAuthen_,
				List recipients
				,String subject,String messagebody,String sessionId) {
			prop.put("mail.smtp.host", "SMTP-Relay.pttep.com");   
			prop.put("mail.smtp.port", "25");
			prop.put("protocol", "smtp");
		}*/
		//siripornp@
		@SuppressWarnings("rawtypes")
		List recipients =new ArrayList();
		
		recipients.add("moooooooooooogle@gmail.com");
		MailRunnable mailRunnable = new MailRunnable("smtp","smtp.gmail.com","chatchai@lansingbs.com","chatchai2012","1",
				recipients,"ยินดีต้อนรับสู่สมาชิก BizClub Online",
				"Welcome to BizClub <br/> UserName/Password <br/> xxx/bbbb "
				+ "<br/> go to www.dbdbizclub.com ",
				"99","BizClub","587",null,null,null,"1");	
	
		Thread mailThread = new Thread(mailRunnable);
		mailThread.start(); 
		
	
		
	}
}
