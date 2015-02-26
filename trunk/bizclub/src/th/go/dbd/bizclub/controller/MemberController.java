package th.go.dbd.bizclub.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

import th.go.dbd.bizclub.domain.MyUserDetails;
import th.go.dbd.bizclub.form.MemberForm;
import th.go.dbd.bizclub.model.UserM;
import th.go.dbd.bizclub.service.BizClubService;

@Controller 
@RequestMapping(value={"/bizmem"})
@SessionAttributes(value={"memberForm"})
public class MemberController {
	@Autowired
    private BizClubService bizClubService;
	@RequestMapping(value={"", "/"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String initmemeber(Model model,SecurityContextHolderAwareRequestWrapper srequest)
    {
		MyUserDetails user=(MyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		MemberForm memberForm=new MemberForm();	
		memberForm.setUserM( bizClubService.findUserById(user.getMyUser().getUserid()));
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
		bizClubService.updateUser(memberForm.getUserM());
		model.addAttribute("memberForm", memberForm);
        return "bizclub/member";
    }
	@RequestMapping(value={"/item/{userId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody UserM getItem(@PathVariable Integer userId,Model model)
	    {
		 return bizClubService.findUserById(userId) ;
	    }
}
