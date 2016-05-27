package com.web.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class SpringController {
	
	@RequestMapping(value = "/")
	public String index() {

		return "/index";
	}
	
}
