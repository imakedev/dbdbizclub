package th.go.dbd.bizclub.model;

import java.io.Serializable;

public class BizclubAssetAjaxResponse  implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer baId;

	private String baDetail;

	private String baHotlink;

	private String baPictureName;
	private String baPicturePath;

	//private BigDecimal baPrice;

	private String baTitle;

	private String createdBy;

	

	private String updatedBy;


	public Integer getBaId() {
		return baId;
	}

	public void setBaId(Integer baId) {
		this.baId = baId;
	}

	public String getBaDetail() {
		return baDetail;
	}

	public void setBaDetail(String baDetail) {
		this.baDetail = baDetail;
	}

	public String getBaHotlink() {
		return baHotlink;
	}

	public void setBaHotlink(String baHotlink) {
		this.baHotlink = baHotlink;
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

	/*public BigDecimal getBaPrice() {
		return baPrice;
	}

	public void setBaPrice(BigDecimal baPrice) {
		this.baPrice = baPrice;
	}
*/
	public String getBaTitle() {
		return baTitle;
	}

	public void setBaTitle(String baTitle) {
		this.baTitle = baTitle;
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

	
}
