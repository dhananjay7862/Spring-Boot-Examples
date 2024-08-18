package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Service.StudentService;

@Controller
public class AppController {

	@Autowired
	StudentService studentservice;
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@PostMapping("/upload")
	public String upload(@RequestParam int rollno,@RequestParam String name, @RequestParam String course, @RequestParam MultipartFile file,Model model)
	{
		String message=studentservice.registerStudent(rollno, name, course, file);
		model.addAttribute("message",message);
		return "index";
	}
	
	@GetMapping("/show")
	public String show(Model model)
	{
		model.addAttribute("data",studentservice.showAll());
		return "show";
	}
	
	
}
