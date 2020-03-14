package com.fsr.spring.security.web;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.Authentication;
import com.fsr.spring.security.repository.UserRepository;

@RestController
@RequestMapping({ "/user", "/admin" })
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public UserDetails getUsers(Principal principal) {

		UserDetails loginedUser = (UserDetails) ((Authentication) principal).getPrincipal();
		return loginedUser;
	}

}
