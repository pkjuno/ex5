package com.choa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.choa.member.MemberDTO;
import com.choa.member.student.StudentDTO;
import com.choa.member.student.StudentServiceImpl;

@Controller
@RequestMapping("/member/**")//단독으로 쓰일 경우 굳이 value를 쓰지 않아도 된다.
public class StudentController {
	
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	
	@RequestMapping(value="memberJoin", method=RequestMethod.GET)
	public void memberJoin(){
		
	}
	@RequestMapping(value="memberLogin", method=RequestMethod.GET)
	public void memberLogin(){
		
	}
	
	@RequestMapping(value="/studentJoin", method=RequestMethod.POST)
	public String memberJoin(StudentDTO studentDTO, Model model, HttpSession session) throws Exception {
		System.out.println("student");
		int result = studentServiceImpl.memberJoinService(studentDTO, session);
		String message = "가입실패";
		String path = "../";
		if(result>0){
			message = "가입성공";
		}
		model.addAttribute("message", message);
		model.addAttribute("path", path);
		return "Commons/result";
	}
	
	@RequestMapping(value="/studentLogin", method=RequestMethod.POST)
	public ModelAndView memberLogin(MemberDTO memberDTO, HttpSession session) throws Exception{
		System.out.println("student LOGIN");
		
		memberDTO = studentServiceImpl.memberLoginService(memberDTO);
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
	
	@RequestMapping(value="memberLogout")
	public String memberLogout(HttpSession session){
		session.invalidate();
		
		//경로 문제 방지를 위해 리다이렉트로 홈으로 보내준다.
		return "redirect:/";
	}
	@RequestMapping(value="memberPage", method=RequestMethod.GET)
	public void memberPage(HttpSession session, Model model) throws Exception{
		MemberDTO memberDTO = (MemberDTO) session.getAttribute("member");
		MemberDTO memberDTO2 = studentServiceImpl.memberPageService(memberDTO);
		
		model.addAttribute("student", memberDTO2);
		
	}
	
	
}
