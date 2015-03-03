package th.go.dbd.bizclub.model;

import java.io.Serializable;


public class AmphurM implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer amphurId;

	private String amphurCode;

	private String amphurName;

	private Integer geoId;

	private Integer provinceId;

	public AmphurM() {
	}

	public Integer getAmphurId() {
		return this.amphurId;
	}

	public void setAmphurId(Integer amphurId) {
		this.amphurId = amphurId;
	}

	public String getAmphurCode() {
		return this.amphurCode;
	}

	public void setAmphurCode(String amphurCode) {
		this.amphurCode = amphurCode;
	}

	public String getAmphurName() {
		return this.amphurName;
	}

	public void setAmphurName(String amphurName) {
		this.amphurName = amphurName;
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