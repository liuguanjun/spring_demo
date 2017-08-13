package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.DemoUser;
import com.example.demo.service.DemoService;

@RestController
public class DemoController {
	
	private final DemoService demoService;
	
	public DemoController(DemoService demoService) {
		this.demoService = demoService;
	}
	
	@RequestMapping("/")
	public List<DemoUser> findAllUser() {
		return demoService.findAllUser();
	}

}
