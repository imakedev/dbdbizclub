package th.go.dbd.bizclub.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import th.go.dbd.bizclub.form.RegisterForm;
import th.go.dbd.bizclub.service.BizClubService;

@Controller 
@RequestMapping(value={"/register"})
@SessionAttributes(value={"registerForm"})
public class RegisterController {
	@Autowired
    private BizClubService bizClubService;
	@RequestMapping(value={"/"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String getNewForm(HttpServletRequest request,HttpServletResponse response,  Model model)
    {
		model.addAttribute("registerForm", new RegisterForm());
        return "bizclub/register";
    }
	@RequestMapping(value={"/action"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    public String action(HttpServletRequest request,HttpServletResponse response,  @ModelAttribute(value="registerForm") RegisterForm registerForm, BindingResult result, Model model)
    {
		bizClubService.saveBizclubRegister(registerForm.getBizclubRegisterM());
        return "bizclub/approve";
    }
	
}
