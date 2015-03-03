package th.go.dbd.bizclub.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the district database table.
 * 
 */
@Entity
@NamedQuery(name="District.findAll", query="SELECT d FROM District d")
public class District implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DISTRICT_ID")
	private Integer districtId;

	@Column(name="AMPHUR_ID")
	private Integer amphurId;

	@Column(name="DISTRICT_CODE")
	private String districtCode;

	@Column(name="DISTRICT_NAME")
	private String districtName;

	@Column(name="GEO_ID")
	private Integer geoId;

	@Column(name="PROVINCE_ID")
	private Integer provinceId;

	public District() {
	}

	public Integer getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public Integer getAmphurId() {
		return this.amphurId;
	}

	public void setAmphurId(Integer amphurId) {
		this.amphurId = amphurId;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public Integer getGeoId() {
		return this.geoId;
	}

	public void setGeoId(Integer geoId) {
		this.geoId = geoId;
	}

	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

}