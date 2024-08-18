package com.example.demo.Service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageUploadService {

	public String uploadImage(MultipartFile file)
	{
		try {
		String upoloadurl="src/main/resources/static/images";
		Path path=Paths.get(upoloadurl+File.separator+file.getOriginalFilename());
		Files.copy(file.getInputStream(), path);
		return "File Uploaded";
		}catch(Exception e)
		{
			e.printStackTrace();
			return "Unable To Upload";
		}
	}
}
