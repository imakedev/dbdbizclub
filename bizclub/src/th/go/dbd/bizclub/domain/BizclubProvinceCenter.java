package th.go.dbd.bizclub.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the BIZCLUB_PROVINCE_CENTER database table.
 * 
 */
@Entity
@Table(name="BIZCLUB_PROVINCE_CENTER")
@NamedQuery(name="BizclubProvinceCenter.findAll", query="SELECT b FROM BizclubProvinceCenter b")
public class BizclubProvinceCenter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROVINCE_ID")
	private Integer provinceId;

	@Column(name="PROVINCE_CODE")
	private String provinceCode;

	@Column(name="PROVINCE_NAME")
	private String provinceName;

	public BizclubProvinceCenter() {
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