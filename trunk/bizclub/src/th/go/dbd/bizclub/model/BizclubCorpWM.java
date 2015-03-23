package th.go.dbd.bizclub.model;

import java.io.Serializable;

import javax.persistence.Column;


public class BizclubCorpWM implements Serializable {
	private static final long serialVersionUID = 1L;

	private String corpId;

	private String corpBizType;

	private String corpName;

	private String corpServices;

	private String corpType;
	private String btCode;
	private String firstName;
	private String lastName;
	private String[] committeeNames;
	private int corpCount;
	public String[] getCommitteeNames() {
		return committeeNames;
	}

	public void setCommitteeNames(String[] committeeNames) {
		this.committeeNames = committeeNames;
	}

	public String getBtCode() {
		return btCode;
	}

	public void setBtCode(String btCode) {
		this.btCode = btCode;
	}

	public String getBtDesc() {
		return btDesc;
	}

	public void setBtDesc(String btDesc) {
		this.btDesc = btDesc;
	}

	private String btDesc;

	public BizclubCorpWM() {
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpBizType() {
		return this.corpBizType;
	}

	public void setCorpBizType(String corpBizType) {
		this.corpBizType = corpBizType;
	}

	public String getCorpName() {
		return this.corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getCorpServices() {
		return this.corpServices;
	}

	public void setCorpServices(String corpServices) {
		this.corpServices = corpServices;
	}

	public String getCorpType() {
		return this.corpType;
	}

	public void setCorpType(String corpType) {
		this.corpType = corpType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getCorpCount() {
		return corpCount;
	}

	public void setCorpCount(int corpCount) {
		this.corpCount = corpCount;
	}

}