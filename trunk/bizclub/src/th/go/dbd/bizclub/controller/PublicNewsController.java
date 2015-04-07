package th.go.dbd.bizclub.controller;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.LocaleEditor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

import th.go.dbd.bizclub.domain.MyUserDetails;
import th.go.dbd.bizclub.form.ApproveForm;
import th.go.dbd.bizclub.form.ItemForm;
import th.go.dbd.bizclub.form.ProductForm;
import th.go.dbd.bizclub.model.BizclubAssetM;
import th.go.dbd.bizclub.model.BizclubRegisterM;
import th.go.dbd.bizclub.model.UserM;
import th.go.dbd.bizclub.service.BizClubService;



@Controller 
@RequestMapping(value={"/news"})
@SessionAttributes(value={"publicForm"})
public class PublicNewsController {
	
	@Autowired
	@Qualifier("bizClubServiceImpl")
	private BizClubService bizClubService;
	@RequestMapping(value={"", "/"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	public String listAllNews(HttpServletRequest request,HttpServletResponse response,Model model, @RequestParam(required=false) String message) {
    	System.out.println("publicNews12........");
		return "bizclub/News";
	}
	
//	
//	@Autowired
//    private BizClubService bizClubService;
//	private static ResourceBundle bundle;
//	static{
//		bundle =  ResourceBundle.getBundle( "config" );				
//	}
	
//	@RequestMapping(value={"", "/"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
//    public String list(Model model,SecurityContextHolderAwareRequestWrapper srequest) {
//		
//		System.out.println("default public new .....");
//		return "bizclub/public_news";
//		
		
		/*Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		if(authentication.isAuthenticated() && authentication.getPrincipal()!=null && !authentication.getPrincipal().equals("anonymousUser")){
			MyUserDetails user=(MyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			model.addAttribute("userObj", bizClubService.findUserById(user.getMyUser().getUserid()));
		}
		BizclubAssetM bizclubAssetM =new BizclubAssetM();
		bizclubAssetM.setBaStatus("1");
		System.out.println(authentication.getPrincipal());
		if(authentication.isAuthenticated() && authentication.getPrincipal()!=null && !authentication.getPrincipal().equals("anonymousUser")){
			MyUserDetails user=(MyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			System.out.println(user.getUsername()); 
			UserM u=new UserM();
			u.setUserId(user.getMyUser().getUserid());
			bizclubAssetM.setUser(u);
		}
		ProductForm productForm=new ProductForm();
		productForm.setProductType("1");
    	model.addAttribute("bizclubAssets", bizClubService.searchBizclubAsset(bizclubAssetM)); 
        model.addAttribute("productForm",productForm );
        model.addAttribute("productItemAddForm",new ItemForm());
    	return "redirect:/product/activity/1";*/
		
		
   // }
	

}
