package th.go.dbd.bizclub.xstream.common;

import java.io.Serializable;
import java.util.Map;

import com.thoughtworks.xstream.annotations.XStreamAlias;
/**
 * @author Chatchai Pimtun (Admin)
 *
 */
@XStreamAlias("ImakeXML")
public class ImakeXML implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XStreamAlias("servicename")
	private String serviceName;
    
	private String firstPage;
	
	@XStreamAlias("fieldId")
	private String fieldId;
	
	private Integer updateRecord;
	
	public String getFieldId() {
		return fieldId;
	}
	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
	}
	@SuppressWarnings("rawtypes")
	@XStreamAlias("likeExpression")
	private Map likeExpression;
	
	@SuppressWarnings("rawtypes")
	@XStreamAlias("likeFirstExpression")
	private Map likeFirstExpression;
	
	@SuppressWarnings("rawtypes")
	@XStreamAlias("likeEndExpression")
	private Map likeEndExpression;
	
	@SuppressWarnings("rawtypes")
	@XStreamAlias("leExpression")
	private Map leExpression;
	
	@SuppressWarnings("rawtypes")
	@XStreamAlias("geExpression")
	private Map geExpression;
	@SuppressWarnings("rawtypes")
	@XStreamAlias("neExpression")
	private Map neExpression;
	
	@XStreamAlias("paging")
	private Paging paging;
	
/*	@XStreamAlias("vcriteria")
	private VCriteria vcriteria;*/
	
	public ImakeXML() {
		paging = new Paging();
		//vcriteria = new VCriteria();
		
	}
	/*public VCriteria getVcriteria() {
		return vcriteria;
	}
	public void setVcriteria(VCriteria vcriteria) {
		this.vcriteria = vcriteria;
	}*/
	public Paging getPaging() {
		return paging;
	}
	public void setPagging(Paging pagging) {
		this.paging = pagging;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	@SuppressWarnings("rawtypes")
	public Map getLikeExpression() {
		return likeExpression;
	}
	@SuppressWarnings("rawtypes")
	public void setLikeExpression(Map likeExpression) {
		this.likeExpression = likeExpression;
	}
	@SuppressWarnings("rawtypes")
	public Map getLeExpression() {
		return leExpression;
	}
	@SuppressWarnings("rawtypes")
	public void setLeExpression(Map leExpression) {
		this.leExpression = leExpression;
	}
	@SuppressWarnings("rawtypes")
	public Map getGeExpression() {
		return geExpression;
	}
	@SuppressWarnings("rawtypes")
	public void setGeExpression(Map geExpression) {
		this.geExpression = geExpression;
	}
	@SuppressWarnings("rawtypes")
	public Map getLikeFirstExpression() {
		return likeFirstExpression;
	}
	@SuppressWarnings("rawtypes")
	public void setLikeFirstExpression(Map likeFirstExpression) {
		this.likeFirstExpression = likeFirstExpression;
	}
	@SuppressWarnings("rawtypes")
	public Map getLikeEndExpression() {
		return likeEndExpression;
	}
	@SuppressWarnings("rawtypes")
	public void setLikeEndExpression(Map likeEndExpression) {
		this.likeEndExpression = likeEndExpression;
	}
	@SuppressWarnings("rawtypes")
	public Map getNeExpression() {
		return neExpression;
	}
	@SuppressWarnings("rawtypes")
	public void setNeExpression(Map neExpression) {
		this.neExpression = neExpression;
	}
	public Integer getUpdateRecord() {
		return updateRecord;
	}
	public void setUpdateRecord(Integer updateRecord) {
		this.updateRecord = updateRecord;
	}
	public void setPaging(Paging paging) {
		this.paging = paging;
	}
	public String getFirstPage() {
		return firstPage;
	}
	public void setFirstPage(String firstPage) {
		this.firstPage = firstPage;
	}

}
