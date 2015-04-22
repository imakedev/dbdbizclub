package bizclub;


import java.security.Security;

import com.dbd.task.model.JuristicAddressInfo;
import com.dbd.task.model.JuristicCertificateInfo;
import com.dbd.task.model.JuristicInfo;
import com.dbd.task.model.JuristicInformationInfo;
import com.dbd.task.model.JuristicRegisterCapitalInfo;
import com.dbd.task.model.main.JuristicMain;
import com.dbd.task.model.sub.CommitteeInformation;
import com.dbd.task.model.sub.DataAccessInfo;
import com.dbd.task.service.TaskJuristicServiceProxy;

public class Client {
	public static void main(String[] args) {
		try {
			//String certPath="/aoe"; // 
			String certPath="/Users/imake/Desktop";
		//	System.setProperty("https.proxyHost", "ipAddress");
		//	System.setProperty("https.proxyPort", "8080");*/
			System.setProperty("java.protocol.handler.pkgs","com.sun.net.ssl.internal.www.protocol");
			Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
			System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
			
			System.setProperty("javax.net.ssl.trustStore",
					""+certPath+"/cert/codesignstore");
			System.setProperty("javax.net.ssl.keyStore",
					""+certPath+"/cert/ca9beda25c.p12");
					//"C:\\test\\ca264aad17.p12");
			System.setProperty("javax.net.ssl.trustStorePassword", "#dbdb@2558");
			System.setProperty("javax.net.ssl.keyStorePassword", "#dbdb@2558");
			//Djavax.net.ssl.keyStore=mySrvKeystore -Djavax.net.ssl.keyStorePassword=123456
			// ถา้ มี proxy ใหใ้ ส่เบอร์ ip // port ของ proxy
			TaskJuristicServiceProxy proxy = new TaskJuristicServiceProxy();
			
			//0105556121884
			JuristicMain juristicMain = proxy.juristicDetailByJuristicId(
					"DBDBIZCLUB", "0105556121884");
			DataAccessInfo accessInfo=juristicMain.getDataAccessInfo();
			JuristicAddressInfo[] juristicAddressInfo=juristicMain.getJuristicAddressInfo();
			System.out.println(juristicAddressInfo);
			/*for (int i = 0; i < fin.length; i++) {
				BalanceStatementInformation[] balances=fin[i].getBalanceStatementInformation();
				for (int j = 0; j < balances.length; j++) {
					System.out.println(balances[i].getTotalRevenue());
				}
			}*/
		//	JuristicObjectiveInfo[] juristicObjectiveInfos=juristicMain.getJuristicObjectiveInfo();
			
			JuristicCertificateInfo[] certificateInfo = juristicMain
					.getJuristicCertificateInfo();
			System.out.println(certificateInfo.length);
			for (int i = 0; i < certificateInfo.length; i++) {
				System.out
						.println("ID : " + certificateInfo[i].getJuristicID());
				System.out.println("Name : "
						+ certificateInfo[i].getJuristicName());
				System.out.println(certificateInfo[i].getAuthorizeDescription());
			//	System.out.println(certificateInfo[i].getBfileFromDB()[0].getBfileName());
				System.out.println(certificateInfo[i].getNumberOfCommittee());
				System.out.println(certificateInfo[i].getNumberOfObjective());
				CommitteeInformation[] committeeInformations= certificateInfo[i].getCommitteeInformation();
			  int size=committeeInformations.length;
				for (int j = 0; j < size; j++) {
					String lastName=committeeInformations[j].getLastName();
						if(size==j+1){
							lastName=lastName.substring(0,lastName.length()-1);
						}
							
					System.out.println(committeeInformations[j].getId()+" "+committeeInformations[j].getTitle()+" "+committeeInformations[j].getName()+" "+lastName);
					
				}
			
				//System.out.println(;
				System.out.println(certificateInfo[i].getJuristicType());
				System.out.println(certificateInfo[i].getJuristicStatus());
				System.out.println("xxx");
			
				
			}
			JuristicInformationInfo[] juristicInformationInfos=juristicMain.getJuristicInformationInfo();
			System.out.println(juristicInformationInfos);
			if(juristicInformationInfos!=null)
				for (int i = 0; i < juristicInformationInfos.length; i++) {
					System.out.println(juristicInformationInfos[i].getJuristicName());
					
				}
			JuristicInfo[] juristicInfos=juristicMain.getJuristicInfo();
			System.out.println(juristicInfos);
			JuristicRegisterCapitalInfo[] juristicRegisterCapitalInfos=	juristicMain.getJuristicRegisterCapitalInfo();
			System.out.println(juristicRegisterCapitalInfos);
			if(juristicRegisterCapitalInfos!=null)
				for (int i = 0; i < juristicRegisterCapitalInfos.length; i++) {
					System.out.println(juristicRegisterCapitalInfos[i].getRegisterCapital());
					
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}