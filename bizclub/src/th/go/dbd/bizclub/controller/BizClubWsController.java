package th.go.dbd.bizclub.controller;

import java.security.Security;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import th.go.dbd.bizclub.model.AmphurM;
import th.go.dbd.bizclub.model.BizclubCorpWM;
import th.go.dbd.bizclub.model.DistrictM;
import th.go.dbd.bizclub.model.ZipcodeM;
import th.go.dbd.bizclub.service.BizClubService;

import com.dbd.task.model.JuristicCertificateInfo;
import com.dbd.task.model.main.JuristicMain;
import com.dbd.task.model.sub.CommitteeInformation;
import com.dbd.task.service.TaskJuristicServiceProxy;

@Controller 
@RequestMapping(value={"/ws"})
public class BizClubWsController {
	@Autowired
    private BizClubService bizClubService;
	@RequestMapping(value={"/juristic/{corpId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody BizclubCorpWM getJuristicyId(@PathVariable String corpId,Model model)
	    {
		BizclubCorpWM bizclubCorpWM=new BizclubCorpWM();	
		
	try{
		String certPath="/aoe"; //
	//	String certPath="/Users/imake/Desktop";
		System.setProperty("java.protocol.handler.pkgs","com.sun.net.ssl.internal.www.protocol");
		Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
		System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
		System.setProperty("javax.net.ssl.trustStore",
				""+certPath+"/cert/codesignstore");
		System.setProperty("javax.net.ssl.keyStore",
				""+certPath+"/cert/ca9beda25c.p12");
		System.setProperty("javax.net.ssl.trustStorePassword", "#dbdb@2558");
		System.setProperty("javax.net.ssl.keyStorePassword", "#dbdb@2558");
		// ถา้ มี proxy ใหใ้ ส่เบอร์ ip // port ของ proxy
		TaskJuristicServiceProxy proxy = new TaskJuristicServiceProxy();
		
		//0105556121884
		JuristicMain juristicMain = proxy.juristicDetailByJuristicId(
				"DBDBIZCLUB", corpId.trim());
	
		JuristicCertificateInfo[] certificateInfo = juristicMain
				.getJuristicCertificateInfo();
	
		int corpCount	= certificateInfo.length;
		for (int i = 0; i <corpCount; i++) {
			bizclubCorpWM.setCorpName(certificateInfo[i].getJuristicName());
			CommitteeInformation[] committeeInformations= certificateInfo[i].getCommitteeInformation();
			
		    int size=committeeInformations.length;
		    String[] committeeNames =new String[size];
			for (int j = 0; j < size; j++) {
				String lastName=committeeInformations[j].getLastName();
				String name=committeeInformations[j].getName();
					if(size==j+1){
						lastName=lastName.substring(0,lastName.length()-1);
					}
					committeeNames[j]=name;
				//System.out.println(committeeInformations[j].getId()+" "+committeeInformations[j].getTitle()+" "+name+" "+lastName);
			}
			bizclubCorpWM.setCommitteeNames(committeeNames);
		}
		bizclubCorpWM.setCorpCount(corpCount);
	} catch (Exception e) {
		e.printStackTrace();
	}
		return bizclubCorpWM;
	    }
	
	@RequestMapping(value={"/corp/{corpId}/{corpType}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody BizclubCorpWM getBizclubCorpWById(@PathVariable String corpId,@PathVariable String corpType,Model model)
	    {
		 return bizClubService.findBizclubCorpWById(corpId,corpType) ;
	    }
	@RequestMapping(value={"/check/{corpId}/{corpType}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String checkExist(@PathVariable String corpId,@PathVariable String corpType,Model model)
	    {
		  
		 return bizClubService.checkExist(corpId,corpType) ;
	    }	
	@RequestMapping(value={"/addr/amphur/{provinceId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<AmphurM> getDistrict(@PathVariable Integer provinceId,Model model)
	    {
		 return bizClubService.listAmphur(provinceId) ;
	    }
	@RequestMapping(value={"/addr/district/{districtId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<DistrictM> getSubDistrict(@PathVariable Integer districtId,Model model)
	    {
		 return bizClubService.listDistrict(districtId) ;
	    }
	@RequestMapping(value={"/addr/zipcode/{districtId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<ZipcodeM> getZipcode(@PathVariable String districtId,Model model)
	    {
		 return bizClubService.listZipcode(districtId) ;
	    }
		
}
