package th.go.dbd.bizclub.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the BIZCLUB_REGISTER database table.
 * 
 */
@Entity
@Table(name="BIZCLUB_REGISTER")
@NamedQuery(name="BizclubRegister.findAll", query="SELECT b FROM BizclubRegister b")
public class BizclubRegister implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BR_ID")
	private Integer brId;

	@Column(name="ADDRESS_DISTRICT")
	private String addressDistrict;

	@Column(name="ADDRESS_NAME")
	private String addressName;

	@Column(name="ADDRESS_NO")
	private String addressNo;

	@Column(name="ADDRESS_POST_CODE")
	private String addressPostCode;

	@Column(name="ADDRESS_PROVINCE")
	private String addressProvince;

	@Column(name="ADDRESS_SUB_DISTRICT")
	private String addressSubDistrict;

	@Column(name="APPROVE_BY")
	private String approveBy;

	@Column(name="APPROVE_DATE")
	private Timestamp approveDate;

	@Column(name="APPROVE_STATUS")
	private String approveStatus;

	@Column(name="BR_FIRST_NAME")
	private String brFirstName;

	@Column(name="BR_LAST_NAME")
	private String brLastName;

	@Column(name="BR_PASSWORD")
	private String brPassword;

	@Column(name="BR_USER_NAME")
	private String brUserName;

	@Column(name="CORP_GROUP_ID")
	private String corpGroupId;
	
	@Column(name="CORP_GROUP_DESC")
	private String corpGroupDesc;
	
	@Column(name="CARD_ID")
	private String cardId;

	@Column(name="CORP_ID")
	private String corpId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_DATE")
	private Timestamp createdDate;

	private String email;

	@Column(name="IS_CORP")
	private String isCorp;

	@Column(name="MOBILE_PHONE")
	private String mobilePhone;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_DATE")
	private Timestamp updatedDate;
	@Column(name="CORP_NAME")
	private String corpName;
	
	@Column(name="CORP_DESC")
	private String corpDesc;
	
	@Column(name="CORP_CONCERNED")
	private String corpConcerned;
	
	@Column(name="SERVICES")
	private String services;
	
	@Column(name="WEBSITE")
	private String website;
	
	@Column(name="LINE_ID")
	private String lineId;

	/*//bi-directional many-to-one association to User
	@OneToMany(mappedBy="bizclubRegister")
	private List<User> users;*/

	public BizclubRegister() {
	}

	public Integer getBrId() {
		return this.brId;
	}

	public void setBrId(Integer brId) {
		this.brId = brId;
	}

	public String getAddressDistrict() {
		return this.addressDistrict;
	}

	public void setAddressDistrict(String addressDistrict) {
		this.addressDistrict = addressDistrict;
	}

	public String getAddressName() {
		return this.addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getAddressNo() {
		return this.addressNo;
	}

	public void setAddressNo(String addressNo) {
		this.addressNo = addressNo;
	}

	public String getAddressPostCode() {
		return this.addressPostCode;
	}

	public void setAddressPostCode(String addressPostCode) {
		this.addressPostCode = addressPostCode;
	}

	public String getAddressProvince() {
		return this.addressProvince;
	}

	public void setAddressProvince(String addressProvince) {
		this.addressProvince = addressProvince;
	}

	public String getAddressSubDistrict() {
		return this.addressSubDistrict;
	}

	public void setAddressSubDistrict(String addressSubDistrict) {
		this.addressSubDistrict = addressSubDistrict;
	}

	public String getApproveBy() {
		return this.approveBy;
	}

	public void setApproveBy(String approveBy) {
		this.approveBy = approveBy;
	}

	public Timestamp getApproveDate() {
		return this.approveDate;
	}

	public void setApproveDate(Timestamp approveDate) {
		this.approveDate = approveDate;
	}

	public String getApproveStatus() {
		return this.approveStatus;
	}

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public String getBrFirstName() {
		return this.brFirstName;
	}

	public void setBrFirstName(String brFirstName) {
		this.brFirstName = brFirstName;
	}

	public String getBrLastName() {
		return this.brLastName;
	}

	public void setBrLastName(String brLastName) {
		this.brLastName = brLastName;
	}

	public String getBrPassword() {
		return this.brPassword;
	}

	public void setBrPassword(String brPassword) {
		this.brPassword = brPassword;
	}

	public String getBrUserName() {
		return this.brUserName;
	}

	public void setBrUserName(String brUserName) {
		this.brUserName = brUserName;
	}

	public String getCardId() {
		return this.cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIsCorp() {
		return this.isCorp;
	}

	public void setIsCorp(String isCorp) {
		this.isCorp = isCorp;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
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

	
	public String getCorpGroupId() {
		return corpGroupId;
	}

	public void setCorpGroupId(String corpGroupId) {
		this.corpGroupId = corpGroupId;
	}

	public String getCorpGroupDesc() {
		return corpGroupDesc;
	}

	public void setCorpGroupDesc(String corpGroupDesc) {
		this.corpGroupDesc = corpGroupDesc;
	}

	public String getCorpName() {
		return corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getCorpDesc() {
		return corpDesc;
	}

	public void setCorpDesc(String corpDesc) {
		this.corpDesc = corpDesc;
	}

	public String getCorpConcerned() {
		return corpConcerned;
	}

	public void setCorpConcerned(String corpConcerned) {
		this.corpConcerned = corpConcerned;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLineId() {
		return lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

}