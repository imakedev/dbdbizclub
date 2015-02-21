package th.go.dbd.bizclub.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import th.go.dbd.bizclub.form.ApproveForm;
import th.go.dbd.bizclub.mail.MailRunnable;
import th.go.dbd.bizclub.model.BizclubRegisterM;
import th.go.dbd.bizclub.model.UserM;
import th.go.dbd.bizclub.service.BizClubService;
@Controller 
@RequestMapping(value={"/approve"})
@SessionAttributes(value={"approveForm"})
public class ApproveController {
	@Autowired
    private BizClubService bizClubService;
	@RequestMapping(value={"/"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String list(Model model,SecurityContextHolderAwareRequestWrapper srequest)
    {
		BizclubRegisterM bizclubRegisterM =new BizclubRegisterM();
		bizclubRegisterM.setApproveStatus("0");
    	model.addAttribute("bizclubRegisters", bizClubService.searchBizclubRegister(bizclubRegisterM)); 
        model.addAttribute("approveForm",new ApproveForm() );
        return "bizclub/approveList";
    }
	@RequestMapping(value={"/search"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    public String doSearch(HttpServletRequest request, @ModelAttribute(value="approveForm") ApproveForm approveForm, BindingResult result, Model model)
    {
		BizclubRegisterM bizclubRegisterM =new BizclubRegisterM();
		bizclubRegisterM.setApproveStatus("0");
        model.addAttribute("bizclubRegisters", bizClubService.searchBizclubRegister(bizclubRegisterM)); 
        model.addAttribute("approveForm", approveForm);
        return "bizclub/approveList";
    }
	@RequestMapping(value={"/item/{brId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody BizclubRegisterM getItem(@PathVariable Integer brId,Model model)
	    {
		 return bizClubService.findBizclubRegisterById(brId) ;
	    }
	private String genToken(int number){
  		StringBuffer sb = new StringBuffer();
  	    for (int i = number; i > 0; i -= 12) {
  	      int  n= Math.min(12, Math.abs(i));
  	      sb.append(org.apache.commons.lang3.StringUtils.leftPad(Long.toString(Math.round(Math.random() * Math.pow(36, n)), 36), n, '0'));
  	    }
  	    return sb.toString();
	}
	@RequestMapping(value={"/action"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    public String doApprove(HttpServletRequest request, @ModelAttribute(value="approveForm") ApproveForm approveForm, BindingResult result, Model model)
    {
		BizclubRegisterM bizclubRegister =bizClubService.findBizclubRegisterById(approveForm.getBrId());;
		
		if(approveForm.getApproveStatus().equals("1")){ // approved
			
			UserM user=new UserM();
			String username=genToken(8);
			String password=genToken(4);
			user.setUserName(username);
			user.setPassword(password);
			user.setAddressDistrict(bizclubRegister.getAddressDistrict());;
			user.setAddressName(bizclubRegister.getAddressName());
			user.setAddressNo(bizclubRegister.getAddressNo());
			user.setAddressPostCode(bizclubRegister.getAddressPostCode());
			user.setAddressProvince(bizclubRegister.getAddressProvince());
			user.setAddressSubDistrict(bizclubRegister.getAddressSubDistrict());
			user.setCardId(bizclubRegister.getCardId());
			user.setCorpId(bizclubRegister.getCorpId());
			user.setEmail(bizclubRegister.getEmail());
			user.setFirstName(bizclubRegister.getBrFirstName());
			user.setIsCorp(bizclubRegister.getIsCorp());
			user.setLastName(bizclubRegister.getBrLastName());
			user.setMobilePhone(bizclubRegister.getMobilePhone());
			user.setCorpGroupId(bizclubRegister.getCorpGroupId());
			user.setCorpGroupDesc(bizclubRegister.getCorpGroupDesc());
			user.setCorpName(bizclubRegister.getCorpName());
			user.setCorpDesc(bizclubRegister.getCorpDesc());
			user.setCorpConcerned(bizclubRegister.getCorpConcerned());
			user.setServices(bizclubRegister.getServices());
			user.setWebsite(bizclubRegister.getWebsite());
			user.setLineId(bizclubRegister.getLineId());
			bizClubService.saveUser(user);
			List recipients =new ArrayList();
			
			recipients.add(bizclubRegister.getEmail());
			MailRunnable mailRunnable = new MailRunnable("smtp","smtp.gmail.com","chatchai@lansingbs.com","chatchai2012","1",
					recipients,"ยินดีต้อนรับสู่สมาชิก BizClub Online",
					"Welcome to BizClub <br/> UserName / Password <br/> "+username+" / "+password+""
					+ "<br/> go to www.dbdbizclub.com ",
					"99","BizClub","587",null,null,null,"1");	
		
			Thread mailThread = new Thread(mailRunnable);
			mailThread.start(); 
			//bizclubRegister.setApproveStatus("1");
		}
		bizclubRegister.setApproveStatus(approveForm.getApproveStatus());
		bizClubService.updateBizclubRegister(bizclubRegister);
        model.addAttribute("bizclubRegisters", bizClubService.searchBizclubRegister(bizclubRegister)); 
        model.addAttribute("approveForm", approveForm);
        return "bizclub/approveList";
    }
}
