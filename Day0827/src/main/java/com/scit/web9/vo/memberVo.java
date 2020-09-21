package com.scit.web9.vo;


public class memberVo {
	
	private String member_id;
	private String member_pw;
	private String member_nm;
	private String member_birth;
	private String member_indate;
	public memberVo() {
		super();
	}
	public memberVo(String member_id, String member_pw, String member_nm, String member_birth, String member_indate) {
		super();
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_nm = member_nm;
		this.member_birth = member_birth;
		this.member_indate = member_indate;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	public String getMember_nm() {
		return member_nm;
	}
	public void setMember_nm(String member_nm) {
		this.member_nm = member_nm;
	}
	public String getMember_birth() {
		return member_birth;
	}
	public void setMember_birth(String member_birth) {
		this.member_birth = member_birth;
	}
	public String getMember_indate() {
		return member_indate;
	}
	public void setMember_indate(String member_indate) {
		this.member_indate = member_indate;
	}
	@Override
	public String toString() {
		return "memberVo [member_id=" + member_id + ", member_pw=" + member_pw + ", member_nm=" + member_nm
				+ ", member_birth=" + member_birth + ", member_indate=" + member_indate + "]";
	}
	
	

}
