package th.go.dbd.bizclub.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import th.go.dbd.bizclub.domain.BizclubAsset;
import th.go.dbd.bizclub.model.BizclubAssetM;
import th.go.dbd.bizclub.model.UserM;
import th.go.dbd.bizclub.service.BizClubService;
@Controller
public class UploadController {
	@Autowired
    private BizClubService bizClubService;
	private static ResourceBundle bundle;
	static{
		bundle =  ResourceBundle.getBundle( "config" );				
	}
	 @RequestMapping(value={"/getfile/{module}/{id}/{hotlink}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	    public void getFile(HttpServletRequest request,HttpServletResponse response,@PathVariable String module
	    		,@PathVariable String id,@PathVariable String hotlink)
	    {
	    	                                          
	    	String  content_type= "image/jpeg";
	    	//String  content_disposition= "";
	    	String  filename= "";
	    	String path= bundle.getString(module+"Path");
	    	String ndPathFileGen="";
	    	//path+"/"+ndPathFileGen
	    	if(module.equals("profile")){
	    		UserM userM= bizClubService.findUserById(Integer.valueOf(id));
	    		ndPathFileGen=path+userM.getProfilePath();
	    		filename=userM.getProfileFileName();
			}else if(module.equals("logo")){
				UserM userM= bizClubService.findUserById(Integer.valueOf(id));
		    	ndPathFileGen=path+userM.getLogoPath();
		    	filename=userM.getLogoFileName();
			}else if(module.equals("product")){
				BizclubAssetM bizclubAsset= bizClubService.findBizclubAssetById(Integer.valueOf(id));
		    	ndPathFileGen=path+bizclubAsset.getBaPicturePath();
		    	filename=bizclubAsset.getBaPictureName();
			}
	    
	    	    if(content_type.length()>0)
					response.setHeader("Content-Type", content_type);
				if(filename!=null && filename.length()>0){
					String userAgent = request.getHeader("user-agent");
					boolean isInternetExplorer = (userAgent.indexOf("MSIE") > -1);
					// filename="ทดสอบ โอ๋.xls";
					//System.out.println(fileName);
					byte[] fileNameBytes=null;
					try {
						fileNameBytes = filename.getBytes((isInternetExplorer) ? ("windows-1250") : ("utf-8"));
					} catch (UnsupportedEncodingException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				    String dispositionFileName = "";
					 //for (byte b: fileNameBytes) dispositionFileName += (char)(b & 0xff);
				    for (byte b: fileNameBytes) dispositionFileName += (char)(b & 0xff);

					 String disposition = "attachment; filename=\"" + dispositionFileName + "\"";
				//	 response.setHeader("Content-disposition", disposition);
					//response.addHeader("Content-Disposition",content_disposition);
				}
				
				File file = new File(ndPathFileGen);
				System.out.println(filename);
                System.out.println(ndPathFileGen);
				boolean fileExists = file.exists();
				if(fileExists){
					InputStream in = null;
				    OutputStream out=null;
					try {
						out = response.getOutputStream();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
				      InputStream stream  = null;
				      try {   
				    		  stream = new FileInputStream(file);
						      in = new BufferedInputStream(stream);
				         while (true) {
				            int data = in.read();
				            if (data == -1) {
				               break;
				            }
				            out.write(data);
				         }
				      }catch (Exception e) {
				    	  e.printStackTrace();
						// TODO: handle exception
					 } finally {
				         if (in != null) {
				            try {
								in.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				         }
				         if (stream != null) {
				        	 try {
								stream.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					         } 
				         if (out != null) {
				            try { 
								  out.flush();
							      out.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				         }
					 }
				}
	    }
}
