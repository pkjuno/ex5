package com.choa.member.student;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.choa.ex5.MyAbstarctTestUnit;
import com.choa.member.MemberDTO;

public class StudentDAOImplTest extends MyAbstarctTestUnit{
	
	@Autowired
	private StudentDAOImpl studentDAOImpl;
	private StudentServiceImpl studentServiceImpl;
	private static StudentDTO studentDTO;
	
	@Test
	public void test() throws Exception {
		StudentDTO memberDTO = (StudentDTO)studentDAOImpl.test(studentDTO);
		System.out.println(memberDTO.getPhone());
		System.out.println(memberDTO.getName());
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
		studentDTO.setPhone("10101011");
		studentDTO.setTid("bomibomi1");
	}
}
