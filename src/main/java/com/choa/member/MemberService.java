package com.choa.member;

import javax.servlet.http.HttpSession;

public interface MemberService {
	
	//회원가입
	public int memberJoinService(MemberDTO memberDTO, HttpSession session) throws Exception;
	
	//로그인
	public MemberDTO memberLoginService(MemberDTO memberDTO) throws Exception;
	
	//마이페이지
	public MemberDTO memberPageService(MemberDTO memberDTO) throws Exception;
}
