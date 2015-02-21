package th.go.dbd.bizclub.model;

import java.io.Serializable;
import java.sql.Timestamp;
public class BizclubPictureM implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer bpId;

	private String bpHotlink;

	private String bpPictureName;

	private String bpPicturePath;

	private String createdBy;

	private Timestamp createdDate;

	private String updatedBy;

	private Timestamp updatedDate;

	private BizclubAssetM bizclubAsset;

	public BizclubPictureM() {
	}

	public Integer getBpId() {
		return this.bpId;
	}

	public void setBpId(Integer bpId) {
		this.bpId = bpId;
	}

	public String getBpHotlink() {
		return this.bpHotlink;
	}

	public void setBpHotlink(String bpHotlink) {
		this.bpHotlink = bpHotlink;
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

	public BizclubAssetM getBizclubAsset() {
		return this.bizclubAsset;
	}

	public void setBizclubAsset(BizclubAssetM bizclubAsset) {
		this.bizclubAsset = bizclubAsset;
	}

}