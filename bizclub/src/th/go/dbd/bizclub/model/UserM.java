package th.go.dbd.bizclub.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class UserM implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer userId;

	private String keyworkd;
	private String searchType;
	private String searchForm;
	private String searchUserType;
	private String searchProvinceCenter;
	public String getSearchProvinceCenter() {
		return searchProvinceCenter;
	}

	public void setSearchProvinceCenter(String searchProvinceCenter) {
		this.searchProvinceCenter = searchProvinceCenter;
	}

	
	private String corpGroupIdShow;
	
	public String getCorpGroupIdShow() {
		return corpGroupIdShow;
	}

	public void setCorpGroupIdShow(String corpGroupIdShow) {
		this.corpGroupIdShow = corpGroupIdShow;
	}

	public String getSearchUserType() {
		return searchUserType;
	}

	public void setSearchUserType(String searchUserType) {
		this.searchUserType = searchUserType;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getSearchForm() {
		return searchForm;
	}

	public void setSearchForm(String searchForm) {
		this.searchForm = searchForm;
	}

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
	
	private String logoPath;
	private String profilePath;
	private String logoFileName;
	
	private String profileFileName;
	
	private String addressDistrictShow;
	private String addressProvinceShow;
	private String addressSubDistrictShow;
	private String bizclubProvinceShow;
	private String btCode;
	private String btDesc;
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

	public String getAddressPostCodeShow() {
		return addressPostCodeShow;
	}

	public void setAddressPostCodeShow(String addressPostCodeShow) {
		this.addressPostCodeShow = addressPostCodeShow;
	}

	private String addressPostCodeShow;
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
	private String bizclubProvince;
	private String bizclubType;
	private String titleType;
	private String titleName;		
	private String position;
	private String facebook;
	private String taxesId;
	private String taxesCorpName;
	private String personCorpName;
	private String level;
	
	public String getKeyworkd() {
		return keyworkd;
	}

	public void setKeyworkd(String keyworkd) {
		this.keyworkd = keyworkd;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

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

	public String getBizclubProvince() {
		return bizclubProvince;
	}

	public void setBizclubProvince(String bizclubProvince) {
		this.bizclubProvince = bizclubProvince;
	}

	public String getBizclubType() {
		return bizclubType;
	}

	public void setBizclubType(String bizclubType) {
		this.bizclubType = bizclubType;
	}

	public String getAddressDistrictShow() {
		return addressDistrictShow;
	}

	public void setAddressDistrictShow(String addressDistrictShow) {
		this.addressDistrictShow = addressDistrictShow;
	}

	public String getAddressProvinceShow() {
		return addressProvinceShow;
	}

	public void setAddressProvinceShow(String addressProvinceShow) {
		this.addressProvinceShow = addressProvinceShow;
	}

	public String getAddressSubDistrictShow() {
		return addressSubDistrictShow;
	}

	public void setAddressSubDistrictShow(String addressSubDistrictShow) {
		this.addressSubDistrictShow = addressSubDistrictShow;
	}

	public String getBizclubProvinceShow() {
		return bizclubProvinceShow;
	}

	public void setBizclubProvinceShow(String bizclubProvinceShow) {
		this.bizclubProvinceShow = bizclubProvinceShow;
	}

}