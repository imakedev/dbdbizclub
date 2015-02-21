package th.go.dbd.bizclub.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import th.go.dbd.bizclub.domain.MyUserDetails;
import th.go.dbd.bizclub.form.MemberForm;
import th.go.dbd.bizclub.service.BizClubService;

@Controller 
@RequestMapping(value={"/bizmem"})
@SessionAttributes(value={"memberForm"})
public class MemberController {
	@Autowired
    private BizClubService bizClubService;
	@RequestMapping(value={"/"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
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
		bizClubService.updateUser(memberForm.getUserM());
		model.addAttribute("memberForm", memberForm);
        return "bizclub/member";
    }
}
