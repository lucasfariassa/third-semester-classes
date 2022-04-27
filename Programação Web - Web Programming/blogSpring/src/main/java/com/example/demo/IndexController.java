package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IndexController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/status")
	public String status() {
		return "Everything is OK!";
	}
	
	@GetMapping(path = "/user", produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public ResponseEntity<User> getUser() {
		User user = userService.getUser();
		return ResponseEntity.ok(user);
	}
}
