package com.choa.member.teacher;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choa.member.MemberDTO;
import com.choa.member.MemberService;
import com.choa.util.FileSaver;

@Service
public class TeacherServiceImpl implements MemberService {

	@Autowired
	private TeacherDAOImpl teacherDAOImpl;
	
	@Override
	public int memberJoinService(MemberDTO memberDTO, HttpSession session) throws Exception {
		//파일을 저장하기 위한 객체 생성
		FileSaver fs = new FileSaver();
		
		//멤버DTO 에 오리지널 네임과 파일시스템 네일음 저장한 후에 DAO로 전달
		memberDTO.setOriname(memberDTO.getF1().getOriginalFilename());
		memberDTO.setFilename(fs.fileSave(session.getServletContext().getRealPath("resouces/upload"), memberDTO.getF1()));
		
		//파일 네임의 경우 파일세이버객체의 파일세이브 메서드를 호출(리턴타입이 파일네임이므로 셋터 메서드에 매개변수로 활용)
		//경로명은 매개변수로 받아온 세션에서 꺼내쓴다.
		
		return teacherDAOImpl.memberJoin(memberDTO);
	}
	
	@Override
	public MemberDTO memberLoginService(MemberDTO memberDTO) throws Exception {
		
		return teacherDAOImpl.memberLogin(memberDTO);
	} 
	@Override
	public MemberDTO memberPageService(MemberDTO memberDTO) throws Exception {
		
		return teacherDAOImpl.memberPage(memberDTO.getId());
	}

}
