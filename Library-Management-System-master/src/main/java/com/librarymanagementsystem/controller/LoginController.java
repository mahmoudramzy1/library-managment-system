package com.librarymanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.librarymanagementsystem.entity.Users;


@Controller
public class LoginController {

    @GetMapping("/Login")
	public String login() {
		return "login";
	}
}
