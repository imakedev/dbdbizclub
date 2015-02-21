package th.go.dbd.bizclub.form;

import java.io.Serializable;

import th.go.dbd.bizclub.model.BizclubAssetM;

public class ItemForm extends CommonForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BizclubAssetM bizclubAssetM;
	public ItemForm(BizclubAssetM bizclubAssetM) {
		super();
		this.bizclubAssetM = bizclubAssetM;
	}
	public ItemForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BizclubAssetM getBizclubAssetM() {
		return bizclubAssetM;
	}
	public void setBizclubAssetM(BizclubAssetM bizclubAssetM) {
		this.bizclubAssetM = bizclubAssetM;
	}
	

}
