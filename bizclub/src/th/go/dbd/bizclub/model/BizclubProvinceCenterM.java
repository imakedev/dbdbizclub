package th.go.dbd.bizclub.model;

import java.io.Serializable;


public class BizclubProvinceCenterM implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer provinceId;

	private String provinceCode;

	private String provinceName;

	public BizclubProvinceCenterM() {
	}

	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return this.provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

}