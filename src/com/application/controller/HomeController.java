package com.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.application.model.Student;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String register() {
		return "register";
	}

	@RequestMapping(value = "/submitForm", method = RequestMethod.GET)
	public ModelAndView submitForm(@ModelAttribute("student") Student student) {
		ModelAndView model = new ModelAndView("welcomePage");
		model.addObject("helloMessage", "welcome to header message");
		return model;
	}

}
