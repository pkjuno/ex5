package com.choa.ex5;

import org.springframework.web.multipart.MultipartFile;

public class FileDTO {
	
	
	private String name;
	private MultipartFile f1;//변수명은 파라미터이름과 동일하게 할것
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MultipartFile getF1() {
		return f1;
	}
	public void setF1(MultipartFile f1) {
		this.f1 = f1;
	}
	
	
}
