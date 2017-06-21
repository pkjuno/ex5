package com.choa.member.student;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.choa.ex5.MyAbstarctTestUnit;

public class StudentDAOImplTest extends MyAbstarctTestUnit{
	
	@Autowired
	private StudentDAOImpl studentDAOImpl;
	private StudentServiceImpl studentServiceImpl;
	private static StudentDTO studentDTO;
	
	@Test
	public void test() throws Exception {
		int result = studentDAOImpl.memberJoin(studentDTO);
		assertEquals(1, result);
	}
	
	@BeforeClass
	public static void makeStudnet(){
		studentDTO = new StudentDTO();
		
		studentDTO.setId("junojuno1");
		studentDTO.setPw("junojuno1");
		studentDTO.setName("qkrwnsgh1");
		studentDTO.setAge(26);
		studentDTO.setGrade("S");
		studentDTO.setFilename("FJFJFJF5J");
		studentDTO.setOriname("DFJKSDFJL5KSJDFL");
		studentDTO.setSid("junojuno1");
		studentDTO.setPhone("10101011");
		studentDTO.setTid("bomibomi1");
	}
}
