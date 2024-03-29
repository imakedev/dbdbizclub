package th.go.dbd.bizclub.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class RoleTypeM implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer rtId;

	private String createdBy;

	private Timestamp createdDate;

	private String role;

	private String roleDesc;

	private String updatedBy;

	private Timestamp updatedDate;

	private List<RoleM> roles;

	public RoleTypeM() {
	}

	public Integer getRtId() {
		return this.rtId;
	}

	public void setRtId(Integer rtId) {
		this.rtId = rtId;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRoleDesc() {
		return this.roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public List<RoleM> getRoles() {
		return this.roles;
	}

	public void setRoles(List<RoleM> roles) {
		this.roles = roles;
	}

}