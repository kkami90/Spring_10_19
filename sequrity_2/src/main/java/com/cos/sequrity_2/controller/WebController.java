package com.cos.sequrity_2.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class WebController {
	
	
	@GetMapping({"","/"})
	@ResponseBody
	public String test_1() {
		return "aaa. 현재시간ㅋ : "+new Date();
	}
	
	


}
