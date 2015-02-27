package th.go.dbd.bizclub.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class BizclubRegisterM implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer brId;

	private String addressDistrict;

	private String addressName;

	private String addressNo;

	private String addressPostCode;

	private String addressProvince;

	private String addressSubDistrict;

	private String approveBy;

	private Timestamp approveDate;

	private String approveStatus;

	private String brFirstName;

	private String brLastName;

	private String brPassword;

	private String brUserName;

	private String cardId;

	private String corpId;

	private String createdBy;

	private Timestamp createdDate;

	private String email;
	private String isCorp;

	private String mobilePhone;

	private String updatedBy;

	private Timestamp updatedDate;

	private List<UserM> users;

	private String corpGroupId;
	
	private String corpGroupDesc;
	private String corpName;
	private String corpDesc;
	private String corpConcerned;
	private String corpConcernedName;
	private String services;
	private String website;
	private String lineId;
	
	private Integer brType;
	private String lineName;
	private String brNickName;
	private String corpType;
	private String corpMobile;
	private String cropAddress;
	private String bizclubGroup;
	private String titleType;
	private String titleName;	
	private String position;
	private String facebook;
	private String taxesId;
	private String taxesCorpName;
	private String personCorpName;
	private String dateOfBirthStr;
	private String logoPath;
	private String profilePath;
	private String logoFileName;
	private String profileFileName;	
	public String getLogoPath() {
		return logoPath;
	}

	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

	public String getProfilePath() {
		return profilePath;
	}

	public void setProfilePath(String profilePath) {
		this.profilePath = profilePath;
	}

	public String getLogoFileName() {
		return logoFileName;
	}

	public void setLogoFileName(String logoFileName) {
		this.logoFileName = logoFileName;
	}

	public String getProfileFileName() {
		return profileFileName;
	}

	public void setProfileFileName(String profileFileName) {
		this.profileFileName = profileFileName;
	}

	public String getDateOfBirthStr() {
		return dateOfBirthStr;
	}

	public void setDateOfBirthStr(String dateOfBirthStr) {
		this.dateOfBirthStr = dateOfBirthStr;
	}

	public String getTaxesId() {
		return taxesId;
	}

	public void setTaxesId(String taxesId) {
		this.taxesId = taxesId;
	}

	public String getTaxesCorpName() {
		return taxesCorpName;
	}

	public void setTaxesCorpName(String taxesCorpName) {
		this.taxesCorpName = taxesCorpName;
	}

	public String getPersonCorpName() {
		return personCorpName;
	}

	public void setPersonCorpName(String personCorpName) {
		this.personCorpName = personCorpName;
	}

	public String getTitleType() {
		return titleType;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getCorpConcernedName() {
		return corpConcernedName;
	}

	public void setCorpConcernedName(String corpConcernedName) {
		this.corpConcernedName = corpConcernedName;
	}

	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public BizclubRegisterM() {
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

	public Integer getBrType() {
		return brType;
	}

	public void setBrType(Integer brType) {
		this.brType = brType;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public String getBrNickName() {
		return brNickName;
	}

	public void setBrNickName(String brNickName) {
		this.brNickName = brNickName;
	}

	public String getCorpType() {
		return corpType;
	}

	public void setCorpType(String corpType) {
		this.corpType = corpType;
	}

	public String getCorpMobile() {
		return corpMobile;
	}

	public void setCorpMobile(String corpMobile) {
		this.corpMobile = corpMobile;
	}

	public String getCropAddress() {
		return cropAddress;
	}

	public void setCropAddress(String cropAddress) {
		this.cropAddress = cropAddress;
	}

	public String getBizclubGroup() {
		return bizclubGroup;
	}

	public void setBizclubGroup(String bizclubGroup) {
		this.bizclubGroup = bizclubGroup;
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

	public List<UserM> getUsers() {
		return this.users;
	}

	public void setUsers(List<UserM> users) {
		this.users = users;
	}

	public UserM addUser(UserM user) {
		getUsers().add(user);
		user.setBizclubRegister(this);

		return user;
	}

	public UserM removeUser(UserM user) {
		getUsers().remove(user);
		user.setBizclubRegister(null);

		return user;
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