package com.ecom.user.mgmt.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserMGMTController {
	@GetMapping
	public String testController() {
		return "hello user Service";
	}
}
