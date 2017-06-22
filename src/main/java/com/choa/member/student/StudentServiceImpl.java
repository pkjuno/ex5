package com.choa.member.student;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choa.member.MemberDTO;
import com.choa.member.MemberService;
import com.choa.util.FileSaver;

@Service
public class StudentServiceImpl implements MemberService {

	@Autowired
	private StudentDAOImpl studentDAOImpl;
	
	@Override
	public int memberJoinService(MemberDTO memberDTO, HttpSession session) throws Exception {
		FileSaver fs = new FileSaver();
		//System.out.println(memberDTO.getF1().getOriginalFilename());
		
		//1. 파일을 저장하기 위한 oriname 과 filename을 지정해줘야 한다.
		memberDTO.setOriname(memberDTO.getF1().getOriginalFilename());
		memberDTO.setFilename(fs.fileSave(session.getServletContext().getRealPath("resources/upload"), memberDTO.getF1()));
		
		
		
		return studentDAOImpl.memberJoin(memberDTO);
		
	}
	
	@Override
	public MemberDTO memberLoginService(MemberDTO memberDTO) throws Exception {
		return studentDAOImpl.memberLogin(memberDTO);
	}
	
	//마이페이지
	@Override
	public MemberDTO memberPageService(MemberDTO memberDTO) throws Exception {
		return studentDAOImpl.memberPage(memberDTO.getId());
	}
}
