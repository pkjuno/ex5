package com.choa.ex5;





import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.choa.util.FileSaver;

@Controller
public class FileUploadController {
	
	@RequestMapping("/test/fileUpForm")
	public void fileUp(){}
	
	//첫번쨰 방법
	//@RequestMapping(value="/test/fileUp1", method=RequestMethod.POST)
	public void fileUpload1(String name, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception{
		System.out.println("NAME : "+ name);
		//파라미터 이름을 알고 있어야 파일을 꺼내서 확인 할 수 있다.
		MultipartFile multipartFile = multipartHttpServletRequest.getFile("f1");
		System.out.println("겟네임 "+multipartFile.getName());
		System.out.println("오리진 네임"+multipartFile.getOriginalFilename());
		System.out.println("사이즈 "+multipartFile.getSize());
		String path = multipartHttpServletRequest.getSession().getServletContext().getRealPath("resources/upload");
		FileSaver fileSaver = new FileSaver();
		fileSaver.fileSave(path, multipartFile.getBytes(), multipartFile.getOriginalFilename());
	}
	

	//2.
	//멀티파트 파일객체를 매개변수로 바로 매핑하면서 파라미터 이름과 동일하게 해준다.
	//@RequestMapping(value="/test/fileUp1", method=RequestMethod.POST)
	public void fileUpload2(String name, MultipartFile f1, HttpSession session) throws Exception{
		System.out.println("겟네임 "+f1.getName());
		System.out.println("오리진 네임"+f1.getOriginalFilename());
		System.out.println("사이즈 "+f1.getSize());
		String path = session.getServletContext().getRealPath("resources/upload");
		FileSaver fileSaver = new FileSaver();
		fileSaver.fileSave(path, f1.getBytes(), f1.getOriginalFilename());
	}
	
	
	//3  DTO를 이용한 방법
	@RequestMapping(value="/test/fileUp1", method=RequestMethod.POST)
	public void fileUpload3(FileDTO fileDTO, HttpSession session) throws Exception{
		FileSaver fileSaver = new FileSaver();
		//파일이 저장되는 실제 경로
		String realPath = session.getServletContext().getRealPath("resources/upload");
		String oriName = fileDTO.getF1().getOriginalFilename();
		byte [] fileData = fileDTO.getF1().getBytes();
		
		fileSaver.fileSave(realPath, fileData, oriName);
		
		
		
	}
	
	
	
	
	
}
