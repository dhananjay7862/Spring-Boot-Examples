package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Model.Student;

@Controller
public class AppController {

	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("studentform",new Student());
		return "register";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute Student student,Model model)
	{
		System.out.println(student);
		model.addAttribute("student",student);
		return "data";
	}
}
