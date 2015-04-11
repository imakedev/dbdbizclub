package th.go.dbd.bizclub.form;

import java.io.Serializable;


public class CalendarActivityForm implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int bcId;
	private String baDetail;
	private String baEndTime;
	private String baPictureName;
	private String baPicturePath;
	private String baStartTime;
	private String baTitle;
	private String isFixed;

	public int getBcId() {
		return bcId;
	}
	public void setBcId(int bcId) {
		this.bcId = bcId;
	}
	public String getBaDetail() {
		return baDetail;
	}
	public void setBaDetail(String baDetail) {
		this.baDetail = baDetail;
	}
	public String getBaEndTime() {
		return baEndTime;
	}
	public void setBaEndTime(String baEndTime) {
		this.baEndTime = baEndTime;
	}
	public String getBaPictureName() {
		return baPictureName;
	}
	public void setBaPictureName(String baPictureName) {
		this.baPictureName = baPictureName;
	}
	public String getBaPicturePath() {
		return baPicturePath;
	}
	public void setBaPicturePath(String baPicturePath) {
		this.baPicturePath = baPicturePath;
	}
	public String getBaStartTime() {
		return baStartTime;
	}
	public void setBaStartTime(String baStartTime) {
		this.baStartTime = baStartTime;
	}
	public String getBaTitle() {
		return baTitle;
	}
	public void setBaTitle(String baTitle) {
		this.baTitle = baTitle;
	}
	public String getIsFixed() {
		return isFixed;
	}
	public void setIsFixed(String isFixed) {
		this.isFixed = isFixed;
	}
	
}
