package com.guide.TourismGuid.controller;

import java.time.LocalDateTime;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Plage_detailController {
	
	
	@GetMapping("/")
	public String sayHello()
	{
		return "Hello at  "+ LocalDateTime.now();
	}

}
