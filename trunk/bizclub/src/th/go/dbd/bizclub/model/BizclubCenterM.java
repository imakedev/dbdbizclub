package th.go.dbd.bizclub.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class BizclubCenterM implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer bcId;

	private String bcCreatedBy;

	private Timestamp bcCreatedDate;

	private String bcFacebook;

	private Integer bcMemberSize;

	private String bcName;

	private String bcProviceName;

	private String bcUpdatedBy;

	private Timestamp bcUpdatedDate;
	private Integer bcOrder;

	public Integer getBcOrder() {
		return bcOrder;
	}

	public void setBcOrder(Integer bcOrder) {
		this.bcOrder = bcOrder;
	}

	public BizclubCenterM() {
	}

	public Integer getBcId() {
		return this.bcId;
	}

	public void setBcId(Integer bcId) {
		this.bcId = bcId;
	}

	public String getBcCreatedBy() {
		return this.bcCreatedBy;
	}

	public void setBcCreatedBy(String bcCreatedBy) {
		this.bcCreatedBy = bcCreatedBy;
	}

	public Timestamp getBcCreatedDate() {
		return this.bcCreatedDate;
	}

	public void setBcCreatedDate(Timestamp bcCreatedDate) {
		this.bcCreatedDate = bcCreatedDate;
	}

	public String getBcFacebook() {
		return this.bcFacebook;
	}

	public void setBcFacebook(String bcFacebook) {
		this.bcFacebook = bcFacebook;
	}

	public Integer getBcMemberSize() {
		return this.bcMemberSize;
	}

	public void setBcMemberSize(Integer bcMemberSize) {
		this.bcMemberSize = bcMemberSize;
	}

	public String getBcName() {
		return this.bcName;
	}

	public void setBcName(String bcName) {
		this.bcName = bcName;
	}

	public String getBcProviceName() {
		return this.bcProviceName;
	}

	public void setBcProviceName(String bcProviceName) {
		this.bcProviceName = bcProviceName;
	}

	public String getBcUpdatedBy() {
		return this.bcUpdatedBy;
	}

	public void setBcUpdatedBy(String bcUpdatedBy) {
		this.bcUpdatedBy = bcUpdatedBy;
	}

	public Timestamp getBcUpdatedDate() {
		return this.bcUpdatedDate;
	}

	public void setBcUpdatedDate(Timestamp bcUpdatedDate) {
		this.bcUpdatedDate = bcUpdatedDate;
	}

}