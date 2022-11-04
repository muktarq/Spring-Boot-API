package com.projectqa.Codez;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HeyController {

	@RequestMapping("/proj")
	public String demo() {
		return "here we go";
		
	}
	
}
