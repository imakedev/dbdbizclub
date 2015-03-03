package th.go.dbd.bizclub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import th.go.dbd.bizclub.model.AmphurM;
import th.go.dbd.bizclub.model.BizclubCorpWM;
import th.go.dbd.bizclub.model.DistrictM;
import th.go.dbd.bizclub.model.ZipcodeM;
import th.go.dbd.bizclub.service.BizClubService;

@Controller 
@RequestMapping(value={"/ws"})
public class BizClubWsController {
	@Autowired
    private BizClubService bizClubService;
	@RequestMapping(value={"/corp/{corpId}/{corpType}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody BizclubCorpWM getBizclubCorpWById(@PathVariable String corpId,@PathVariable String corpType,Model model)
	    {
		 return bizClubService.findBizclubCorpWById(corpId,corpType) ;
	    }
	
	@RequestMapping(value={"/addr/amphur/{provinceId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<AmphurM> getDistrict(@PathVariable Integer provinceId,Model model)
	    {
		 return bizClubService.listAmphur(provinceId) ;
	    }
	@RequestMapping(value={"/addr/district/{districtId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<DistrictM> getSubDistrict(@PathVariable Integer districtId,Model model)
	    {
		 return bizClubService.listDistrict(districtId) ;
	    }
	@RequestMapping(value={"/addr/zipcode/{districtId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET},produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<ZipcodeM> getZipcode(@PathVariable String districtId,Model model)
	    {
		 return bizClubService.listZipcode(districtId) ;
	    }
		
}
