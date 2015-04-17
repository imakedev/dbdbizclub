package th.go.dbd.bizclub.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the bizclub_publicize database table.
 * 
 */
@Entity
@Table(name="bizclub_publicize")
public class BizclubPublicize implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BP_ID")
	private int bpId;

	@Column(name="BP_DETAIL")
	private String bpDetail;

	@Column(name="BP_END_TIME")
	private Timestamp bpEndTime;

	@Column(name="BP_PICTURE_NAME")
	private String bpPictureName;

	@Column(name="BP_PICTURE_PATH")
	private String bpPicturePath;

	@Column(name="BP_START_TIME")
	private Timestamp bpStartTime;

	@Column(name="BP_TITLE")
	private String bpTitle;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_DATE")
	private Timestamp createdDate;

	@Column(name="IS_FIXED")
	private String isFixed;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_DATE")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to BizclubCenter
    @ManyToOne
	@JoinColumn(name="BC_ID")
	private BizclubCenter bizclubCenter;

    public BizclubPublicize() {
    }

	public int getBpId() {
		return this.bpId;
	}

	public void setBpId(int bpId) {
		this.bpId = bpId;
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

	public BizclubCenter getBizclubCenter() {
		return this.bizclubCenter;
	}

	public void setBizclubCenter(BizclubCenter bizclubCenter) {
		this.bizclubCenter = bizclubCenter;
	}
	
}