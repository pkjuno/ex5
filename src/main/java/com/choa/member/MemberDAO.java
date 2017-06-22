package com.choa.member;

public interface MemberDAO {
	
	//회원가입
	public int memberJoin(MemberDTO memberDTO) throws Exception;
	
	//로그인
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception;
	
	//마이페이지
	public MemberDTO memberPage(String id) throws Exception;
}
