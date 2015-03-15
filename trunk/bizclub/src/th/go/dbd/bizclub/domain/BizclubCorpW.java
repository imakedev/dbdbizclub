package th.go.dbd.bizclub.domain;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the BIZCLUB_CORP_WS database table.
 * 
 */
@Entity
@Table(name="BIZCLUB_CORP_WS")
@NamedQuery(name="BizclubCorpW.findAll", query="SELECT b FROM BizclubCorpW b")
public class BizclubCorpW implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CORP_ID")
	private String corpId;

	@Column(name="CORP_BIZ_TYPE")
	private String corpBizType;

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

	@Column(name="CORP_NAME")
	private String corpName;

	@Column(name="CORP_SERVICES")
	private String corpServices;

	@Column(name="CORP_TYPE")
	private String corpType;
	@Column(name="BT_CODE")
	private String btCode;
	@Column(name="BT_DESC")
	private String btDesc;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	public BizclubCorpW() {
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

	public String getCorpType() {
		return this.corpType;
	}

	public void setCorpType(String corpType) {
		this.corpType = corpType;
	}

}