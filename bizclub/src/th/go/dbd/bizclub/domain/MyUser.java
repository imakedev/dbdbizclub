package th.go.dbd.bizclub.domain;

import java.io.Serializable;

public class MyUser implements Serializable{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	public MyUser(String fullName) {
		super();
		this.fullName = fullName;
	}

	private String fullName;
	private Integer userid;
	//private th.co.aoe.makedev.missconsult.xstream.MissContact missContact;



	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}
}
