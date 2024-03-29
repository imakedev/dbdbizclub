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
import th.go.dbd.bizclub.form.PublicizeForm;
import th.go.dbd.bizclub.domain.MyUserDetails;
import th.go.dbd.bizclub.form.CalendarActivityForm;
import th.go.dbd.bizclub.model.BizclubActivityM;
import th.go.dbd.bizclub.model.BizclubCenterM;
import th.go.dbd.bizclub.model.BizclubPublicizeM;
import th.go.dbd.bizclub.service.BizClubService;

@Controller 
@RequestMapping(value={"/news"})
@SessionAttributes(value={"calendarActivityForm","publicizeForm"})
public class PublicNewsController {
	Logger logger = Logger.getRootLogger();
	
	@Autowired
	@Qualifier("bizClubServiceImpl")
	private BizClubService bizClubService;
	private static ResourceBundle bundle;
	//private String thCurr;
	static{
		bundle =  ResourceBundle.getBundle("config");	
		//thCurr = getThCurrentDate();
	}
	
	@RequestMapping(value={"", "/"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	public String listAllNews(HttpServletRequest request,HttpServletResponse response,Model model, @RequestParam(required=false) String message) {
    	logger.debug("publicNews12........");
    	//get new by zone 1 ภาคกลาง
    	BizclubPublicizeM bcPublicizeM = new BizclubPublicizeM();
    	BizclubCenterM bcCenterM = new BizclubCenterM();
    	bcCenterM.setBcId(0);
    	bcCenterM.setBcZone(1);
    	bcPublicizeM.setBizclubCenterM(bcCenterM);
    	BizclubPublicizeM bcPublicizeM_Zone1 = bizClubService.findPublicizeByZone(bcPublicizeM);
    	model.addAttribute("zone1",bcPublicizeM_Zone1);
    	//get new by zone 2 ภาคเหนือ
    	bcPublicizeM = new BizclubPublicizeM();
    	bcCenterM = new BizclubCenterM();
    	bcCenterM.setBcId(0);
    	bcCenterM.setBcZone(2);
    	bcPublicizeM.setBizclubCenterM(bcCenterM);
    	BizclubPublicizeM bcPublicizeM_Zone2 = bizClubService.findPublicizeByZone(bcPublicizeM);
    	model.addAttribute("zone2",bcPublicizeM_Zone2);
    	//get new by zone 3 ภาคใต้
    	bcPublicizeM = new BizclubPublicizeM();
    	bcCenterM = new BizclubCenterM();
    	bcCenterM.setBcId(0);
    	bcCenterM.setBcZone(3);
    	bcPublicizeM.setBizclubCenterM(bcCenterM);
    	BizclubPublicizeM bcPublicizeM_Zone3 = bizClubService.findPublicizeByZone(bcPublicizeM);
    	model.addAttribute("zone3",bcPublicizeM_Zone3);
    	//get new by zone 4 ภาคตะวันออก
    	bcPublicizeM = new BizclubPublicizeM();
    	bcCenterM = new BizclubCenterM();
    	bcCenterM.setBcId(0);
    	bcCenterM.setBcZone(4);
    	bcPublicizeM.setBizclubCenterM(bcCenterM);
    	BizclubPublicizeM bcPublicizeM_Zone4 = bizClubService.findPublicizeByZone(bcPublicizeM);
    	model.addAttribute("zone4",bcPublicizeM_Zone4);
    	//get new by zone 5 ภาคตะวันตก
    	bcPublicizeM = new BizclubPublicizeM();
    	bcCenterM = new BizclubCenterM();
    	bcCenterM.setBcId(0);
    	bcCenterM.setBcZone(5);
    	bcPublicizeM.setBizclubCenterM(bcCenterM);
    	BizclubPublicizeM bcPublicizeM_Zone5 = bizClubService.findPublicizeByZone(bcPublicizeM);
    	model.addAttribute("zone5",bcPublicizeM_Zone5);
    	//get new by zone 6 ภาคอีสาน
    	bcPublicizeM = new BizclubPublicizeM();
    	bcCenterM = new BizclubCenterM();
    	bcCenterM.setBcId(0);
    	bcCenterM.setBcZone(6);
    	bcPublicizeM.setBizclubCenterM(bcCenterM);
    	BizclubPublicizeM bcPublicizeM_Zone6 = bizClubService.findPublicizeByZone(bcPublicizeM);
    	model.addAttribute("zone6",bcPublicizeM_Zone6);
		return "bizclub/news";
	}
	@RequestMapping(value={"/publicize/{bcId}/{bcZone}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	public String listPublicizeByBcId(	@PathVariable Integer bcId,@PathVariable Integer bcZone,
			HttpServletRequest request,
			HttpServletResponse response,
			Model model) {

		String imgURL = bundle.getString("activityDefaultUrl");
		logger.debug("listPublicizeByBcId...."+bcId);
		if(bcId!=0){
			model.addAttribute("bizclubCenter", bizClubService.findBizclubCenterById(bcId));
			model.addAttribute("bcId",bcId);
		}else{
			BizclubCenterM bcCenterM = bizClubService.findBizclubCenterByZone(bcZone);
			model.addAttribute("bizclubCenter", bcCenterM);
			model.addAttribute("bcId",bcCenterM.getBcId());
		}
		model.addAttribute("bcZone",bcZone);
		
		model.addAttribute("provinceCenters", bizClubService.listBizclubCenter(bcZone));
		BizclubPublicizeM bcPublicizeM = new BizclubPublicizeM();
		BizclubCenterM bcCenterM = new BizclubCenterM();
		bcCenterM.setBcId(bcId);
		bcCenterM.setBcZone(bcZone);
		bcPublicizeM.setBizclubCenterM(bcCenterM);
		List<BizclubPublicizeM> listBizclubPublicize = bizClubService.searchPublicizeByCenter(bcPublicizeM);
		if(listBizclubPublicize!=null && listBizclubPublicize.size()>0){
			logger.debug("listActivity:"+listBizclubPublicize.size());
			List<NewsActivityBean> newsActList = new ArrayList<NewsActivityBean>();
			for (int i = 0; i < listBizclubPublicize.size(); i++) {
				BizclubPublicizeM act = listBizclubPublicize.get(i);
				NewsActivityBean newsActBean = new NewsActivityBean();
				newsActBean.setCenterId(bcId);
				newsActBean.setActivityId(act.getBpId());
				newsActBean.setTitle(act.getBpTitle());
				newsActBean.setDetail(act.getBpDetail());
				
				if(act.getBpPicturePath()!=null && act.getBpPicturePath().length()>0){
					newsActBean.setImgPath(act.getBpPicturePath());
				}
				if(act.getBpPictureName()!=null && act.getBpPictureName().length()>0){
					newsActBean.setImgName(act.getBpPictureName());
				}
				newsActList.add(newsActBean);
			}
			model.addAttribute("newsActList",newsActList);
		}else{
		logger.debug("not event.....");
			model.addAttribute("newsActList",null);
		}
		PublicizeForm publicizeForm = new PublicizeForm();
		publicizeForm.setBcId(bcId);
		publicizeForm.setBcZone(bcZone);
		model.addAttribute("publicizeForm", publicizeForm);
		return "bizclub/listNews";
	}
	
	
	@RequestMapping(value={"/publicize/add/{bcId}/{bcZone}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody PublicizeForm initAddActivity(@PathVariable Integer bcId,@PathVariable Integer bcZone,Model model) {
		PublicizeForm act = new PublicizeForm();
		act.setBcId(bcId);
		act.setBcZone(bcZone);
		act.setPageMode("add");
		 return  act;
	}
	
	@RequestMapping(value={"/publicize/save"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
	public String saveNewsActivity(	HttpServletRequest request,
			 				HttpServletResponse response,  
			 				@ModelAttribute(value="publicizeForm") PublicizeForm publicizeForm, 
			 				BindingResult result, 
			 				Model model){
		
		BizclubPublicizeM bizclubPublicizeM = new BizclubPublicizeM();
		BizclubCenterM bizclubCenterM = new BizclubCenterM();
		logger.debug("saveActivity....");
		if(request.getUserPrincipal()!=null) logger.debug(request.getUserPrincipal().getName()+"...");
		logger.debug("bcId:"+publicizeForm.getBcId());
		logger.debug("title:"+publicizeForm.getBpTitle());
		logger.debug("detail:"+publicizeForm.getBpDetail());
		logger.debug("fix:"+publicizeForm.getIsFixed());
		bizclubCenterM.setBcId(publicizeForm.getBcId());
		bizclubPublicizeM.setBizclubCenterM(bizclubCenterM);
		
		if(publicizeForm.getBpTitle()!=null) bizclubPublicizeM.setBpTitle(publicizeForm.getBpTitle());
		if(publicizeForm.getBpDetail()!=null) bizclubPublicizeM.setBpDetail(publicizeForm.getBpDetail());
		if(publicizeForm.getIsFixed()!=null) {
			if(publicizeForm.getIsFixed()!="null") {
				bizclubPublicizeM.setIsFixed("Y"); 
			}else{
				bizclubPublicizeM.setIsFixed("N");
			}
		}else{
			bizclubPublicizeM.setIsFixed("N");
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
				 publicizeForm.setBpPicturePath(profilePath);
				 publicizeForm.setBpPictureName(profileFileName);
				 
				 logger.debug("profilePath(length)....."+profilePath.length());
				 logger.debug("profileFileName(length)....."+profileFileName.length());
				 
				 bizclubPublicizeM.setBpPicturePath(publicizeForm.getBpPicturePath());
				 bizclubPublicizeM.setBpPictureName(publicizeForm.getBpPictureName());
				 
				 if(request.getUserPrincipal()!=null) {
					 bizclubPublicizeM.setCreatedBy(request.getUserPrincipal().getName());
					 bizclubPublicizeM.setUpdatedBy(request.getUserPrincipal().getName());
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
		if(publicizeForm.getPageMode()!=null && "add".equals(publicizeForm.getPageMode())){
			bizClubService.savePublicize(bizclubPublicizeM);
		}
		if(publicizeForm.getPageMode()!=null && "edit".equals(publicizeForm.getPageMode())){
			if(publicizeForm.getBpId()!=0) bizclubPublicizeM.setBpId(publicizeForm.getBpId());
			bizClubService.updatePublicize(bizclubPublicizeM);
		}
		if(publicizeForm.getPageMode()!=null && "delete".equals(publicizeForm.getPageMode())){
			if(publicizeForm.getBpId()!=0) bizclubPublicizeM.setBpId(publicizeForm.getBpId());
			bizClubService.deletePublicize(bizclubPublicizeM);
		}
		return "redirect:/news/publicize/"+publicizeForm.getBcId()+"/"+publicizeForm.getBcZone();
	 }
	
	@RequestMapping(value={"/publicize/moreDetail/{bcId}/{bcZone}/{bpId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody PublicizeForm moreDetail(@PathVariable Integer bcId,@PathVariable Integer bcZone,@PathVariable Integer bpId,Model model) {
		BizclubPublicizeM bizclubPublicizeM = new BizclubPublicizeM();
		BizclubCenterM bizclubCenterM = new BizclubCenterM();
		bizclubCenterM.setBcId(bcId);
		bizclubPublicizeM.setBpId(bpId);
		bizclubPublicizeM.setBizclubCenterM(bizclubCenterM);
		BizclubPublicizeM result = bizClubService.findPublicizeByBpId(bizclubPublicizeM);
		PublicizeForm form = new PublicizeForm();
		form.setBcId(result.getBizclubCenterM().getBcId());
		form.setBcZone(bcZone);
		form.setBpId(result.getBpId());
		form.setBpTitle(result.getBpTitle());
		form.setBpDetail(result.getBpDetail());
		form.setBpPicturePath(result.getBpPicturePath());
		form.setBpPictureName(result.getBpPictureName());
		form.setIsFixed(result.getIsFixed());
		return  form;
	}
	
	@RequestMapping(value={"/publicize/edit/{bcId}/{bcZone}/{bpId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody PublicizeForm initEditActivity(@PathVariable Integer bcId,@PathVariable Integer bcZone,@PathVariable Integer bpId,Model model) {
		BizclubPublicizeM bizclubPublicizeM = new BizclubPublicizeM();
		BizclubCenterM bizclubCenterM = new BizclubCenterM();
		bizclubCenterM.setBcId(bcId);
		bizclubPublicizeM.setBpId(bpId);
		bizclubPublicizeM.setBizclubCenterM(bizclubCenterM);
		BizclubPublicizeM result = bizClubService.findPublicizeByBpId(bizclubPublicizeM);
		PublicizeForm form = new PublicizeForm();
		form.setBcId(result.getBizclubCenterM().getBcId());
		form.setBcZone(bcZone);
		form.setBpId(result.getBpId());
		form.setBpTitle(result.getBpTitle());
		form.setBpDetail(result.getBpDetail());
		form.setBpPicturePath(result.getBpPicturePath());
		form.setBpPictureName(result.getBpPictureName());
		form.setIsFixed(result.getIsFixed());
		form.setPageMode("edit");
		 return  form;
	}
	@RequestMapping(value={"/publicize/delete/{bcId}/{bcZone}/{bpId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody PublicizeForm initDeleteActivity(@PathVariable Integer bcId,@PathVariable Integer bcZone,@PathVariable Integer bpId,Model model) {
		BizclubPublicizeM bizclubPublicizeM = new BizclubPublicizeM();
		BizclubCenterM bizclubCenterM = new BizclubCenterM();
		bizclubCenterM.setBcId(bcId);
		bizclubPublicizeM.setBpId(bpId);
		bizclubPublicizeM.setBizclubCenterM(bizclubCenterM);
		BizclubPublicizeM result = bizClubService.findPublicizeByBpId(bizclubPublicizeM);
		PublicizeForm form = new PublicizeForm();
		form.setBcId(result.getBizclubCenterM().getBcId());
		form.setBcZone(bcZone);
		form.setBpId(result.getBpId());
		form.setBpTitle(result.getBpTitle());
		form.setBpDetail(result.getBpDetail());
		form.setIsFixed(result.getIsFixed());
		form.setPageMode("delete");
		 return  form;
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
				calBean.setBaType(act.getBaType());
				
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
		
		String thCurent = getThCurrentDate();
		model.addAttribute("thCurent", thCurent);
		logger.debug("thCurent:"+thCurent);
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
		
		logger.debug("defaultActivity:"+defaultActivity);
		
		CalendarActivityForm activitiyForm = new CalendarActivityForm();
		activitiyForm.setBcId(bcId);
		activitiyForm.setBaId(baId);
		
		activitiyForm.setCreateBy(defaultActivity.getCreatedBy());
		activitiyForm.setCreateDate(defaultActivity.getCreatedDate());
		logger.debug("BaType:"+defaultActivity.getBaType());
		logger.debug("BaType:"+defaultActivity.getBaType().length());
		
		activitiyForm.setBaType(defaultActivity.getBaType());
		
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
		String eTime = bundle.getString("activityEndTime");
		
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
		logger.debug("type:"+actForm.getBaType());
		
		bizclubActivityM.setBcId(actForm.getBcId());
		bizclubActivityM.setBaType(actForm.getBaType());
		
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
		return timeDate.getDate()+"/"+(timeDate.getMonth()+1)+"/"+(timeDate.getYear()+1900+543)+" "+ timeDate.getHours()+":"+timeDate.getMinutes()+"0";
	}
	 
	private String convertTimestampToString2(Timestamp timeDate){
		return timeDate.getDate()+"/"+(timeDate.getMonth()+1)+"/"+(timeDate.getYear()+1900);
	}
	
	private String getThCurrentDate(){
		logger.debug("getThCurrentDate()....");
		String thCurr = null;
		Date date = new Date();
		int month = date.getMonth()+1;
		String mmStr =null;
		switch (month) {
			case 1:
				mmStr = "มกราคม";
				break;
			case 2:
				mmStr = "กุมภาพันธ์";
				break;
			case 3:
				mmStr = "มีนาคม";
				break;
			case 4:
				mmStr = "เมษายน";
				break;
			case 5:
				mmStr = "พฤษภาคม";
				break;
			case 6:
				mmStr = "มิถุนายน";
				break;
			case 7:
				mmStr = "กรกฎษาคม";
				break;
			case 8:
				mmStr = "สิงหาคม";
				break;
			case 9:
				mmStr = "กันยายน";
				break;
			case 10:
				mmStr = "ตุลาคม";
				break;
			case 11:
				mmStr = "พฤศจิกายน";
				break;
			case 12:
				mmStr = "ธันวาคม";
				break;
			default:
				break;
		}
		int year = date.getYear()+1900+543;
		thCurr = mmStr +" "+year;
		logger.debug("thCurr:"+thCurr);
		return thCurr;
	}
}

