package com.choa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.choa.member.MemberDTO;
import com.choa.member.teacher.TeacherDTO;
import com.choa.member.teacher.TeacherServiceImpl;

@Controller
@RequestMapping("/member/**")
public class TeacherController {

	@Autowired
	private TeacherServiceImpl teacherserviceImpl;
	
	
	
	@RequestMapping(value="/teacherJoin", method=RequestMethod.POST)
	public String memberJoin(TeacherDTO teacherDTO, Model model, HttpSession session) throws Exception{
		System.out.println("teacher");
		int result = teacherserviceImpl.memberJoinService(teacherDTO, session);
		String message = "가입실패";
		if(result>0){
			message = "가입성공";
		}
		model.addAttribute("message", message);
		model.addAttribute("path", "../");
		return "Commons/result";
	}
	
	@RequestMapping(value="/teacherLogin", method=RequestMethod.POST)
	public ModelAndView memberLogin(MemberDTO memberDTO, HttpSession session) throws Exception{
		System.out.println("TEACHER LOGIN");
		memberDTO = teacherserviceImpl.memberLoginService(memberDTO);
		String message = "로그인 실패";
		if(memberDTO!=null){
			session.setAttribute("member", memberDTO);
			message = "로그인 성공";
		}
		String path = "../";
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("path", path);
		mv.addObject("message", message);
		mv.setViewName("Commons/result");
		
		return mv;
	}
	
}
