package com.springSecurity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	@RequestMapping("/")
	public String validateUser() {
		return "User authenticated successfully";
	}
}
