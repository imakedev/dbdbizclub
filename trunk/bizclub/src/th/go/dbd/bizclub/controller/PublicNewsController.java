package th.go.dbd.bizclub.controller;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.google.gson.Gson;

import th.go.dbd.bizclub.bean.CalendarBean;
import th.go.dbd.bizclub.bean.NewsActivityBean;
import th.go.dbd.bizclub.form.ActivityForm;
import th.go.dbd.bizclub.domain.MyUserDetails;
import th.go.dbd.bizclub.form.CalendarActivityForm;
import th.go.dbd.bizclub.model.BizclubActivityM;
import th.go.dbd.bizclub.model.BizclubRegisterM;
import th.go.dbd.bizclub.service.BizClubService;

@Controller 
@RequestMapping(value={"/news"})
@SessionAttributes(value={"calendarActivityForm","activityForm"})
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
		return "bizclub/news";
	}
	@RequestMapping(value={"/newsActivity/{bcId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	public String listNewsActivityByBcId(	@PathVariable Integer bcId,
			HttpServletRequest request,
			HttpServletResponse response,
			Model model) {

		//String imgURL = bundle.getString("activityDefaultUrl");
		logger.debug("listActivityByBcId...."+bcId);
		model.addAttribute("bizclubCenter", bizClubService.findBizclubCenterById(bcId));
		model.addAttribute("bcId",bcId);
		model.addAttribute("provinceCenters", bizClubService.listBizclubCenter());
		BizclubActivityM activities = new BizclubActivityM();
		activities.setBcId(bcId);
		List<BizclubActivityM> listActivity = bizClubService.searchActivityByCenter(activities);
		if(listActivity!=null && listActivity.size()>0){
			logger.debug("listActivity:"+listActivity.size());
			List<NewsActivityBean> newsActList = new ArrayList<NewsActivityBean>();
			for (int i = 0; i < listActivity.size(); i++) {
			BizclubActivityM act = listActivity.get(i);
			NewsActivityBean newsActBean = new NewsActivityBean();
			newsActBean.setCenterId(bcId);
			newsActBean.setActivityId(act.getBaId());
			newsActBean.setTitle(act.getBaTitle());
			newsActBean.setDetail(act.getBaDetail());
			if(act.getBaStartTime()!=null){
				newsActBean.setStart(convertTimestampToJson(act.getBaStartTime().toString()));
				newsActBean.setEnd(convertTimestampToJson(act.getBaStartTime().toString()));
				newsActBean.setsTime(convertTimestampToString(act.getBaStartTime()));
				newsActBean.seteTime(convertTimestampToString(act.getBaEndTime()));
			}
			if(act.getBaPicturePath()!=null && act.getBaPicturePath().length()>0){
				newsActBean.setImgPath(act.getBaPicturePath());
			}
			if(act.getBaPictureName()!=null && act.getBaPictureName().length()>0){
				newsActBean.setImgName(act.getBaPictureName());
			}
			newsActList.add(newsActBean);
			}
			ActivityForm activitiyForm = new ActivityForm();
			activitiyForm.setBcId(bcId);
			model.addAttribute("newsActList",newsActList);
			model.addAttribute("activityForm", activitiyForm);
		}else{
		logger.debug("not event.....");
			model.addAttribute("newsActList",null);
		}
		return "bizclub/listNews";
	}
	
	
	@RequestMapping(value={"/newsActivity/add/{bcId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ActivityForm initAddActivity(@PathVariable Integer bcId,Model model) {
		ActivityForm act = new ActivityForm();
		act.setBcId(bcId);
		act.setPageMode("add");
		 return  act;
	}
	
	@RequestMapping(value={"/newsActivity/save"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
	public String saveNewsActivity(	HttpServletRequest request,
			 				HttpServletResponse response,  
			 				@ModelAttribute(value="activityForm") ActivityForm actForm, 
			 				BindingResult result, 
			 				Model model){
		
		BizclubActivityM bizclubActivityM = new BizclubActivityM();
		
		logger.debug("saveActivity....");
		if(request.getUserPrincipal()!=null) logger.debug(request.getUserPrincipal().getName()+"...");
		logger.debug("bcId:"+actForm.getBcId());
		logger.debug("title:"+actForm.getBaTitle());
		logger.debug("detail:"+actForm.getBaDetail());
		logger.debug("fix:"+actForm.getIsFixed());
		
		bizclubActivityM.setBcId(actForm.getBcId());
		
		if(actForm.getBaTitle()!=null) bizclubActivityM.setBaTitle(actForm.getBaTitle());
		if(actForm.getBaDetail()!=null) bizclubActivityM.setBaDetail(actForm.getBaDetail());
		if(actForm.getIsFixed()!=null) {
			if(actForm.getIsFixed()!="null") {
				bizclubActivityM.setIsFixed("Y"); 
			}else{
				bizclubActivityM.setIsFixed("N");
			}
		}else{
			bizclubActivityM.setIsFixed("N");
		}
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
				  
				  String path = bundle.getString("activityNewsPath")+pathFolder;
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
				 
				 logger.debug("profilePath(length)....."+profilePath.length());
				 logger.debug("profileFileName(length)....."+profileFileName.length());
				 
				 bizclubActivityM.setBaPicturePath(actForm.getBaPicturePath());
				 bizclubActivityM.setBaPictureName(actForm.getBaPictureName());
				 
				 if(request.getUserPrincipal()!=null) {
					 bizclubActivityM.setCreatedBy(request.getUserPrincipal().getName());
					 bizclubActivityM.setUpdatedBy(request.getUserPrincipal().getName());
				 }
				 
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
		if(actForm.getPageMode()!=null && "add".equals(actForm.getPageMode())){
			bizClubService.saveActivity(bizclubActivityM);
		}
		if(actForm.getPageMode()!=null && "edit".equals(actForm.getPageMode())){
			if(actForm.getBaId()!=0) bizclubActivityM.setBaId(actForm.getBaId());
			bizClubService.updateActivity(bizclubActivityM);
		}
		if(actForm.getPageMode()!=null && "delete".equals(actForm.getPageMode())){
			if(actForm.getBaId()!=0) bizclubActivityM.setBaId(actForm.getBaId());
			bizClubService.deleteActivity(bizclubActivityM);
		}
		return "redirect:/news/newsActivity/"+actForm.getBcId();
	 }
	
	@RequestMapping(value={"/newsActivity/moreDetail/{bcId}/{baId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ActivityForm moreDetail(@PathVariable Integer bcId,@PathVariable Integer baId,Model model) {
		BizclubActivityM activitiesM = new BizclubActivityM();
		activitiesM.setBcId(bcId);
		activitiesM.setBaId(baId);
		BizclubActivityM result = bizClubService.findActivityByBaId(activitiesM);
		ActivityForm act = new ActivityForm();
		act.setBcId(result.getBcId());
		act.setBaId(result.getBaId());
		act.setBaTitle(result.getBaTitle());
		act.setBaDetail(result.getBaDetail());
		act.setIsFixed(result.getIsFixed());
	
		 return  act;
	}
	
	@RequestMapping(value={"/newsActivity/edit/{bcId}/{baId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ActivityForm initEditActivity(@PathVariable Integer bcId,@PathVariable Integer baId,Model model) {
		BizclubActivityM activitiesM = new BizclubActivityM();
		activitiesM.setBcId(bcId);
		activitiesM.setBaId(baId);
		BizclubActivityM result = bizClubService.findActivityByBaId(activitiesM);
		ActivityForm act = new ActivityForm();
		act.setBcId(result.getBcId());
		act.setBaId(result.getBaId());
		act.setBaTitle(result.getBaTitle());
		act.setBaDetail(result.getBaDetail());
		act.setIsFixed(result.getIsFixed());
	
		act.setPageMode("edit");
		 return  act;
	}
	@RequestMapping(value={"/newsActivity/delete/{bcId}/{baId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ActivityForm initDeleteActivity(@PathVariable Integer bcId,@PathVariable Integer baId,Model model) {
		BizclubActivityM activitiesM = new BizclubActivityM();
		activitiesM.setBcId(bcId);
		activitiesM.setBaId(baId);
		BizclubActivityM result = bizClubService.findActivityByBaId(activitiesM);
		ActivityForm act = new ActivityForm();
		act.setBcId(result.getBcId());
		act.setBaId(result.getBaId());
		act.setBaTitle(result.getBaTitle());
		act.setBaDetail(result.getBaDetail());
		act.setIsFixed(result.getIsFixed());
	
		act.setPageMode("delete");
		 return  act;
	}
	//------------------------------------------------------- Calendar ------------------------------------------------------------------------//
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
		
		
		//String imgURL = bundle.getString("activityDefaultUrl");
		logger.debug("listActivityByBcId...."+bcId);
		model.addAttribute("bizclubCenter", bizClubService.findBizclubCenterById(bcId));
		model.addAttribute("bcId",bcId);
		model.addAttribute("provinceCenters", bizClubService.listBizclubCenter());
		BizclubActivityM activities = new BizclubActivityM();
		activities.setBcId(bcId);
		List<BizclubActivityM> listActivity = bizClubService.searchActivityByCenter(activities);
		if(listActivity!=null && listActivity.size()>0){
			logger.debug("listActivity:"+listActivity.size());
			List<CalendarBean> calendarList = new ArrayList<CalendarBean>();
			for (int i = 0; i < listActivity.size(); i++) {
				BizclubActivityM act = listActivity.get(i);
				CalendarBean calBean = new CalendarBean();
				calBean.setCenterId(bcId);
				calBean.setActivityId(act.getBaId());
				calBean.setTitle(act.getBaTitle());
				if(act.getBaDetail()!=null && act.getBaDetail().length()>0){
					calBean.setDetail(act.getBaDetail());
				}else{
					calBean.setDetail("");
				}
				if(act.getBaStartTime()!=null){
					calBean.setStart(convertTimestampToJson(act.getBaStartTime().toString()));
					calBean.setsTime(convertTimestampToString(act.getBaStartTime()));
				}else{
					calBean.setStart("");
					calBean.setsTime("");
				}
				if(act.getBaEndTime()!=null){
					calBean.setEnd(convertTimestampToJson(act.getBaEndTime().toString()));
					calBean.seteTime(convertTimestampToString(act.getBaEndTime()));
				}else{
					calBean.setEnd("");
					calBean.seteTime("");
				}
				if(act.getBaPicturePath()!=null && act.getBaPicturePath().length()>0){
					calBean.setImgPath(act.getBaPicturePath());
				}
				if(act.getBaPictureName()!=null && act.getBaPictureName().length()>0){
					calBean.setImgName(act.getBaPictureName());
				}
				calendarList.add(calBean);
			}
			Gson gson = new Gson();
			String calendarJSON = gson.toJson(calendarList);
			logger.debug("========");
			logger.debug(calendarJSON);
			logger.debug("========");
			model.addAttribute("calendarJSON",calendarJSON);
		}else{
			logger.debug("not event.....");
			model.addAttribute("calendarJSON",null);
		}
		return "bizclub/calendarActivities";
    }
	
	@RequestMapping(value={"/delactivity/{bcId}/{baId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String delActivityByBaId(@PathVariable Integer bcId,
    								@PathVariable Integer baId,
    								HttpServletRequest request,
    								HttpServletResponse response,
    								Model model) {
		logger.debug("delActivityByBaId...."+baId);
		logger.debug("bcId:"+bcId);
		logger.debug("baId:"+baId);
		model.addAttribute("bizclubCenter", bizClubService.findBizclubCenterById(bcId));
		model.addAttribute("provinceCenters", bizClubService.listBizclubCenter());
		model.addAttribute("bcId",bcId);
		
		BizclubActivityM activitiesM = new BizclubActivityM();
		activitiesM.setBaId(baId);
		Integer result = bizClubService.deleteActivity(activitiesM);
		logger.debug("deleteActivity:"+result);
		
		return "redirect:/news/activity/"+bcId;
    }
	
	
	@RequestMapping(value={"/editactivity/{bcId}/{baId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String editActivityByBcId(	@PathVariable Integer bcId, @PathVariable Integer baId,
    							HttpServletRequest request,
    							HttpServletResponse response,
    							Model model) {
		logger.debug("editActivityByBcId...."+bcId);
		logger.debug("bcId:"+bcId);
		logger.debug("baId:"+baId);
		
		model.addAttribute("bizclubCenter", bizClubService.findBizclubCenterById(bcId));
		model.addAttribute("provinceCenters", bizClubService.listBizclubCenter());
		model.addAttribute("bcId",bcId);
		
		BizclubActivityM defaultActivity = bizClubService.findBizclubActivityById(baId);
		CalendarActivityForm activitiyForm = new CalendarActivityForm();
		activitiyForm.setBcId(bcId);
		activitiyForm.setBaId(baId);
		
		activitiyForm.setCreateBy(defaultActivity.getCreatedBy());
		activitiyForm.setCreateDate(defaultActivity.getCreatedDate());
		
		if(defaultActivity.getBaTitle()!=null && defaultActivity.getBaTitle().length()>0){
			activitiyForm.setBaTitle(defaultActivity.getBaTitle());
		}
		if(defaultActivity.getBaDetail()!=null && defaultActivity.getBaDetail().length()>0){
			activitiyForm.setBaDetail(defaultActivity.getBaDetail());
		}
		if(defaultActivity.getBaStartTime()!=null){
			activitiyForm.setBaStartTime(convertTimestampToString2(defaultActivity.getBaStartTime()));
		}
		if(defaultActivity.getBaEndTime()!=null){
			activitiyForm.setBaEndTime(convertTimestampToString2(defaultActivity.getBaEndTime()));
		}
		if(defaultActivity.getIsFixed()!=null){
			activitiyForm.setIsFixed(defaultActivity.getIsFixed());
		}
		
		if(defaultActivity.getBaPicturePath()!=null && defaultActivity.getBaPicturePath().length()>0){
			activitiyForm.setBaPicturePath(defaultActivity.getBaPicturePath());
		}
		if(defaultActivity.getBaPictureName()!=null && defaultActivity.getBaPictureName().length()>0){
			activitiyForm.setBaPictureName(defaultActivity.getBaPictureName());
		}
		model.addAttribute("calendarActivityForm", activitiyForm);
		return "bizclub/addCalendarActivities";
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
		String currentUser = null;
		String sTime = bundle.getString("activityStartTime");
		String eTime = bundle.getString("activityStartTime");
		
		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		if(authentication.isAuthenticated() && authentication.getPrincipal()!=null && !authentication.getPrincipal().equals("anonymousUser")){
			MyUserDetails user=(MyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			currentUser = user.getUsername();
			logger.debug("username...."+currentUser); 
		}
		
		BizclubActivityM bizclubActivityM = new BizclubActivityM();
		
		logger.debug("saveActivity....");
		if(request.getUserPrincipal()!=null) logger.debug(request.getUserPrincipal().getName()+"...");
		logger.debug("bcId:"+actForm.getBcId());
		logger.debug("title:"+actForm.getBaTitle());
		logger.debug("sDate:"+actForm.getBaStartTime());
		logger.debug("eDate:"+actForm.getBaEndTime());
		logger.debug("detail:"+actForm.getBaDetail());
		logger.debug("fix:"+actForm.getIsFixed());
		
		bizclubActivityM.setBcId(actForm.getBcId());
		
		
		if(actForm.getBaId()>0){
			bizclubActivityM.setBaId(actForm.getBaId());
		}
		if(actForm.getBaTitle()!=null) bizclubActivityM.setBaTitle(actForm.getBaTitle());
		
		if(actForm.getBaStartTime()!=null) {
			Timestamp baStartTime =  convertStringToTimestamp(actForm.getBaStartTime()+" "+sTime);
			if(baStartTime!=null) bizclubActivityM.setBaStartTime(baStartTime);
		}
		if(actForm.getBaEndTime()!=null){
			Timestamp baEndTime =  convertStringToTimestamp(actForm.getBaEndTime()+" "+eTime);
			if(baEndTime!=null) bizclubActivityM.setBaEndTime(baEndTime);
		}
		if(actForm.getBaDetail()!=null) bizclubActivityM.setBaDetail(actForm.getBaDetail());
		if(actForm.getIsFixed()!=null) {
			if(actForm.getIsFixed()!="null") {
				bizclubActivityM.setIsFixed("Y"); 
			}else{
				bizclubActivityM.setIsFixed("N");
			}
		}else{
			bizclubActivityM.setIsFixed("N");
		}
		
		if(actForm.getBaPicturePath()!=null && actForm.getBaPicturePath().length()>0){
			bizclubActivityM.setBaPicturePath(actForm.getBaPicturePath());
		}
		
		if(actForm.getBaPictureName()!=null && actForm.getBaPictureName().length()>0){
			bizclubActivityM.setBaPictureName(actForm.getBaPictureName());
		}
		
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
				  logger.debug("defaultPath:"+path);
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
				 
				 logger.debug("profilePath(length)....."+profilePath.length());
				 logger.debug("profileFileName(length)....."+profileFileName.length());
				 
				 bizclubActivityM.setBaPicturePath(actForm.getBaPicturePath());
				 bizclubActivityM.setBaPictureName(actForm.getBaPictureName());
				
				 
				}
			}catch (Exception e) {
				//e.printStackTrace();
				logger.error("File Error xxxxx:"+e.getMessage());
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
		if(bizclubActivityM.getBaId()>0){
			//Update activity
			bizclubActivityM.setCreatedBy(actForm.getCreateBy());
			bizclubActivityM.setCreatedDate(actForm.getCreateDate());
			if(currentUser!=null)bizclubActivityM.setUpdatedBy(currentUser);
			bizClubService.updateActivity(bizclubActivityM);
		}else{
			//save Activity
			if(currentUser!=null){
				bizclubActivityM.setUpdatedBy(currentUser);
				bizclubActivityM.setCreatedBy(currentUser);
			}
			bizClubService.saveActivity(bizclubActivityM);
		}
		return "redirect:/news/activity/"+actForm.getBcId();
	 }
	
	private Timestamp convertStringToTimestamp(String strDate){
		Timestamp timestamp = null;
		String newFormat = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		try {
			java.util.Date myDt  = sdf.parse(strDate);
			newFormat = (myDt.getYear()+1900)+"-"+(myDt.getMonth()+1)+"-"+myDt.getDate()+" "+ myDt.getHours()+":"+myDt.getMinutes()+":"+myDt.getSeconds();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			Date parsedDate = dateFormat.parse(newFormat);
			timestamp = new java.sql.Timestamp(parsedDate.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return timestamp;
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
	 private String convertTimestampToJson(String strTime){
		 logger.debug("convertTimestampToJson..."+strTime);
		 String result = null;
		 try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			Date parsedDate = dateFormat.parse(strTime);
			Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
			result = timestamp.toString().replaceAll(" ", "T");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 logger.debug("result:"+result);
		 return result;
	 } 
	 
	 private String convertTimestampToString(Timestamp timeDate){
		return timeDate.getDate()+"/"+(timeDate.getMonth()+1)+"/"+(timeDate.getYear()+1900)+" "+ timeDate.getHours()+":"+timeDate.getMinutes()+"0";
	}
	 
	private String convertTimestampToString2(Timestamp timeDate){
		return timeDate.getDate()+"/"+(timeDate.getMonth()+1)+"/"+(timeDate.getYear()+1900);
	}
}

