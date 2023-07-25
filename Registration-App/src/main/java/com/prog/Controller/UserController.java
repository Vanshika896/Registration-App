package com.prog.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.prog.Entity.UserData;
import com.prog.Repository.UserRepo;

import jakarta.servlet.http.HttpSession;
@Controller
public class UserController {
 
	
	@Autowired
	private UserRepo repo;
		
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserData u,HttpSession session) {
		
		System.out.println(u);
		session.setAttribute("messaage", "User Register Successfully...");
		repo.save(u);
		return "redirect:/";
	}
}
