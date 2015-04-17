package th.go.dbd.bizclub.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the bizclub_center database table.
 * 
 */
@Entity
@Table(name="bizclub_center")
@NamedQuery(name="BizclubCenter.findAll", query="SELECT b FROM BizclubCenter b")
public class BizclubCenter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BC_ID")
	private int bcId;

	@Column(name="BC_CREATED_BY")
	private String bcCreatedBy;

	@Column(name="BC_CREATED_DATE")
	private Timestamp bcCreatedDate;

	@Column(name="BC_FACEBOOK")
	private String bcFacebook;

	@Column(name="BC_MEMBER_SIZE")
	private int bcMemberSize;

	@Column(name="BC_NAME")
	private String bcName;

	@Column(name="BC_ORDER")
	private int bcOrder;

	@Column(name="BC_PROVICE_NAME")
	private String bcProviceName;

	@Column(name="BC_UPDATED_BY")
	private String bcUpdatedBy;

	@Column(name="BC_UPDATED_DATE")
	private Timestamp bcUpdatedDate;

	@Column(name="BC_ZONE")
	private int bcZone;

	//bi-directional many-to-one association to BizclubPublicize
	@OneToMany(mappedBy="bizclubCenter")
	private Set<BizclubPublicize> bizclubPublicizes;

    public BizclubCenter() {
    }

	public int getBcId() {
		return this.bcId;
	}

	public void setBcId(int bcId) {
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

	public int getBcMemberSize() {
		return this.bcMemberSize;
	}

	public void setBcMemberSize(int bcMemberSize) {
		this.bcMemberSize = bcMemberSize;
	}

	public String getBcName() {
		return this.bcName;
	}

	public void setBcName(String bcName) {
		this.bcName = bcName;
	}

	public int getBcOrder() {
		return this.bcOrder;
	}

	public void setBcOrder(int bcOrder) {
		this.bcOrder = bcOrder;
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

	public int getBcZone() {
		return this.bcZone;
	}

	public void setBcZone(int bcZone) {
		this.bcZone = bcZone;
	}

	public Set<BizclubPublicize> getBizclubPublicizes() {
		return this.bizclubPublicizes;
	}

	public void setBizclubPublicizes(Set<BizclubPublicize> bizclubPublicizes) {
		this.bizclubPublicizes = bizclubPublicizes;
	}
	
}