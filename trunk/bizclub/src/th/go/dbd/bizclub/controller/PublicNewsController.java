package th.go.dbd.bizclub.controller;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import th.go.dbd.bizclub.form.CalendarActivityForm;
import th.go.dbd.bizclub.model.BizclubActivityM;
import th.go.dbd.bizclub.service.BizClubService;

@Controller 
@RequestMapping(value={"/news"})
@SessionAttributes(value={"calendarActivityForm"})
public class PublicNewsController {
	
	
	Logger logger = Logger.getRootLogger();
	
	@Autowired
	@Qualifier("bizClubServiceImpl")
	private BizClubService bizClubService;
	private static ResourceBundle bundle;
	static{
		bundle =  ResourceBundle.getBundle("config");				
	}
	
	@RequestMapping(value={"", "/"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	public String listAllNews(HttpServletRequest request,HttpServletResponse response,Model model, @RequestParam(required=false) String message) {
    	logger.debug("publicNews12........");
		return "bizclub/News";
	}
	
	@RequestMapping(value={"/activity"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String listActivity(	HttpServletRequest request,
    							HttpServletResponse response,
    							Model model) {
		return "redirect:/news/activity/1";
    }
	
	@RequestMapping(value={"/activity/{bcId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String listActivityByBcId(	@PathVariable Integer bcId,
    							HttpServletRequest request,
    							HttpServletResponse response,
    							Model model) {
		logger.debug("listActivityByBcId...."+bcId);
		model.addAttribute("bizclubCenter", bizClubService.findBizclubCenterById(bcId));
		model.addAttribute("bcId",bcId);
		model.addAttribute("provinceCenters", bizClubService.listBizclubCenter());
		return "bizclub/calendarActivities";
    }
	
	@RequestMapping(value={"/addactivity/{bcId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String addActivityByBcId(	@PathVariable Integer bcId,
    							HttpServletRequest request,
    							HttpServletResponse response,
    							Model model) {
		logger.debug("addActivityByBcId...."+bcId);
		model.addAttribute("bizclubCenter", bizClubService.findBizclubCenterById(bcId));
		model.addAttribute("provinceCenters", bizClubService.listBizclubCenter());
		model.addAttribute("bcId",bcId);
		
		CalendarActivityForm activitiyForm = new CalendarActivityForm();
		activitiyForm.setBcId(bcId);
		model.addAttribute("calendarActivityForm", activitiyForm);
		
		return "bizclub/addCalendarActivities";
    }
	
	@RequestMapping(value={"/saveactivity"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
	public String saveActivity(	HttpServletRequest request,
			 				HttpServletResponse response,  
			 				@ModelAttribute(value="calendarActivityForm") CalendarActivityForm actForm, 
			 				BindingResult result, 
			 				Model model){
		
		BizclubActivityM bizclubActivityM = new BizclubActivityM();
		
		logger.debug("saveActivity....");
		logger.debug("bcId:"+actForm.getBcId());
		logger.debug("title:"+actForm.getBaTitle());
		logger.debug("sDate:"+actForm.getBaStartTime());
		logger.debug("eDate:"+actForm.getBaEndTime());
		logger.debug("detail:"+actForm.getBaDetail());
		logger.debug("fix:"+actForm.getIsFixed());
		
		bizclubActivityM.setBcId(actForm.getBcId());
		if(actForm.getBaTitle()!=null) bizclubActivityM.setBaTitle(actForm.getBaTitle());
		/*if(actForm.getBaStartTime()!=null) bizclubActivityM.setBaStartTime(Timestamp.valueOf(actForm.getBaStartTime()));
		if(actForm.getBaEndTime()!=null) bizclubActivityM.setBaEndTime(Timestamp.valueOf(actForm.getBaEndTime()));*/
		
		 bizclubActivityM.setBaStartTime(new Timestamp(new Date().getTime()));
		 bizclubActivityM.setBaEndTime(new Timestamp(new Date().getTime()));
		 
		 
		if(actForm.getBaDetail()!=null) bizclubActivityM.setBaDetail(actForm.getBaDetail());
		if(actForm.getIsFixed()!=null) if(actForm.getIsFixed()!="null") bizclubActivityM.setIsFixed("Y"); else bizclubActivityM.setIsFixed("N");
		
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		MultipartFile multipartFile_profile = multipartRequest.getFile("activity_upload");
		if(multipartFile_profile!=null){
			
			org.joda.time.DateTime    dt1  = new org.joda.time.DateTime (new Date().getTime()); 
			String  monthStr= dt1.getMonthOfYear()+"";
			monthStr = monthStr.length()>1?monthStr:"0"+monthStr;
			String yearStr= dt1.getYear()+"";
			String pathFolder=yearStr+"_"+monthStr+"";
			String profileFileName="";
			String profilePath="";
			
            String orgName = multipartFile_profile.getOriginalFilename();
            logger.debug("orgName:"+orgName);
            orgName = FilenameUtils.getName(orgName);
            FileOutputStream fos = null;
			try {  
				byte []filesize = multipartFile_profile.getBytes(); 
				logger.debug("file size->"+filesize.length);
				if(filesize.length>0){									
					long current = System.currentTimeMillis();
				  
				  String path = bundle.getString("activityCalendarPath")+pathFolder;
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
				 logger.debug("path->"+profilePath);
				 fos.write(filesize);
				 actForm.setBaPicturePath(profilePath);
				 actForm.setBaPictureName(profileFileName);
				 
				 bizclubActivityM.setBaPicturePath(actForm.getBaPicturePath());
				 bizclubActivityM.setBaPictureName(actForm.getBaPictureName());
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			finally{
				if(fos!=null){
					try {
						fos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}	
				}
			} 
		}
		bizClubService.saveActivity(bizclubActivityM);
		return "redirect:/news/activity/"+actForm.getBcId();
	 }
	
	 private void createDirectoryIfNeeded(String directoryName) {
  	   File theDir = new File(directoryName);
  	   if (!theDir.exists()) theDir.mkdir();
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
