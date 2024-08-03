package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Model.Usr;

@Controller
public class AppController {

	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("usrform",new Usr());
		return "Login";
	}
	
	@PostMapping("/logcheck")
	public String logcheck(@ModelAttribute Usr usr,Model model)
	{
		if(usr.getUsername().equals("dhananjay") && usr.getPassword().equals("secret"))
			return "Home";
		else
		{
			model.addAttribute("usrform",new Usr());
			model.addAttribute("message","Invalid User Name or Password");
			return "Login";
		}
	}
	
}
