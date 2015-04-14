package th.go.dbd.bizclub.bean;

import java.io.Serializable;

public class NewsActivityBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String title;
	private String start;
	private String end;
	private String detail;
	private String imgPath;
	private String imgName;
	private String sTime;
	private String eTime;
	private int activityId;
	private int centerId;
	
	
	public int getCenterId() {
		return centerId;
	}
	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}
	public int getActivityId() {
		return activityId;
	}
	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}
	public String getsTime() {
		return sTime;
	}
	public void setsTime(String sTime) {
		this.sTime = sTime;
	}
	public String geteTime() {
		return eTime;
	}
	public void seteTime(String eTime) {
		this.eTime = eTime;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	
}