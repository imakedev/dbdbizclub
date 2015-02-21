package th.go.dbd.bizclub.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class BizclubAssetM implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer baId;

	private String baDetail;

	private String baHotlink;

	private String baPictureName;
	private String baPicturePath;

	private BigDecimal baPrice;

	private String baTitle;

	private String createdBy;

	private Timestamp createdDate;

	private String updatedBy;

	private Timestamp updatedDate;

	private UserM user;

	//private List<BizclubPictureM> bizclubPictures;

	public BizclubAssetM() {
	}

	public Integer getBaId() {
		return this.baId;
	}

	public void setBaId(Integer baId) {
		this.baId = baId;
	}

	public String getBaDetail() {
		return this.baDetail;
	}

	public void setBaDetail(String baDetail) {
		this.baDetail = baDetail;
	}

	public String getBaHotlink() {
		return this.baHotlink;
	}

	public void setBaHotlink(String baHotlink) {
		this.baHotlink = baHotlink;
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

	public BigDecimal getBaPrice() {
		return this.baPrice;
	}

	public void setBaPrice(BigDecimal baPrice) {
		this.baPrice = baPrice;
	}

	public String getBaTitle() {
		return this.baTitle;
	}

	public void setBaTitle(String baTitle) {
		this.baTitle = baTitle;
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

	public UserM getUser() {
		return this.user;
	}

	public void setUser(UserM user) {
		this.user = user;
	}

	/*public List<BizclubPictureM> getBizclubPictures() {
		return this.bizclubPictures;
	}

	public void setBizclubPictures(List<BizclubPictureM> bizclubPictures) {
		this.bizclubPictures = bizclubPictures;
	}

	public BizclubPictureM addBizclubPicture(BizclubPictureM bizclubPicture) {
		getBizclubPictures().add(bizclubPicture);
		bizclubPicture.setBizclubAsset(this);

		return bizclubPicture;
	}

	public BizclubPictureM removeBizclubPicture(BizclubPictureM bizclubPicture) {
		getBizclubPictures().remove(bizclubPicture);
		bizclubPicture.setBizclubAsset(null);

		return bizclubPicture;
	}*/

}