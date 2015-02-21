package th.go.dbd.bizclub.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

public class RoleM implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer roleId;

	private String createdBy;

	private Timestamp createdDate;

	private String roleName;

	private String updatedBy;

	private Timestamp updatedDate;

	private List<RoleTypeM> roleTypes;

	private List<UserM> users;

	public RoleM() {
	}

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
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

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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

	public List<RoleTypeM> getRoleTypes() {
		return this.roleTypes;
	}

	public void setRoleTypes(List<RoleTypeM> roleTypes) {
		this.roleTypes = roleTypes;
	}

	public List<UserM> getUsers() {
		return this.users;
	}

	public void setUsers(List<UserM> users) {
		this.users = users;
	}

	public UserM addUser(UserM user) {
		getUsers().add(user);
		user.setRole(this);

		return user;
	}

	public UserM removeUser(UserM user) {
		getUsers().remove(user);
		user.setRole(null);

		return user;
	}

}