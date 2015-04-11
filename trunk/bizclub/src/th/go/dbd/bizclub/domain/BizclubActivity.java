package th.go.dbd.bizclub.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the BIZCLUB_ACTIVITY database table.
 * 
 */
@Entity
@Table(name="BIZCLUB_ACTIVITY")
@NamedQuery(name="BizclubActivity.findAll", query="SELECT b FROM BizclubActivity b")
public class BizclubActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BA_ID")
	private int baId;

	@Column(name="BA_DETAIL")
	private String baDetail;

	@Column(name="BA_END_TIME")
	private Timestamp baEndTime;

	@Column(name="BA_PICTURE_NAME")
	private String baPictureName;

	@Column(name="BA_PICTURE_PATH")
	private String baPicturePath;

	@Column(name="BA_START_TIME")
	private Timestamp baStartTime;

	@Column(name="BA_TITLE")
	private String baTitle;

	@Column(name="BC_ID")
	private int bcId;

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

	public BizclubActivity() {
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