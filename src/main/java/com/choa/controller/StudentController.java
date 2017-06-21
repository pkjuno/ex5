package com.choa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.choa.member.student.StudentDTO;
import com.choa.member.student.StudentServiceImpl;

@Controller
@RequestMapping("/member/**")//단독으로 쓰일 경우 굳이 value를 쓰지 않아도 된다.
public class StudentController {
	
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	
	
	
	@RequestMapping(value="member/memberJoin", method=RequestMethod.GET)
	public void memberJoin(){
		
	}
	
	
	
	@RequestMapping(value="/studentJoin", method=RequestMethod.POST)
	public String memberJoin(StudentDTO studentDTO, Model model) throws Exception {
		System.out.println("student");
		int result = studentServiceImpl.memberJoinService(studentDTO);
		String message = "가입실패";
		if(result>0){
			message = "가입성공";
		}
		model.addAttribute("message", message);
		model.addAttribute("path", "../");
		return "Commons/result";
	}
	
}
