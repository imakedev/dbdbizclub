package th.go.dbd.bizclub.form;

import java.io.Serializable;

import th.go.dbd.bizclub.model.BizclubRegisterM;

public class RegisterForm extends CommonForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BizclubRegisterM bizclubRegisterM;
    private String[] corpGroupIds;	
	public RegisterForm() {
		super();
		bizclubRegisterM=new BizclubRegisterM();
		// TODO Auto-generated constructor stub
	}
	public RegisterForm(BizclubRegisterM bizclubRegisterM) {
		super();
		this.bizclubRegisterM = bizclubRegisterM;
	}
	public BizclubRegisterM getBizclubRegisterM() {
		return bizclubRegisterM;
	}
	public void setBizclubRegisterM(BizclubRegisterM bizclubRegisterM) {
		this.bizclubRegisterM = bizclubRegisterM;
	}
	public String[] getCorpGroupIds() {
		return corpGroupIds;
	}
	public void setCorpGroupIds(String[] corpGroupIds) {
		this.corpGroupIds = corpGroupIds;
	}
	
}
