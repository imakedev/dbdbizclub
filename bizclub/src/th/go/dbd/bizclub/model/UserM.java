package th.go.dbd.bizclub.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class UserM implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer userId;

	private String addressDistrict;

	private String addressName;

	private String addressNo;

	private String addressPostCode;

	private String addressProvince;

	private String addressSubDistrict;

	private String cardId;

	private String corpId;

	private String createdBy;

	private Timestamp createdDate;

	private String email;

	private String firstName;

	private String isCorp;

	private String lastName;

	private String mobilePhone;

	private String password;

	private String updatedBy;

	private Timestamp updatedDate;

	private String userName;

	private List<BizclubAssetM> bizclubAssets;

	private BizclubRegisterM bizclubRegister;

	private RoleM role;

	private String corpGroupId;
	
	private String corpGroupDesc;
	
	private String corpName;
	private String corpDesc;
	private String corpConcerned;
	private String corpConcernedName;
	public String getCorpConcernedName() {
		return corpConcernedName;
	}

	public void setCorpConcernedName(String corpConcernedName) {
		this.corpConcernedName = corpConcernedName;
	}

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
	public String getDateOfBirthStr() {
		return dateOfBirthStr;
	}

	public void setDateOfBirthStr(String dateOfBirthStr) {
		this.dateOfBirthStr = dateOfBirthStr;
	}

	private String dateOfBirthStr;
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

	public UserM() {
	}

	public String getTitleType() {
		return titleType;
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

	public Integer getUserId() {
		return this.userId;
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

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getIsCorp() {
		return this.isCorp;
	}

	public void setIsCorp(String isCorp) {
		this.isCorp = isCorp;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<BizclubAssetM> getBizclubAssets() {
		return this.bizclubAssets;
	}

	public void setBizclubAssets(List<BizclubAssetM> bizclubAssets) {
		this.bizclubAssets = bizclubAssets;
	}

	public BizclubAssetM addBizclubAsset(BizclubAssetM bizclubAsset) {
		getBizclubAssets().add(bizclubAsset);
		bizclubAsset.setUser(this);

		return bizclubAsset;
	}

	public BizclubAssetM removeBizclubAsset(BizclubAssetM bizclubAsset) {
		getBizclubAssets().remove(bizclubAsset);
		bizclubAsset.setUser(null);

		return bizclubAsset;
	}

	public BizclubRegisterM getBizclubRegister() {
		return this.bizclubRegister;
	}

	public void setBizclubRegister(BizclubRegisterM bizclubRegister) {
		this.bizclubRegister = bizclubRegister;
	}

	public RoleM getRole() {
		return this.role;
	}

	public void setRole(RoleM role) {
		this.role = role;
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