package th.go.dbd.bizclub.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import th.go.dbd.bizclub.domain.MyUserDetails;
import th.go.dbd.bizclub.form.MemberForm;
import th.go.dbd.bizclub.mail.MailRunnable;
import th.go.dbd.bizclub.model.UserM;
import th.go.dbd.bizclub.service.BizClubService;

@Controller 
@RequestMapping(value={"/bizmem"})
@SessionAttributes(value={"memberForm"})
public class MemberController {
	 SimpleDateFormat dateFormat = new SimpleDateFormat("dd/M/yyyy HH:mm:ss a",new Locale("th", "TH"));
	@Autowired
    private BizClubService bizClubService;
	private static ResourceBundle bundle;
	static{
		bundle =  ResourceBundle.getBundle( "config" );				
	}
	 
	@RequestMapping(value={"", "/"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String initmemeber(Model model,SecurityContextHolderAwareRequestWrapper srequest)
    {
		MyUserDetails user=(MyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	/*	MemberForm memberForm=new MemberForm();	
		memberForm.setUserM( bizClubService.findUserById(user.getMyUser().getUserid()));

		model.addAttribute("provinces", bizClubService.listProvince());
		model.addAttribute("provinceCenters", bizClubService.listProvinceCenter());
        model.addAttribute("memberForm", memberForm);*/
        
        //return "bizclub/member";
        return "redirect:/bizmem/get/"+user.getMyUser().getUserid();
    }
	@RequestMapping(value={"/get/{userId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String getMemeber(@PathVariable Integer userId,Model model)
    {
		//MyUserDetails user=(MyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		MemberForm memberForm=new MemberForm();	
		memberForm.setUserM( bizClubService.findUserById(userId));

		model.addAttribute("provinces", bizClubService.listProvince());
		model.addAttribute("provinceCenters", bizClubService.listProvinceCenter());
        model.addAttribute("memberForm", memberForm);
        return "bizclub/member";
    }
	@RequestMapping(value={"/update"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    public String update(HttpServletRequest request,HttpServletResponse response,  @ModelAttribute(value="memberForm") MemberForm memberForm, BindingResult result, Model model)
    {
		 
		
		UserM userOld =bizClubService.findUserById(memberForm.getUserM().getUserId());
		System.out.println("userOld.getRole()->"+userOld.getRole().getRoleId());
		if(!(memberForm.getUserM().getPassword()!=null && memberForm.getUserM().getPassword().trim().length()>0))
			memberForm.getUserM().setPassword(userOld.getPassword());
		if(userOld.getRole()!=null && userOld.getRole().getRoleId()!=null){
			memberForm.getUserM().setRole(userOld.getRole());
		}
		
		
		
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
							 memberForm.getUserM().setProfilePath(profilePath);
						     memberForm.getUserM().setProfileFileName(profileFileName);
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
							 memberForm.getUserM().setLogoPath(logoPath);
						     memberForm.getUserM().setLogoFileName(logoFileName);
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
		    
		    
		StringBuffer sb =new StringBuffer("");
		if(memberForm.getCorpGroupIds()!=null && memberForm.getCorpGroupIds().length>0){
			String [] corpGroupIds=memberForm.getCorpGroupIds();
			
		    int size=corpGroupIds.length;
			for (int i = 0; i < size; i++) {
				sb.append(corpGroupIds[i]);
				if((i+1)!=size)
					sb.append("-");
			}	
		}
		memberForm.getUserM().setCorpGroupId(sb.toString());
		
		bizClubService.updateUser(memberForm.getUserM());
		String subject="Update Infomation";
		String content="user name : "+memberForm.getUserM().getUserName()+" <br/>"+
				"ได้มีการแก้ไขข้อมูลส่วนตัว  ในวันที่ "+dateFormat.format(new Date());
		List recipients =new ArrayList();
		recipients.add(memberForm.getUserM().getEmail());
		MailRunnable mailRunnable = new MailRunnable("smtp","smtp.gmail.com","dbdcentralbizclub2015@gmail.com","bizclub2015","1",
				recipients,subject,
			    content,
				"99","BizClub","587",null,null,null,"1");	
	
		Thread mailThread = new Thread(mailRunnable);
		mailThread.start(); 
		model.addAttribute("provinces", bizClubService.listProvince());
		model.addAttribute("provinceCenters", bizClubService.listProvinceCenter());
		model.addAttribute("memberForm", memberForm);
        //return "bizclub/member";
        return "redirect:/member";
    }
	@RequestMapping(value={"/item/{userId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody UserM getItem(@PathVariable Integer userId,Model model)
	    {
		 return bizClubService.findUserById(userId) ;
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
