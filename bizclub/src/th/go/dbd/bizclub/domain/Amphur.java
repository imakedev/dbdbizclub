package th.go.dbd.bizclub.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the amphur database table.
 * 
 */
@Entity
@NamedQuery(name="Amphur.findAll", query="SELECT a FROM Amphur a")
public class Amphur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AMPHUR_ID")
	private Integer amphurId;

	@Column(name="AMPHUR_CODE")
	private String amphurCode;

	@Column(name="AMPHUR_NAME")
	private String amphurName;

	@Column(name="GEO_ID")
	private Integer geoId;

	@Column(name="PROVINCE_ID")
	private Integer provinceId;

	public Amphur() {
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