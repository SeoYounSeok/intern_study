package com.internship.springtest2.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.internship.springtest2.service.MovieService;

@Controller
public class MovieController {
	
	@Resource(name = "ms")
	private MovieService ms;
	
	@RequestMapping("/")
	public String main(Model model) {
		
		model.addAttribute("list", ms.selectMovie());
		
		System.out.println("11111111111111111111111111111111111111111");
		System.out.println(ms.selectMovie());
		System.out.println("11111111111111111111111111111111111111111");
		return "index.html";
	}
}
