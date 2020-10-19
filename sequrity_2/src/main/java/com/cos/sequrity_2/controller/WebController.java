package com.cos.sequrity_2.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class WebController {
	
	
	@GetMapping("/*")
	public String test_1() {
		return "aaa. 현재시간 : "+new Date();
	}

}
