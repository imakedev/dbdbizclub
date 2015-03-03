package th.go.dbd.bizclub.form;

import java.io.Serializable;

import th.go.dbd.bizclub.model.UserM;

public class MemberForm extends CommonForm implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserM userM;
	 private String[] corpGroupIds;	
	public String[] getCorpGroupIds() {
		return corpGroupIds;
	}

	public void setCorpGroupIds(String[] corpGroupIds) {
		this.corpGroupIds = corpGroupIds;
	}

	public MemberForm() {
		super();
		userM=new UserM();
		// TODO Auto-generated constructor stub
	}
	
	public MemberForm(UserM userM) {
		super();
		this.userM = userM;
	}

	public UserM getUserM() {
		return userM;
	}
	
	public void setUserM(UserM userM) {
		this.userM = userM;
	}
}
