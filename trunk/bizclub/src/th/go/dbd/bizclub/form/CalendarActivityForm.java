package th.go.dbd.bizclub.form;

import java.io.Serializable;
import java.sql.Timestamp;


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
	private int baId;
	private String createBy;
	private Timestamp createDate;
	private String baType;
	
	public String getBaType() {
		return baType;
	}
	public void setBaType(String baType) {
		this.baType = baType;
	}
	
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public int getBaId() {
		return baId;
	}
	public void setBaId(int baId) {
		this.baId = baId;
	}
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
