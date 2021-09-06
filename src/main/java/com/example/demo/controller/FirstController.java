package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FirstController {
@GetMapping("hello")
public String sayhello()
{
return "hello spring";	

}
@GetMapping("")
public ModelAndView displayWelcome()
{
	ModelAndView mv=new ModelAndView("welcome.html");
	return mv;

}
}
