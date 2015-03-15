package th.go.dbd.bizclub.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the zipcode database table.
 * 
 */
@Entity
@Table(name="zipcode")
@NamedQuery(name="Zipcode.findAll", query="SELECT z FROM Zipcode z")
public class Zipcode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ZIPCODE_ID")
	private Integer zipcodeId;

	@Column(name="AMPHUR_ID")
	private String amphurId;

	@Column(name="DISTRICT_CODE")
	private String districtCode;

	@Column(name="DISTRICT_ID")
	private String districtId;

	@Column(name="PROVINCE_ID")
	private String provinceId;

	private String zipcode;

	public Zipcode() {
	}

	public Integer getZipcodeId() {
		return this.zipcodeId;
	}

	public void setZipcodeId(Integer zipcodeId) {
		this.zipcodeId = zipcodeId;
	}

	public String getAmphurId() {
		return this.amphurId;
	}

	public void setAmphurId(String amphurId) {
		this.amphurId = amphurId;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}