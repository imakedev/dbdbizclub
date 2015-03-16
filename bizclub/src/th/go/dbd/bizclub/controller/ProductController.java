package th.go.dbd.bizclub.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

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
	private static ResourceBundle bundle;
	static{
		bundle =  ResourceBundle.getBundle( "config" );				
	}
	@RequestMapping(value={"/activity/{bcId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String activity(@PathVariable Integer bcId,Model model,SecurityContextHolderAwareRequestWrapper srequest)
    {
		return "bizclub/activity";
    }
	@RequestMapping(value={"/member/{bcId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String member(@PathVariable Integer bcId,Model model,SecurityContextHolderAwareRequestWrapper srequest)
    {
		return "bizclub/activityMember";
    }
	@RequestMapping(value={"/items/{userId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String items(@PathVariable Integer userId,Model model,SecurityContextHolderAwareRequestWrapper srequest)
    {
		return "bizclub/activityItem";
    }
	@RequestMapping(value={"", "/"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
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
		BizclubAssetM bizclubAssetM =new BizclubAssetM();
		bizclubAssetM.setBaStatus("1");
		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
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
		//bizclubAssetM.setApproveStatus("0");
    	model.addAttribute("bizclubAssets", bizClubService.searchBizclubAsset(bizclubAssetM)); 
        model.addAttribute("productForm",productForm );
        model.addAttribute("productItemAddForm",new ItemForm());
       // return "bizclub/itemList";
        return "bizclub/activity";
    }
	@RequestMapping(value={"/search"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    public String doSearch(HttpServletRequest request, @ModelAttribute(value="productForm") ProductForm productForm, BindingResult result, Model model)
    {
		BizclubAssetM bizclubAssetM =new BizclubAssetM();
		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		System.out.println(authentication.getPrincipal());
		System.out.println("getProductType->"+productForm.getProductType());
		if(authentication.isAuthenticated() && authentication.getPrincipal()!=null && !authentication.getPrincipal().equals("anonymousUser")){
			MyUserDetails user=(MyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			//System.out.println(user.getUsername()); 
			UserM u=new UserM();
			u.setUserId(user.getMyUser().getUserid());
			bizclubAssetM.setUser(u);
		}
		
		//MyUserDetails user=(MyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String keyword =productForm.getKeyword();
		bizclubAssetM.setBaTitle(keyword);
		bizclubAssetM.setBaStatus(productForm.getProductType());
		model.addAttribute("bizclubAssets", bizClubService.searchBizclubAsset(bizclubAssetM)); 
        model.addAttribute("productForm", productForm);
        model.addAttribute("productItemAddForm",new ItemForm() );
        
        return "bizclub/itemList";
    }
	
	@RequestMapping(value={"promote/{baId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String promote(@PathVariable Integer baId ,Model model)
    {
		BizclubAssetM bizclubAssetM=bizClubService.findBizclubAssetById(baId);
		bizclubAssetM.setBaStatus("1");
		bizClubService.updateBizclubAsset(bizclubAssetM);
		return "redirect:/product";
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
		 MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		   MultipartFile multipartFile = multipartRequest.getFile("productFile");
		   org.joda.time.DateTime    dt1  = new org.joda.time.DateTime (new Date().getTime()); 
			String  monthStr= dt1.getMonthOfYear()+"";
			monthStr = monthStr.length()>1?monthStr:"0"+monthStr;
			String  yearStr= dt1.getYear()+"";
			String  pathFolder=yearStr+"_"+monthStr+"";
			String baPictureName="";
			
			String baPicturePath="";
			;
		   if(multipartFile!=null){
               //String contentType = multipartFile_profile.getContentType();
               String orgName = multipartFile.getOriginalFilename();
               orgName = FilenameUtils.getName(orgName);
                FileOutputStream fos = null;
					try {  
						byte []filesize = multipartFile.getBytes(); 
						  System.out.println("file size->"+filesize.length);
						if(filesize.length>0){									
							long current = System.currentTimeMillis();
						  
						  String path = bundle.getString("productPath")+pathFolder;
						  createDirectoryIfNeeded(path);
						  baPictureName =orgName ;// multipart.getOriginalFilename();
						  String []filenameSplit  =baPictureName.split("\\.");
						  String extension ="";
						  if(filenameSplit!=null && filenameSplit.length>0){
							  extension =filenameSplit[filenameSplit.length-1];
						  }
						 String hotLink=current+""+genToken();
						 String ndPathFileGen =hotLink+"."+extension; 
						 pathFolder=pathFolder+"/"+ndPathFileGen;
						 baPicturePath=path+"/"+ndPathFileGen;
						 fos = new FileOutputStream(baPicturePath);
						 baPicturePath=pathFolder;
						 System.out.println("path->"+baPicturePath);
						 fos.write(filesize);
						}
					}catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					finally{
						if(fos!=null)
							try {
								fos.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}	 
					} 
		}

		 MyUserDetails user=(MyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			BizclubAssetM bizclubAssetM =itemForm.getBizclubAssetM();
			UserM u=new UserM();
			u.setUserId(user.getMyUser().getUserid());
			bizclubAssetM.setUser(u);
			bizclubAssetM.setBaPictureName(baPictureName);
			bizclubAssetM.setBaPicturePath(baPicturePath);
			bizClubService.saveBizclubAsset(bizclubAssetM);
	        return "redirect:/product/";
	    }
	 @RequestMapping(value={"/update"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
	    public String update(HttpServletRequest request,HttpServletResponse response,  @ModelAttribute(value="itemForm") ItemForm itemForm, BindingResult result, Model model)
	    {
		 MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		   MultipartFile multipartFile = multipartRequest.getFile("productFile");
		   org.joda.time.DateTime    dt1  = new org.joda.time.DateTime (new Date().getTime()); 
			String  monthStr= dt1.getMonthOfYear()+"";
			monthStr = monthStr.length()>1?monthStr:"0"+monthStr;
			String  yearStr= dt1.getYear()+"";
			String  pathFolder=yearStr+"_"+monthStr+"";
			String baPictureName="";
			
			String baPicturePath="";
			;
		   if(multipartFile!=null){
             //String contentType = multipartFile_profile.getContentType();
             String orgName = multipartFile.getOriginalFilename();
             orgName = FilenameUtils.getName(orgName);
              FileOutputStream fos = null;
					try {  
						byte []filesize = multipartFile.getBytes(); 
						  System.out.println("file size->"+filesize.length);
						if(filesize.length>0){									
							long current = System.currentTimeMillis();
						  
						  String path = bundle.getString("productPath")+pathFolder;
						  createDirectoryIfNeeded(path);
						  baPictureName =orgName ;// multipart.getOriginalFilename();
						  String []filenameSplit  =baPictureName.split("\\.");
						  String extension ="";
						  if(filenameSplit!=null && filenameSplit.length>0){
							  extension =filenameSplit[filenameSplit.length-1];
						  }
						 String hotLink=current+""+genToken();
						 String ndPathFileGen =hotLink+"."+extension; 
						 pathFolder=pathFolder+"/"+ndPathFileGen;
						 baPicturePath=path+"/"+ndPathFileGen;
						 fos = new FileOutputStream(baPicturePath);
						 baPicturePath=pathFolder;
						 System.out.println("path->"+baPicturePath);
						 fos.write(filesize);
						}
					}catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					finally{
						if(fos!=null)
							try {
								fos.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}	 
					} 
		}
		 MyUserDetails user=(MyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			BizclubAssetM bizclubAssetM =itemForm.getBizclubAssetM();
			UserM u=new UserM();
			u.setUserId(user.getMyUser().getUserid());
			bizclubAssetM.setUser(u);
			bizclubAssetM.setBaPictureName(baPictureName);
			bizclubAssetM.setBaPicturePath(baPicturePath);
			bizClubService.updateBizclubAsset(bizclubAssetM);
			 return "redirect:/product/";
	    }
	 @RequestMapping(value={"/delete/{baId}"},method = RequestMethod.GET)
	 public String deleteItem(@PathVariable Integer baId) {
		 System.out.println("delete->"+baId);
		 BizclubAssetM bizclubAssetM =new BizclubAssetM();
		 bizclubAssetM.setBaId(baId);
	     bizClubService.deleteBizclubAsset(bizclubAssetM);
	     return "redirect:/product/";
	 }	
	 private void createDirectoryIfNeeded(String directoryName)
  	 {
  	   File theDir = new File(directoryName);

  	   // if the directory does not exist, create it
  	   if (!theDir.exists())
  	   {
  		   //boolean cancreate = theDir.mkdir();
  		   theDir.mkdir();
  	   }
  	  
  	 }	
  private String genToken(){
  		StringBuffer sb = new StringBuffer();
  	    for (int i = 36; i > 0; i -= 12) {
  	      int n = Math.min(12, Math.abs(i));
  	      sb.append(org.apache.commons.lang3.StringUtils.leftPad(Long.toString(Math.round(Math.random() * Math.pow(36, n)), 36), n, '0'));
  	    }
  	    return sb.toString();
   }
	 //model.addAttribute("itemForm",new ItemForm() );
}
