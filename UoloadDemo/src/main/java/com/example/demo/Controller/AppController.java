package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Service.ImageUploadService;

@Controller
public class AppController {

	@Autowired
	ImageUploadService imageuploadservice;
	@GetMapping("/")
	public String fileupload()
	{
		return "fileupload";
	}
	
	@PostMapping("/upload")
	public String upload(@RequestParam MultipartFile file,Model model)
	{
		String message=imageuploadservice.uploadImage(file);
		model.addAttribute("message",message);
		return "fileupload";
		
	}
	
}
