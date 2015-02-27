// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 5/27/2012 12:06:21 AM
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   WelcomeController.java

package th.go.dbd.bizclub.controller;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import th.go.dbd.bizclub.service.BizClubService;

@Controller 
//@SessionAttributes(value={"UserMissContact","welcomeForm"})
public class WelcomeController
{
	/*@Autowired
	private ApplicationContext ctx;*/
	private static int PAGE_SIZE=20;
	
	    @RequestMapping(value={"", "/"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	    public String getNewForm(HttpServletRequest request,HttpServletResponse response,  Model model)
	    {
	       // return "bizclub/bizclub7m";
	    	 return "bizclub/index";
	    }
	    @RequestMapping(value={"/bizclub7"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	    public String bizclub7(HttpServletRequest request,HttpServletResponse response,  Model model)
	    {
	        return "bizclub/bizclub7";
	    }
	    @RequestMapping(value={"/bizclub8"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	    public String bizclub8(HttpServletRequest request,HttpServletResponse response,  Model model)
	    {
	        return "bizclub/bizclub8";
	    }
	    @RequestMapping(value={"/bizclub2"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	    public String bizclub2(HttpServletRequest request,HttpServletResponse response,  Model model)
	    {	
	        return "bizclub/bizclub2";
	    }
	    @RequestMapping(value={"/page/{page}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	    public String dispatch(HttpServletRequest request,HttpServletResponse response,  Model model,@PathVariable("page")  String page)
	    {	
	        return "bizclub/"+page;
	    }
     
    

    @RequestMapping(value={"/checksession"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public @ResponseBody String checksession()
    { 
    	Authentication authen=SecurityContextHolder.getContext().getAuthentication();		
		String userid=null;
		if(authen!=null)
			userid=authen.getName();
		return userid;
    }
  
    private static SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
  
    @Autowired
    @Qualifier("bizClubServiceImpl")
    private BizClubService bizClubService;

}
