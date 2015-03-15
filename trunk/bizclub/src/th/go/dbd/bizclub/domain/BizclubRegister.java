package th.go.dbd.bizclub.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


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
	   
	@Temporal( TemporalType.DATE)
	@Column(name="DATE_OF_BIRTH")
	private Date dateOfBirth;

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
	
	@Column(name="CORP_CONCERNED_NAME")
	private String corpConcernedName;
	@Column(name="SERVICES")
	private String services;
	
	@Column(name="WEBSITE")
	private String website;
	
	@Column(name="LINE_ID")
	private String lineId;
	
	@Column(name="BR_TYPE")
	private Integer brType;
	
	@Column(name="LINE_NAME")
	private String lineName;

	@Column(name="BR_NICK_NAME")
	private String brNickName;
	
	@Column(name="CORP_TYPE")
	private String corpType;
	
	@Column(name="CORP_MOBILE")
	private String corpMobile;
	
	@Column(name="CORP_ADDRESS")
	private String cropAddress;
	
	@Column(name="BIZCLUB_GROUP")
	private String bizclubGroup;


	@Column(name="BIZCLUB_PROVINCE")
	private String bizclubProvince;
	
	@Column(name="BIZCLUB_TYPE")
	private String bizclubType;
	
	@Column(name="TITLE_TYPE")
	private String titleType;
	
	@Column(name="TITLE_NAME")
	private String titleName;
	
	@Column(name="POSITION")
	private String position;
	
	@Column(name="FACEBOOK")
	private String facebook;
	
	@Column(name="TAXES_ID")
	private String taxesId;
	
	@Column(name="TAXES_CORP_NAME")
	private String taxesCorpName;
	
	@Column(name="PERSON_CORP_NAME")
	private String personCorpName;
	
	@Column(name="LOGO_PATH")
	private String logoPath;
	@Column(name="PROFILE_PATH")
	private String profilePath;
	
	@Column(name="LOGO_FILE_NAME")
	private String logoFileName;
	@Column(name="PROFILE_FILE_NAME")
	private String profileFileName;	
	
	@Column(name="LEVEL")
	private String level;	
	@Transient
	private String addressDistrictShow;
	@Transient
	private String addressProvinceShow;
	@Transient
	private String addressSubDistrictShow;
	@Transient
	private String addressPostCodeShow;
	
	@Column(name="BT_CODE")
	private String btCode;
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

	@Column(name="BT_DESC")
	private String btDesc;

	
	public String getAddressPostCodeShow() {
		return addressPostCodeShow;
	}

	public void setAddressPostCodeShow(String addressPostCodeShow) {
		this.addressPostCodeShow = addressPostCodeShow;
	}

	@Transient
	private String bizclubProvinceShow;

	/*//bi-directional many-to-one association to User
	@OneToMany(mappedBy="bizclubRegister")
	private List<User> users;*/

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

	public BizclubRegister() {
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

	public String getCorpConcernedName() {
		return corpConcernedName;
	}

	public void setCorpConcernedName(String corpConcernedName) {
		this.corpConcernedName = corpConcernedName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}



}