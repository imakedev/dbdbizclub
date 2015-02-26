package th.go.dbd.bizclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import th.go.dbd.bizclub.model.BizclubCorpWM;
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
	
}
