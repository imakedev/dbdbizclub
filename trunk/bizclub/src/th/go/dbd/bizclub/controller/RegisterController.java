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
import th.go.dbd.bizclub.model.BizclubRegisterM;
import th.go.dbd.bizclub.service.BizClubService;

@Controller 
@RequestMapping(value={"/register"})
@SessionAttributes(value={"registerForm"})
public class RegisterController {
	
	@Autowired
    private BizClubService bizClubService;
	  //the approach described in this blog

	 
	
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
        return "bizclub/register";
    }
	@RequestMapping(value={"/action"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    public String action(HttpServletRequest request,HttpServletResponse response,  @ModelAttribute(value="registerForm") RegisterForm registerForm, BindingResult result, Model model)
    {
		//System.out.println(registerForm.getCorpGroupIds().length);
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
	
}
