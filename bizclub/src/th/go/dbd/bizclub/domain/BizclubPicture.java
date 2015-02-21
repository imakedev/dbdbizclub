package th.go.dbd.bizclub.domain;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;


/**
 * The persistent class for the BIZCLUB_PICTURE database table.
 * 
 */
@Entity
@Table(name="BIZCLUB_PICTURE")
@NamedQuery(name="BizclubPicture.findAll", query="SELECT b FROM BizclubPicture b")
public class BizclubPicture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BP_ID")
	private Integer bpId;

	@Column(name="BP_HOTLINK")
	private String bpHotlink;

	@Column(name="BP_PICTURE_NAME")
	private String bpPictureName;

	@Column(name="BP_PICTURE_PATH")
	private String bpPicturePath;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_DATE")
	private Timestamp createdDate;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_DATE")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to BizclubAsset
	@ManyToOne
	@JoinColumn(name="BA_ID")
	private BizclubAsset bizclubAsset;

	public BizclubPicture() {
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

	public BizclubAsset getBizclubAsset() {
		return this.bizclubAsset;
	}

	public void setBizclubAsset(BizclubAsset bizclubAsset) {
		this.bizclubAsset = bizclubAsset;
	}

}