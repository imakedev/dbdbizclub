package th.go.dbd.bizclub.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import th.go.dbd.bizclub.form.RegisterForm;
import th.go.dbd.bizclub.model.BizclubRegisterM;
import th.go.dbd.bizclub.service.BizClubService;

@Controller 
@RequestMapping(value={"/register"})
@SessionAttributes(value={"registerForm"})
public class RegisterController {
	
	@Autowired
    private BizClubService bizClubService;
	  //the approach described in this blog
	private static ResourceBundle bundle;
	static{
		bundle =  ResourceBundle.getBundle( "config" );				
	}
	 
	
	  //block initialization
	 /* private Map<String, Integer> mapC = new HashMap<String, Integer>();
	  {
	    mapA.put("A", 1);
	    mapA.put("B", 2);
	  }*/
	  
	@RequestMapping(value={"", "/"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String getNewForm(HttpServletRequest request,HttpServletResponse response,  Model model)
    {
		model.addAttribute("registerForm", new RegisterForm());
		model.addAttribute("provinces", bizClubService.listProvince());
		//model.addAttribute("provinceCenters", bizClubService.listProvinceCenter());
		model.addAttribute("provinceCenters", bizClubService.listBizclubCenter());
        return "bizclub/register";
    }
	@RequestMapping(value={"/action"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    public String action(HttpServletRequest request,HttpServletResponse response,  @ModelAttribute(value="registerForm") RegisterForm registerForm, BindingResult result, Model model)
    {
		//System.out.println(registerForm.getCorpGroupIds().length);
		 MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		   MultipartFile multipartFile_profile = multipartRequest.getFile("profile_upload");
		   MultipartFile multipartFile_corp = multipartRequest.getFile("corp_upload");
		    // System.out.println(multipartFile_profile);
		    // System.out.println(multipartFile_corp);
		     org.joda.time.DateTime    dt1  = new org.joda.time.DateTime (new Date().getTime()); 
			String  monthStr= dt1.getMonthOfYear()+"";
			monthStr = monthStr.length()>1?monthStr:"0"+monthStr;
			String  yearStr= dt1.getYear()+"";
			String  pathFolder=yearStr+"_"+monthStr+"";
			String profileFileName="";
			String logoFileName="";
			String profilePath="";
			String logoPath="";
		     if(multipartFile_profile!=null){
	               //String contentType = multipartFile_profile.getContentType();
	               String orgName = multipartFile_profile.getOriginalFilename();
	               orgName = FilenameUtils.getName(orgName);
	                FileOutputStream fos = null;
						try {  
							byte []filesize = multipartFile_profile.getBytes(); 
							  System.out.println("file size->"+filesize.length);
							if(filesize.length>0){									
								long current = System.currentTimeMillis();
							  
							  String path = bundle.getString("profilePath")+pathFolder;
							  createDirectoryIfNeeded(path);
							  profileFileName =orgName ;// multipart.getOriginalFilename();
							  String []filenameSplit  =profileFileName.split("\\.");
							  String extension ="";
							  if(filenameSplit!=null && filenameSplit.length>0){
								  extension =filenameSplit[filenameSplit.length-1];
							  }
							 String hotLink=current+""+genToken();
							 String ndPathFileGen =hotLink+"."+extension; 
							 String pathFolder_profile=pathFolder+"/"+ndPathFileGen;
							 profilePath=path+"/"+ndPathFileGen;
							 fos = new FileOutputStream(profilePath);
							 profilePath=pathFolder_profile;
							 System.out.println("path->"+profilePath);
							 fos.write(filesize);
							}
						}catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
						finally{
							if(fos!=null)
								try {
									fos.close();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}	 
						} 
			}

		     if(multipartFile_corp!=null){
	               //String contentType = multipartFile_profile.getContentType();
	               String orgName = multipartFile_corp.getOriginalFilename();
	               orgName = FilenameUtils.getName(orgName);
	                FileOutputStream fos = null;
						try {  
							byte []filesize = multipartFile_corp.getBytes(); 
							  System.out.println("file size->"+filesize.length);
							if(filesize.length>0){									
								long current = System.currentTimeMillis();
							  
							  String path = bundle.getString("logoPath")+pathFolder;
							  createDirectoryIfNeeded(path);
							  logoFileName =orgName ;// multipart.getOriginalFilename();
							  String []filenameSplit  =logoFileName.split("\\.");
							  String extension ="";
							  if(filenameSplit!=null && filenameSplit.length>0){
								  extension =filenameSplit[filenameSplit.length-1];
							  }
							 String hotLink=current+""+genToken();
							 String ndPathFileGen =hotLink+"."+extension; 
							 String pathFolder_logo=pathFolder+"/"+ndPathFileGen;
							 logoPath=path+"/"+ndPathFileGen;
							 fos = new FileOutputStream(logoPath);
							 logoPath=pathFolder_logo;
							 System.out.println("path->"+logoPath);
							 fos.write(filesize);
							}
						}catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
						finally{
							if(fos!=null)
								try {
									fos.close();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}	 
						} 
			}
		  //   System.out.println( registerForm.getBizclubRegisterM().getCardId());
		     registerForm.getBizclubRegisterM().setLogoPath(logoPath);
		     registerForm.getBizclubRegisterM().setLogoFileName(logoFileName);
		     registerForm.getBizclubRegisterM().setProfilePath(profilePath);
		     registerForm.getBizclubRegisterM().setProfileFileName(profileFileName);
		StringBuffer sb =new StringBuffer("");
		if(registerForm.getCorpGroupIds()!=null && registerForm.getCorpGroupIds().length>0){
			String [] corpGroupIds=registerForm.getCorpGroupIds();
			
		    int size=corpGroupIds.length;
			for (int i = 0; i < size; i++) {
				sb.append(corpGroupIds[i]);
				if((i+1)!=size)
					sb.append("-");
			}	
		}
		BizclubRegisterM bizclubRegisterM=registerForm.getBizclubRegisterM();
		bizclubRegisterM.setCorpGroupId(sb.toString());
		bizClubService.saveBizclubRegister(bizclubRegisterM);
	//	System.out.println(registerForm.getBizclubRegisterM());
        return "bizclub/approve";
        //return "bizclub/register_test";
    }
	  private void createDirectoryIfNeeded(String directoryName)
	  	 {
	  	   File theDir = new File(directoryName);

	  	   // if the directory does not exist, create it
	  	   if (!theDir.exists())
	  	   {
	  		   //boolean cancreate = theDir.mkdir();
	  		   theDir.mkdir();
	  	   }
	  	  
	  	 }	
	  private String genToken(){
	  		StringBuffer sb = new StringBuffer();
	  	    for (int i = 36; i > 0; i -= 12) {
	  	      int n = Math.min(12, Math.abs(i));
	  	      sb.append(org.apache.commons.lang3.StringUtils.leftPad(Long.toString(Math.round(Math.random() * Math.pow(36, n)), 36), n, '0'));
	  	    }
	  	    return sb.toString();
	   }
}
