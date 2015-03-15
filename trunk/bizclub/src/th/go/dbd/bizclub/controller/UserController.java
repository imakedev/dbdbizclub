package th.go.dbd.bizclub.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import th.go.dbd.bizclub.form.UserForm;
import th.go.dbd.bizclub.model.UserM;
import th.go.dbd.bizclub.service.BizClubService;

@Controller 
@RequestMapping(value={"/member"})
@SessionAttributes(value={"userForm"})
public class UserController {
	@Autowired
    private BizClubService bizClubService;
	@RequestMapping(value={"", "/"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String list(Model model,SecurityContextHolderAwareRequestWrapper srequest)
    {
    	model.addAttribute("users", bizClubService.searchUser(null)); 
        model.addAttribute("userForm",new UserForm() );
        return "bizclub/searchmember";
    }
	 @RequestMapping(value={"/delete/{userId}"},method = RequestMethod.GET)
	 public String deleteItem(@PathVariable Integer userId) {
		 System.out.println("delete->"+userId);
		 UserM userM =new UserM();
		 userM.setUserId(userId);
	     bizClubService.deleteUser(userM);
	     return "redirect:/member";
	 }	
	@RequestMapping(value={"/search"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    public String doSearch(HttpServletRequest request, @ModelAttribute(value="userForm") UserForm userForm, BindingResult result, Model model)
    {
        //String mode = userForm.getMode();
       String keyworkd=userForm.getKeyword();
       String searchForm= userForm.getSearchForm();
       String searchType= userForm.getSearchType();
       System.out.println("searchForm->"+searchForm);
       System.out.println("searchType->"+searchType);
       UserM userM=new UserM();
 
       if(searchType!=null && searchType.length()>0 ){
    	   userM.setCorpGroupDesc(searchType);  
       }
       
       if(searchForm!=null && searchForm.length()>0){
    	   if(searchForm.equals("2")){
    		   userM.setCardId(keyworkd);
    	   }else if(searchForm.equals("3")){
    		   userM.setFirstName(keyworkd);
    	   }else if(searchForm.equals("4")){
    		   userM.setCorpName(keyworkd);
    	   }else if(searchForm.equals("5")){
    		   userM.setServices(keyworkd);
    	   } 
    	  
       }
        model.addAttribute("users", bizClubService.searchUser(userM)); 
        model.addAttribute("userForm", userForm);
        return "bizclub/searchmember";
    }

    /*	
	 @RequestMapping(value={"/users"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	    public String loadAccount(Model model)
	    {
		 UserForm userForm = null;
	        if(model.containsAttribute("missForm"))
	        	userForm = (userForm)model.asMap().get("userForm");
	        else
	        	userForm = new userForm();
	        MissAccount missAccount = missExamService.findMissAccountById(Long.valueOf(1L));
	        if(missAccount.getMissTheme()==null){
	        	MissTheme missTheme =new MissTheme();
	        	missTheme.setMtId(1l);
	        	missAccount.setMissTheme(missTheme);
	        }
	        userForm.setMissAccount(missAccount);
	        model.addAttribute("display", "display: none");
	        userForm.getMissAccount().setSection("0");
	        model.addAttribute("userForm", userForm);
	    	@SuppressWarnings("unchecked")
			List<MissTheme> missThemes = missExamService.listMissTheme(new MissTheme());
	    	model.addAttribute("missThemes",missThemes);
	    	model.addAttribute("missIndustryMasterList", missExamService.listMissIndustryMaster());
	    	return "exam/template/missAccount";
	    }

	    @RequestMapping(value={"/action/{section}"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
	    public String doAction(HttpServletRequest request, @PathVariable String section, @ModelAttribute(value="missForm") MissForm missForm, BindingResult result, Model model)
	    {
	       // String mode = missForm.getMode();
	        String message = "";
	        String message_class="";
	        missForm.getMissAccount().setSection(section);
	       
	        missExamService.updateMissAccount(missForm.getMissAccount());
	        message = "Update success !";
	        message_class="success";
	        MissAccount missAccount = missExamService.findMissAccountById(Long.valueOf(1L));
	        if(missAccount.getMissTheme()==null){
	        	MissTheme missTheme =new MissTheme();
	        	missTheme.setMtId(1l);
	        	missAccount.setMissTheme(missTheme);
	        }
	        missForm.setMissAccount(missAccount);
	        model.addAttribute("message", message); 
	        model.addAttribute("display", "display: block");
	        model.addAttribute("message_class", message_class);
	        missForm.getMissAccount().setSection(section);
	        model.addAttribute("missForm", missForm);
	        @SuppressWarnings("unchecked")
			List<MissTheme> missThemes = missExamService.listMissTheme(new MissTheme());
	    	model.addAttribute("missThemes",missThemes);
	    	model.addAttribute("missIndustryMasterList", missExamService.listMissIndustryMaster());
	        return "exam/template/missAccount";
	    }

	    @RequestMapping(value={"/account/{maId}/contacts"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
	    public String contactsList(@PathVariable String maId, @ModelAttribute(value="contactForm") ContactForm contactForm, Model model)
	    { 
	    	
	        
	         String mode = contactForm.getMode();
	         logger.debug("into xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx mode="+mode);
	         if(mode != null && mode.equals("deleteItems"))
	         {
	        	 logger.debug("Start DELETE mode="+contactForm.getMcontactIdArray());
	        	 contactForm.getMissContact().setMcontactIds(contactForm.getMcontactIdArray());
	             missExamService.deleteMissContact(contactForm.getMissContact(),ServiceConstant.MISS_CONTACT_ITEMS_DELETE);
	             logger.debug("End DELETE mode="+contactForm.getMcontactIdArray());
	         }else if(mode != null && mode.equals("delete")){
	             missExamService.deleteMissContact(contactForm.getMissContact(), ServiceConstant.MISS_CONTACT_DELETE);
	         }
	         contactForm.getPaging().setPageNo(1);
	    	@SuppressWarnings("rawtypes")
			List missContacts=null;
	    	if(maId!=null && !maId.equals("0")){
	    		missContacts = missExamService.listContacts(Long.parseLong(maId),account_type);
	    		contactForm.setMaId(maId);
	    	}
	    	contactForm.setMode("edit");
	    	contactForm.getMissContact().setMcontactType(account_type);
	        model.addAttribute("missContacts", missContacts);
	        model.addAttribute("contactForm", contactForm);
	        return "exam/template/contactListSection";
	    }
	    @RequestMapping(value={"/account/{maId}/contacts"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	    public String getContactList(@PathVariable String maId, Model model)
	    {
	    	logger.debug("into getQuestionList xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx "+maId);
	    	ContactForm contactForm = null;
	         if(model.containsAttribute("contactForm"))
	        	 contactForm = (ContactForm)model.asMap().get("contactForm");
	         else
	        	 contactForm = new ContactForm();
	         contactForm.setMode("edit");
	        
	    	@SuppressWarnings("rawtypes")
			List missContacts=null;
	    	if(maId!=null && !maId.equals("0")){
	    		missContacts = missExamService.listContacts(Long.parseLong(maId),account_type);
	    		contactForm.setMaId(maId);
	    	} 
	        model.addAttribute("missContacts", missContacts);
	        contactForm.getMissContact().setMcontactType(account_type);
	        model.addAttribute("contactForm", contactForm);
	        return "exam/template/contactListSection";
	    }
	    @RequestMapping(value={"/account/{maId}/contact/{mcontactId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	    public String getContactItem(@PathVariable String maId,@PathVariable String mcontactId, Model model)
	    {
	    	logger.debug("into xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	    	ContactForm contactForm = null;
	         if(model.containsAttribute("contactForm"))
	        	 contactForm = (ContactForm)model.asMap().get("contactForm");
	         else
	        	 contactForm = new ContactForm();
	         contactForm.setMode("edit");
	         MissContact missContact=null;
	    //	if(meId!=null && !meId.equals("0")){
	    		missContact = missExamService.findMissContactById(Long.parseLong(mcontactId));
	    //	}
	    		if(missContact != null && missContact.getMcontactBirthDate() != null)
	    			contactForm.setMcontactBirthDate(format11.format(missContact.getMcontactBirthDate()));
	    		else
	    			contactForm.setMcontactBirthDate(null);
	    		model.addAttribute("roleContacts", missExamService.listRoleContactBymaId(Long.parseLong(maId)));
	    		model.addAttribute("display", "display: none");
	      //  model.addAttribute("missContacts", missContacts);
	    		contactForm.setMissContact(missContact);
	    	//missExamService
	        model.addAttribute("contactForm", contactForm);
	        return "exam/template/contactManagementSection";
	    } 
	    @RequestMapping(value={"/account/{maId}/contact/new"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	    public String getNetContactItem(Model model,@PathVariable String maId)
	    {
	    	ContactForm contactForm = null;
	        if(model.containsAttribute("contactForm"))
	        	contactForm = (ContactForm)model.asMap().get("contactForm");
	        else
	        	contactForm = new ContactForm();
	        contactForm.setMcontactBirthDate(null);
	        MissContact missContact =new MissContact();
	        missContact.setMcontactType(account_type);
	        missContact.setMcontactRef(Long.parseLong(maId));
	        contactForm.setMissContact(missContact);
	        contactForm.setMode("new");
	        model.addAttribute("roleContacts", missExamService.listRoleContactBymaId(Long.parseLong(maId)));
	        model.addAttribute("display", "display: none");
	        return "exam/template/contactManagementSection";
	    }
	    @RequestMapping(value={"/action/account/contact"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
	    public String doContactAction(HttpServletRequest request, @ModelAttribute(value="contactForm") ContactForm contactForm, BindingResult result, Model model)
	    
	    {
	        String mode = contactForm.getMode();
	        String message = ""; 
	        logger.debug("xxxxxxxxxxxxxxxxxxxxxxx yyyyyyyyyyyyyyyyy doContactAction mode="+mode);
	        Long id = null;
	        if(mode != null){
	        	if(contactForm.getMcontactBirthDate() != null && contactForm.getMcontactBirthDate().trim().length() > 0)
	                try
	                {
	                	contactForm.getMissContact().setMcontactBirthDate(format2.parse(contactForm.getMcontactBirthDate()));
	                }
	                catch(ParseException e)
	                {
	                    e.printStackTrace();
	                }
	            if(mode.equals("new"))
	            {
	            	contactForm.getMissContact().setMcontactType(account_type);
	                id = missExamService.saveMissContact(contactForm.getMissContact());
	                contactForm.getMissContact().setMcontactId(id);
	                contactForm.setMode("edit");
	                message = "Save success !";
	            } else
	            if(mode.equals("edit"))
	            {
	            	missExamService.updateMissContact(contactForm.getMissContact());
	                id = contactForm.getMissContact().getMcontactId();
	                message = "Update success !";
	            }
	        }
	    	model.addAttribute("roleContacts", missExamService.listRoleContactBymaId(Long.parseLong(contactForm.getMaId())));
	        model.addAttribute("message", message);
	        model.addAttribute("display", "display: block");
	        model.addAttribute("contactForm", contactForm);
	        
	        return "exam/template/contactManagementSection";
	    }
	    @RequestMapping(value={"/theme/{maId}/{mtId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	    @ResponseBody
	    public String getTheme(@PathVariable Long maId,@PathVariable Long mtId, Model model)
	    {
	        MissTheme missTheme = missExamService.findMissThemeById(maId,mtId);
	        logger.debug("xxxxxxxxxxx=model.containsAttribute(\"UserMissContact\")"+model.containsAttribute("UserMissContact"));
	        if(model.containsAttribute("UserMissContact")){
	        	MissContact missContact= (MissContact)model.asMap().get("UserMissContact");
	        	missContact.setMissTheme(missTheme); 
	        }
	        Gson gson=new Gson();
			return gson.toJson(missTheme);
	    }
	    */
}
