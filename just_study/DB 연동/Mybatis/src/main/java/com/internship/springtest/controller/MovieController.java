package com.internship.springtest.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.internship.springtest.service.MovieService;


@Controller
public class MovieController {

	@Resource(name = "ms")
	private MovieService ms;
	
	@RequestMapping("/index")
	public String getMovie(Model model) throws Exception {
		model.addAttribute("list", ms.getMovie());
		return "index";
	}
	
}
