package com.choa.member.teacher;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.choa.member.MemberDAO;
import com.choa.member.MemberDTO;

@Repository
public class TeacherDAOImpl implements MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "TeacherMapper.";
	private final String NAMEPSPACE2 = "MemberMapper.";
	
	@Override
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		sqlSession.insert(NAMEPSPACE2+"joinMember", memberDTO);
		return sqlSession.insert(NAMESPACE+"joinTeacher", memberDTO);
		
	}
	@Override
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(NAMEPSPACE2+"loginMember", memberDTO);
	}
	
	//마이페이지
	@Override
	public MemberDTO memberPage(String id) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"memberPage", id);
	}
	
}
