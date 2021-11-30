package com.luv2code.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String showPage() {
		return "main-menu";
	}
}
