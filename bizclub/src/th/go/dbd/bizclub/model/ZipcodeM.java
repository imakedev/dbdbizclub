package th.go.dbd.bizclub.model;

import java.io.Serializable;


public class ZipcodeM implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer zipcodeId;

	private String amphurId;

	private String districtCode;

	private String districtId;

	private String provinceId;

	private String zipcode;

	public ZipcodeM() {
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