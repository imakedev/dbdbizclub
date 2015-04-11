package th.go.dbd.bizclub.model;

import java.io.Serializable;
import java.sql.Timestamp;


public class BizclubActivityM implements Serializable {
	private static final long serialVersionUID = 1L;

	private int baId;
	private String baDetail;
	private Timestamp baEndTime;
	private String baPictureName;
	private String baPicturePath;
	private Timestamp baStartTime;
	private String baTitle;
	private int bcId;
	private String createdBy;
	private Timestamp createdDate;
	private String isFixed;
	private String updatedBy;
	private Timestamp updatedDate;

	public BizclubActivityM() {
	}

	public int getBaId() {
		return this.baId;
	}

	public void setBaId(int baId) {
		this.baId = baId;
	}

	public String getBaDetail() {
		return this.baDetail;
	}

	public void setBaDetail(String baDetail) {
		this.baDetail = baDetail;
	}

	public Timestamp getBaEndTime() {
		return this.baEndTime;
	}

	public void setBaEndTime(Timestamp baEndTime) {
		this.baEndTime = baEndTime;
	}

	public String getBaPictureName() {
		return this.baPictureName;
	}

	public void setBaPictureName(String baPictureName) {
		this.baPictureName = baPictureName;
	}

	public String getBaPicturePath() {
		return this.baPicturePath;
	}

	public void setBaPicturePath(String baPicturePath) {
		this.baPicturePath = baPicturePath;
	}

	public Timestamp getBaStartTime() {
		return this.baStartTime;
	}

	public void setBaStartTime(Timestamp baStartTime) {
		this.baStartTime = baStartTime;
	}

	public String getBaTitle() {
		return this.baTitle;
	}

	public void setBaTitle(String baTitle) {
		this.baTitle = baTitle;
	}

	public int getBcId() {
		return this.bcId;
	}

	public void setBcId(int bcId) {
		this.bcId = bcId;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getIsFixed() {
		return this.isFixed;
	}

	public void setIsFixed(String isFixed) {
		this.isFixed = isFixed;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

}