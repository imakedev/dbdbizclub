package th.go.dbd.bizclub.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;
/*import th.co.vlink.utils.Pagging;
import th.co.vlink.xstream.common.VResultMessage;
import th.co.vlink.xstream.common.VServiceXML;
*/
 
public class PostCommon {
	public static final int PAGE_SIZE = 5; 
	public th.co.imake.syndome.bpm.xstream.common.ImakeResultMessage  postMessage(th.co.imake.syndome.bpm.xstream.common.ImakeXML vserviceXML,String className,String endPoint,boolean isReturn) {
		   // HttpPost httppost = new HttpPost(ServiceConstant.hostReference+endPoint); 
		//HttpPost httppost = new HttpPost("http://localhost:3000/v1/"+endPoint);
			//HttpPost httppost = new HttpPost("http://164.115.32.155:8080/bizclubServices/rest/"+endPoint);
			HttpPost httppost = new HttpPost("http://58.137.89.106/bizclubServices/rest/"+endPoint);
			System.out.println("into bpm server");
			XStream xstream = new XStream(new Dom4JDriver());
			Class c  = null;
			try {
				  c = Class.forName(className);
			} catch (ClassNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			xstream.processAnnotations(c);
			//vserviceXML
			//NtcFaq ntcFaq = (NtcFaq)vserviceXML;
			int startIndex = 0;
			/*if(ntcFaq.getPagging()==null){
				th.or.ntc.utils.Pagging  p = new th.or.ntc.utils.Pagging();
				p.setPageNo(1);
				p.setPageSize(PAGE_SIZE);
				ntcFaq.setPagging(p);
			}
			startIndex = ntcFaq.getPagging().getPageNo()==1?0:(ntcFaq.getPagging().getPageNo()-1)*ntcFaq.getPagging().getPageSize();
			ntcFaq.getPagging().setStartIndex(startIndex);*/
			if(vserviceXML.getPaging()==null){
				th.co.imake.syndome.bpm.xstream.common.Paging  p = new th.co.imake.syndome.bpm.xstream.common.Paging();
				p.setPageNo(1);
				p.setPageSize(PAGE_SIZE);
				vserviceXML.setPaging(p);
			}
			startIndex = vserviceXML.getPaging().getPageNo()==1?0:(vserviceXML.getPaging().getPageNo()-1)*vserviceXML.getPaging().getPageSize();
			vserviceXML.getPaging().setStartIndex(startIndex);
			//String xString = xstream.toXML(ntcFaq); 
			String xString = xstream.toXML(vserviceXML);
			ByteArrayEntity entity = null;
			try {
				entity = new ByteArrayEntity(xString.getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			httppost.setEntity(entity); 
			HttpClient httpclient = new DefaultHttpClient(); 
			HttpResponse response = null;
			HttpEntity resEntity = null;
			try {
				response = httpclient.execute(httppost);
				resEntity = response.getEntity();
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			th.co.imake.syndome.bpm.xstream.common.ImakeResultMessage  vresultMessage = null; 
			InputStream in = null;
		if (isReturn) {
		 if (resEntity != null) {
		
				try {
					in = resEntity.getContent();
				/*	Class c2  = null;
					try {
						  c2 = Class.forName("org.hibernate.collection.PersistentSet");
					} catch (ClassNotFoundException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}*/
					xstream.processAnnotations(new Class[]{th.co.imake.syndome.bpm.xstream.common.ImakeResultMessage.class}); 
					//xstream.pr
					Object obj = xstream.fromXML(in);
					if(obj!=null){
						vresultMessage = (th.co.imake.syndome.bpm.xstream.common.ImakeResultMessage)obj; 
						 
						int maxRow = 0;
						if(vresultMessage.getMaxRow()!=null && !vresultMessage.getMaxRow().equals(""))
							maxRow = Integer.parseInt(vresultMessage.getMaxRow());
						//int pageSize = ntcFaq.getPagging().getPageSize();
						int pageSize = 0;
						if(vserviceXML.getPaging()!=null )
							pageSize = vserviceXML.getPaging().getPageSize();				
						int lastpage = (maxRow/pageSize)+((maxRow%pageSize)==0?0:1);
						vresultMessage.setLastpage(lastpage+"");
					}
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						if(in!=null)
						in.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
			httpclient.getConnectionManager().shutdown();
			return    vresultMessage ;
		}
	/*public ImakeResultMessage postMessage(ImakeXML vserviceXML,String className,String endPoint,boolean isReturn) {
		@SuppressWarnings("rawtypes")
		Class c  = null;
		try {
			  c = Class.forName(className);
		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		}
		@SuppressWarnings("rawtypes")
		Class[] classArray=new Class[]{c};
		//classArray[0]=c;
		return postMessage(vserviceXML,classArray,endPoint,isReturn);
	}*/
}
