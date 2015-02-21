package th.go.dbd.bizclub.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
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
import th.go.dbd.bizclub.form.ItemForm;
import th.go.dbd.bizclub.form.ProductForm;
import th.go.dbd.bizclub.model.BizclubAssetAjaxResponse;
import th.go.dbd.bizclub.model.BizclubAssetM;
import th.go.dbd.bizclub.model.UserM;
import th.go.dbd.bizclub.service.BizClubService;

import com.google.gson.Gson;

@Controller 
@RequestMapping(value={"/product"})
@SessionAttributes(value={"productForm"})
public class ProductController {
	@Autowired
    private BizClubService bizClubService;
	@RequestMapping(value={"/"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String list(Model model,SecurityContextHolderAwareRequestWrapper srequest)
    {
		/*// Ok
		MyUserDetails user=(MyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		//SecurityContextHolder.getContext().getAuthentication().stAuthentication(user);
		MyUser myUser=user.getMyUser();
		myUser.setFullName("xx");
		user.setMyUser(myUser);
		// Not Ok
		//SecurityContextHolder.getContext().setAuthentication(SecurityContextHolder.getContext().getAuthentication());
		*/
		MyUserDetails user=(MyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		System.out.println(user.getUsername()); 
		
		BizclubAssetM bizclubAssetM =new BizclubAssetM();
		UserM u=new UserM();
		u.setUserId(user.getMyUser().getUserid());
		bizclubAssetM.setUser(u);
		//bizclubAssetM.setApproveStatus("0");
    	model.addAttribute("bizclubAssets", bizClubService.searchBizclubAsset(bizclubAssetM)); 
        model.addAttribute("productForm",new ProductForm() );
        model.addAttribute("itemForm",new ItemForm() );
        return "bizclub/itemList";
    }
	@RequestMapping(value={"/search"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    public String doSearch(HttpServletRequest request, @ModelAttribute(value="approveForm") ProductForm productForm, BindingResult result, Model model)
    {
		MyUserDetails user=(MyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		BizclubAssetM bizclubAssetM =new BizclubAssetM();
		UserM u=new UserM();
		u.setUserId(user.getMyUser().getUserid());
		bizclubAssetM.setUser(u);
		String keyword =productForm.getKeyword();
		bizclubAssetM.setBaTitle(keyword);
		model.addAttribute("bizclubAssets", bizClubService.searchBizclubAsset(bizclubAssetM)); 
        model.addAttribute("productForm", productForm);
        model.addAttribute("itemForm",new ItemForm() );
        return "bizclub/itemList";
    }

	//headers="Accept=application/json"
	@RequestMapping(value={"/item/{baId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody BizclubAssetM getProduct(@PathVariable Integer baId ,Model model)
	    {
		return bizClubService.findBizclubAssetById(baId) ;
		/*System.out.println("ajaxt call=>"+baId);
		BizclubAssetAjaxResponse response=new BizclubAssetAjaxResponse();
		BeanUtils.copyProperties(bizClubService.findBizclubAssetById(baId) , response);
		System.out.println("detail->"+response.getBaDetail());
		 return response;*/
	    }
	@RequestMapping(value={"/item2/{baId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	@ResponseBody 
	public BizclubAssetAjaxResponse getProduct2(@PathVariable Integer baId ,Model model)
	    {
		System.out.println("ajaxt call=>"+baId);
		BizclubAssetAjaxResponse response=new BizclubAssetAjaxResponse();
		BeanUtils.copyProperties(bizClubService.findBizclubAssetById(baId) , response);
		System.out.println("detail->"+response.getBaDetail());
		 return response;
	    }
	@RequestMapping(value={"/item3/{baId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	@ResponseBody 
	public String getProduct3(@PathVariable Integer baId ,Model model)
	    {
		System.out.println("ajaxt call=>"+baId);
		BizclubAssetAjaxResponse response=new BizclubAssetAjaxResponse();
		BeanUtils.copyProperties(bizClubService.findBizclubAssetById(baId) , response);
		System.out.println("detail->"+response.getBaDetail());
		Gson gson=new Gson();
		return gson.toJson(response);
	    }
	@RequestMapping(value={"/item4/{baId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	@ResponseBody 
	public BizclubAssetAjaxResponse getProduct4(HttpServletRequest request, @PathVariable Integer baId ,Model model)
	    {
		System.out.println("ajaxt call=>"+baId);
		BizclubAssetAjaxResponse response=new BizclubAssetAjaxResponse();
		BeanUtils.copyProperties(bizClubService.findBizclubAssetById(baId) , response);
		System.out.println("detail->"+response.getBaDetail());
		 return response;
	    }
	@RequestMapping(value={"/item5/{baId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	@ResponseBody 
	public BizclubAssetAjaxResponse getProduct5( @PathVariable Integer baId ,HttpServletRequest request,Model model)
	    {
		System.out.println("ajaxt call=>"+baId);
		BizclubAssetAjaxResponse response=new BizclubAssetAjaxResponse();
		BeanUtils.copyProperties(bizClubService.findBizclubAssetById(baId) , response);
		System.out.println("detail->"+response.getBaDetail());
		 return response;
	    }
	@RequestMapping(value={"/item6/{baId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	@ResponseBody 
	public BizclubAssetAjaxResponse getProduct6( @PathVariable Integer baId ,Model model,HttpServletRequest request)
	    {
		System.out.println("ajaxt call=>"+baId);
		BizclubAssetAjaxResponse response=new BizclubAssetAjaxResponse();
		BeanUtils.copyProperties(bizClubService.findBizclubAssetById(baId) , response);
		System.out.println("detail->"+response.getBaDetail());
		 return response;
	    }
	@RequestMapping(value={"/item7/{baId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	@ResponseBody 
	public BizclubAssetAjaxResponse getProduct7( HttpServletRequest request,@PathVariable Integer baId ,Model model)
	    {
		System.out.println("ajaxt call=>"+baId);
		BizclubAssetAjaxResponse response=new BizclubAssetAjaxResponse();
		BeanUtils.copyProperties(bizClubService.findBizclubAssetById(baId) , response);
		System.out.println("detail->"+response.getBaDetail());
		 return response;
	    }
	@RequestMapping(value={"/item8/{baId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	@ResponseBody 
	public BizclubAssetAjaxResponse getProduct8( HttpServletRequest request,Model model,@PathVariable Integer baId )
	    {
		System.out.println("ajaxt call=>"+baId);
		BizclubAssetAjaxResponse response=new BizclubAssetAjaxResponse();
		BeanUtils.copyProperties(bizClubService.findBizclubAssetById(baId) , response);
		System.out.println("detail->"+response.getBaDetail());
		 return response;
	    }
	 @RequestMapping(value={"/item/delete/{baId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	 public  @ResponseBody String  delete(@PathVariable Integer baId)
	    {
		 BizclubAssetM bizclubAssetM=new BizclubAssetM();
		 bizclubAssetM.setBaId(baId);
		 bizClubService.deleteBizclubAsset(bizclubAssetM);
		 System.out.println("deleted");
		return "deleted";
		 // return "redirect:/product/";
		 //return bizClubService.findBizclubAssetById(baId);
	    }
	 @RequestMapping(value={"/add"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
	    public String add(HttpServletRequest request,HttpServletResponse response,  @ModelAttribute(value="itemForm") ItemForm itemForm, BindingResult result, Model model)
	    {
		 MyUserDetails user=(MyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			BizclubAssetM bizclubAssetM =itemForm.getBizclubAssetM();
			UserM u=new UserM();
			u.setUserId(user.getMyUser().getUserid());
			bizclubAssetM.setUser(u);
			bizClubService.saveBizclubAsset(bizclubAssetM);
	        return "redirect:/product/";
	    }
	 @RequestMapping(value={"/update"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
	    public String update(HttpServletRequest request,HttpServletResponse response,  @ModelAttribute(value="itemForm") ItemForm itemForm, BindingResult result, Model model)
	    {
		 MyUserDetails user=(MyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			BizclubAssetM bizclubAssetM =itemForm.getBizclubAssetM();
			UserM u=new UserM();
			u.setUserId(user.getMyUser().getUserid());
			bizclubAssetM.setUser(u);
			bizClubService.updateBizclubAsset(bizclubAssetM);
			 return "redirect:/product/";
	    }
		
	 //model.addAttribute("itemForm",new ItemForm() );
}
