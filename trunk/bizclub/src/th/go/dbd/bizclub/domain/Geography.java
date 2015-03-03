package th.go.dbd.bizclub.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the geography database table.
 * 
 */
@Entity
@NamedQuery(name="Geography.findAll", query="SELECT g FROM Geography g")
public class Geography implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="GEO_ID")
	private Integer geoId;

	@Column(name="GEO_NAME")
	private String geoName;

	public Geography() {
	}

	public Integer getGeoId() {
		return this.geoId;
	}

	public void setGeoId(Integer geoId) {
		this.geoId = geoId;
	}

	public String getGeoName() {
		return this.geoName;
	}

	public void setGeoName(String geoName) {
		this.geoName = geoName;
	}

}