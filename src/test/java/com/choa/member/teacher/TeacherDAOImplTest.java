package com.choa.member.teacher;

import static org.junit.Assert.*;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.choa.ex5.MyAbstarctTestUnit;

public class TeacherDAOImplTest  extends MyAbstarctTestUnit{
	
	@Autowired
	private TeacherDAOImpl teacherDAOImpl;
	private static TeacherDTO teacherDTO;
	
	@Test
	public void test() throws Exception {
		int result = teacherDAOImpl.memberJoin(teacherDTO);
	}
	
	
	@BeforeClass
	public static void makeTeacher(){
		teacherDTO = new TeacherDTO();
		
		teacherDTO.setId("ttttttttt");
		teacherDTO.setPw("fffffffff");
		teacherDTO.setName("ggggggggg");
		teacherDTO.setAge(12);
		teacherDTO.setFilename("nnmnmn");
		teacherDTO.setOriname("mmmmmm");
		teacherDTO.setSubject("history");
		teacherDTO.setTid("tttttttt");
		
		
	}

}
