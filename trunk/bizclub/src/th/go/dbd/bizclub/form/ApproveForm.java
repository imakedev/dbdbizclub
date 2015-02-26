package th.go.dbd.bizclub.form;

import java.io.Serializable;

import th.go.dbd.bizclub.model.BizclubRegisterM;

public class ApproveForm extends CommonForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private BizclubRegisterM bizclubRegisterM;
    private String approveStatus;
    private String approveCondition;
    private Integer approveRole;
    private String roleModal;
    private Integer brId;
	public ApproveForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApproveForm(BizclubRegisterM bizclubRegisterM) {
		super();
		this.bizclubRegisterM = bizclubRegisterM;
	}
	public BizclubRegisterM getBizclubRegisterM() {
		return bizclubRegisterM;
	}
	public void setBizclubRegisterM(BizclubRegisterM bizclubRegisterM) {
		this.bizclubRegisterM = bizclubRegisterM;
	}
	public String getApproveStatus() {
		return approveStatus;
	}
	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}
	public String getRoleModal() {
		return roleModal;
	}
	public void setRoleModal(String roleModal) {
		this.roleModal = roleModal;
	}
	public Integer getBrId() {
		return brId;
	}
	public void setBrId(Integer brId) {
		this.brId = brId;
	}
	public String getApproveCondition() {
		return approveCondition;
	}
	public void setApproveCondition(String approveCondition) {
		this.approveCondition = approveCondition;
	}
	public Integer getApproveRole() {
		return approveRole;
	}
	public void setApproveRole(Integer approveRole) {
		this.approveRole = approveRole;
	}
}
