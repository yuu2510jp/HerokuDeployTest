package com.Ideng;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@RequestMapping("/helloa")
	public String hello(@RequestParam String msg,Model model) {
			model.addAttribute("msg",msg);
			return "hello";
	}
}
