package th.go.dbd.bizclub.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the USER database table.
 * 
 */
@Entity
@Table(name="USER")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private Integer userId;

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

	@Column(name="CARD_ID")
	private String cardId;

	@Column(name="CORP_ID")
	private String corpId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_DATE")
	private Timestamp createdDate;

	private String email;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="IS_CORP")
	private String isCorp;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="MOBILE_PHONE")
	private String mobilePhone;

	@Column(name="CORP_GROUP_ID")
	private String corpGroupId;
	
	@Column(name="CORP_GROUP_DESC")
	private String corpGroupDesc;
	
	private String password;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_DATE")
	private Timestamp updatedDate;
	
	@Temporal( TemporalType.DATE)
	@Column(name="DATE_OF_BIRTH")
	private Date dateOfBirth;
	
	@Column(name="USER_NAME")
	private String userName;
	
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

	/*//bi-directional many-to-one association to BizclubAsset
	@OneToMany(mappedBy="user")
	private List<BizclubAsset> bizclubAssets;
*/
	//bi-directional many-to-one association to BizclubRegister
	@ManyToOne
	@JoinColumn(name="BR_ID")
	private BizclubRegister bizclubRegister;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="ROLE_ID")
	private Role role;

	public User() {
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

	public Integer getUserId() {
		return this.userId;
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

	

	public BizclubRegister getBizclubRegister() {
		return this.bizclubRegister;
	}

	public void setBizclubRegister(BizclubRegister bizclubRegister) {
		this.bizclubRegister = bizclubRegister;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
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


}