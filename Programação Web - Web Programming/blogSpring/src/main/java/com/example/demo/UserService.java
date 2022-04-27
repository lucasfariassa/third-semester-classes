package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public User getUser() {
		User user = new User();
		user.setLogin("lucasfariassa");
		user.setPassword("123");
		user.setName("Lucas");
		return user;
	}

}
