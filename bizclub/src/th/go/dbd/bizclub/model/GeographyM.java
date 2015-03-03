package th.go.dbd.bizclub.model;

import java.io.Serializable;

public class GeographyM implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer geoId;

	private String geoName;

	public GeographyM() {
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