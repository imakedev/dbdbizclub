package th.go.dbd.bizclub.model;

import java.io.Serializable;
import java.sql.Timestamp;

import th.go.dbd.bizclub.domain.BizclubCenter;


public class BizclubPublicizeM implements Serializable {
	private static final long serialVersionUID = 1L;

	private int bpId;
	private BizclubCenterM bizclubCenterM;
	private String bpDetail;
	private Timestamp bpEndTime;
	private String bpPictureName;
	private String bpPicturePath;
	private Timestamp bpStartTime;
	private String bpTitle;
	private String createdBy;
	private Timestamp createdDate;
	private String updatedBy;
	private Timestamp updatedDate;
	private String isFixed;

	public BizclubPublicizeM() {
	}

	public int getBpId() {
		return this.bpId;
	}

	public void setBpId(int bpId) {
		this.bpId = bpId;
	}


	public BizclubCenterM getBizclubCenterM() {
		return bizclubCenterM;
	}

	public void setBizclubCenterM(BizclubCenterM bizclubCenterM) {
		this.bizclubCenterM = bizclubCenterM;
	}

	public String getIsFixed() {
		return isFixed;
	}

	public void setIsFixed(String isFixed) {
		this.isFixed = isFixed;
	}

	public String getBpDetail() {
		return this.bpDetail;
	}

	public void setBpDetail(String bpDetail) {
		this.bpDetail = bpDetail;
	}

	public Timestamp getBpEndTime() {
		return this.bpEndTime;
	}

	public void setBpEndTime(Timestamp bpEndTime) {
		this.bpEndTime = bpEndTime;
	}

	public String getBpPictureName() {
		return this.bpPictureName;
	}

	public void setBpPictureName(String bpPictureName) {
		this.bpPictureName = bpPictureName;
	}

	public String getBpPicturePath() {
		return this.bpPicturePath;
	}

	public void setBpPicturePath(String bpPicturePath) {
		this.bpPicturePath = bpPicturePath;
	}

	public Timestamp getBpStartTime() {
		return this.bpStartTime;
	}

	public void setBpStartTime(Timestamp bpStartTime) {
		this.bpStartTime = bpStartTime;
	}

	public String getBpTitle() {
		return this.bpTitle;
	}

	public void setBpTitle(String bpTitle) {
		this.bpTitle = bpTitle;
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