package th.go.dbd.bizclub.model;

import java.io.Serializable;


public class BizclubCorpWM implements Serializable {
	private static final long serialVersionUID = 1L;

	private String corpId;

	private String corpBizType;

	private String corpName;

	private String corpServices;

	private String corpType;

	public BizclubCorpWM() {
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpBizType() {
		return this.corpBizType;
	}

	public void setCorpBizType(String corpBizType) {
		this.corpBizType = corpBizType;
	}

	public String getCorpName() {
		return this.corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getCorpServices() {
		return this.corpServices;
	}

	public void setCorpServices(String corpServices) {
		this.corpServices = corpServices;
	}

	public String getCorpType() {
		return this.corpType;
	}

	public void setCorpType(String corpType) {
		this.corpType = corpType;
	}

}