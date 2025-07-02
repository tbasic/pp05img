package com.tech.prjm05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@RequestMapping("test")
	public String test() {
		return "test";
	}
	

}