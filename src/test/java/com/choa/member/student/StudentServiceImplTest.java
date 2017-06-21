package com.choa.member.student;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.choa.ex5.MyAbstarctTestUnit;
import com.choa.member.MemberDTO;

public class StudentServiceImplTest extends MyAbstarctTestUnit{

	@Autowired
	private StudentServiceImpl studentServiceImpl;
	private static StudentDTO studentDTO;
	
	@Test
	public void test() throws Exception{
		studentServiceImpl = new StudentServiceImpl();
		StudentDTO studentDTO = new StudentDTO();
		
	
		int result = studentServiceImpl.memberJoinService(studentDTO);
	
	
		assertEquals(1, result);
	}
	
	@BeforeClass
	public static void makeStudnet(){
		studentDTO = new StudentDTO();
		
		studentDTO.setId("jjjjjjjj1");
		studentDTO.setPw("jjjjjjjj1");
		studentDTO.setName("qkrwnsghjjjj1");
		studentDTO.setAge(26);
		studentDTO.setGrade("S");
		studentDTO.setFilename("78798789");
		studentDTO.setOriname("DFJKJDFL");
		studentDTO.setSid("jjjjjjjjjj1");
		studentDTO.setPhone("10101011");
		studentDTO.setTid("bomibomi1");
	}


}
