package com.choa.member.student;

import com.choa.member.MemberDTO;

public class StudentDTO extends MemberDTO{
	private String sid;
	private String tid;
	private Stirng phone;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public Stirng getPhone() {
		return phone;
	}
	public void setPhone(Stirng phone) {
		this.phone = phone;
	}
}
