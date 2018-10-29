package com.Ideng;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@EnableAutoConfiguration
public class LoginController {

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
}
