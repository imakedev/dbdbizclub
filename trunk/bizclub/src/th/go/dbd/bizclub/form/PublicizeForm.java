package th.go.dbd.bizclub.form;

import java.io.Serializable;
import java.sql.Timestamp;

import th.go.dbd.bizclub.model.BizclubCenterM;

public class PublicizeForm implements Serializable{

	private static final long serialVersionUID = 8691546458902166714L;
	private int bpId;
	private int bcId;
	private int bcZone;
	private String bpDetail;
	private String bpPictureName;
	private String bpPicturePath;
	private String bpTitle;
	private String createdBy;
	private String updatedBy;
	private String isFixed;
	private String pageMode;
	public int getBpId() {
		return bpId;
	}
	public void setBpId(int bpId) {
		this.bpId = bpId;
	}
	public int getBcId() {
		return bcId;
	}
	public void setBcId(int bcId) {
		this.bcId = bcId;
	}
	public int getBcZone() {
		return bcZone;
	}
	public void setBcZone(int bcZone) {
		this.bcZone = bcZone;
	}
	public String getBpDetail() {
		return bpDetail;
	}
	public void setBpDetail(String bpDetail) {
		this.bpDetail = bpDetail;
	}
	public String getBpPictureName() {
		return bpPictureName;
	}
	public void setBpPictureName(String bpPictureName) {
		this.bpPictureName = bpPictureName;
	}
	public String getBpPicturePath() {
		return bpPicturePath;
	}
	public void setBpPicturePath(String bpPicturePath) {
		this.bpPicturePath = bpPicturePath;
	}
	public String getBpTitle() {
		return bpTitle;
	}
	public void setBpTitle(String bpTitle) {
		this.bpTitle = bpTitle;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getIsFixed() {
		return isFixed;
	}
	public void setIsFixed(String isFixed) {
		this.isFixed = isFixed;
	}
	public String getPageMode() {
		return pageMode;
	}
	public void setPageMode(String pageMode) {
		this.pageMode = pageMode;
	}
	
	
}
