package th.go.dbd.bizclub.form;

import java.io.Serializable;

import th.go.dbd.bizclub.model.UserM;

public class UserForm extends CommonForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserM userM;
	private String keyword;
	private String searchForm;
	private String searchType;
	private String searchUserType;
	private String searchProvinceCenter;
	public String getSearchUserType() {
		return searchUserType;
	}
	public void setSearchUserType(String searchUserType) {
		this.searchUserType = searchUserType;
	}
	public UserForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserForm(UserM userM) {
		super();
		this.userM = userM;
	}
	public UserM getUserM() {
		return userM;
	}
	public void setUserM(UserM userM) {
		this.userM = userM;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getSearchForm() {
		return searchForm;
	}
	public void setSearchForm(String searchForm) {
		this.searchForm = searchForm;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getSearchProvinceCenter() {
		return searchProvinceCenter;
	}
	public void setSearchProvinceCenter(String searchProvinceCenter) {
		this.searchProvinceCenter = searchProvinceCenter;
	}
	
}
