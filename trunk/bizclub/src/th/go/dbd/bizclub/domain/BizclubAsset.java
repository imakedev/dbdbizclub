package th.go.dbd.bizclub.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the BIZCLUB_ASSET database table.
 * 
 */
@Entity
@Table(name="BIZCLUB_ASSET")
@NamedQuery(name="BizclubAsset.findAll", query="SELECT b FROM BizclubAsset b")
public class BizclubAsset implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BA_ID")
	private Integer baId;

	@Column(name="BA_DETAIL")
	private String baDetail;

	@Column(name="BA_HOTLINK")
	private String baHotlink;

	@Column(name="BA_PICTURE_NAME")
	private String baPictureName;

	@Column(name="BA_PICTURE_PATH")
	private String baPicturePath;

	@Column(name="BA_PRICE")
	private BigDecimal baPrice;

	@Column(name="BA_TITLE")
	private String baTitle;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_DATE")
	private Timestamp createdDate;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_DATE")
	private Timestamp updatedDate;
	
	
	
	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;

	//bi-directional many-to-one association to BizclubPicture
	/*@OneToMany(mappedBy="bizclubAsset")
	private List<BizclubPicture> bizclubPictures;*/

	public BizclubAsset() {
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

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

/*	public List<BizclubPicture> getBizclubPictures() {
		return this.bizclubPictures;
	}

	public void setBizclubPictures(List<BizclubPicture> bizclubPictures) {
		this.bizclubPictures = bizclubPictures;
	}

	public BizclubPicture addBizclubPicture(BizclubPicture bizclubPicture) {
		getBizclubPictures().add(bizclubPicture);
		bizclubPicture.setBizclubAsset(this);

		return bizclubPicture;
	}

	public BizclubPicture removeBizclubPicture(BizclubPicture bizclubPicture) {
		getBizclubPictures().remove(bizclubPicture);
		bizclubPicture.setBizclubAsset(null);

		return bizclubPicture;
	}
*/
}