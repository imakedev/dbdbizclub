package th.go.dbd.bizclub.form;

import java.io.Serializable;

import th.go.dbd.bizclub.model.BizclubAssetM;

public class ProductForm extends CommonForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BizclubAssetM bizclubAssetM;
	private String keyword;
	private String productType;
	public ProductForm(BizclubAssetM bizclubAssetM) {
		super();
		this.bizclubAssetM = bizclubAssetM;
	}
	public ProductForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BizclubAssetM getBizclubAssetM() {
		return bizclubAssetM;
	}
	public void setBizclubAssetM(BizclubAssetM bizclubAssetM) {
		this.bizclubAssetM = bizclubAssetM;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
}
