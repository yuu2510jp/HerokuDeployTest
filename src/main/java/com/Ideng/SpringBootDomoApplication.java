package com.Ideng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@EnableAutoConfiguration
public class SpringBootDomoApplication {
	
    @RequestMapping("/")
    public String hello(@RequestParam(value="name", required=false, defaultValue="yuu") String name, Model model) {
        model.addAttribute("name", name);
	return "hello";
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDomoApplication.class, args);
	}
}
