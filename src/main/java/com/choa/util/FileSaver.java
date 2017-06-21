package com.choa.util;

import java.io.File;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;

public class FileSaver {
	
	
	public String fileSave(String realPath, byte [] fileData, String oriName) throws Exception{
		File file = new File(realPath);
		
		if(!file.exists()){
			file.mkdirs();
		}
		
		//실제 upload 폴더에 저장되는 파일 이름
		String fileName = UUID.randomUUID().toString()+"_"+oriName;
		
		File target = new File(file, fileName);
		
		//파일 저장
		FileCopyUtils.copy(fileData, target);
		
		return fileName;
		
		
	}
	
}
