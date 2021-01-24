package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Student;
import com.example.service.StudentService;
@Controller
public class StudentController {
	
	@Autowired
	StudentService service;
	@RequestMapping("/")
	public String demo(@ModelAttribute("hello") Student student){
		
	return "index";
}

	
	@RequestMapping(value="/sivaRanjani")
	public String result(ModelMap model,@ModelAttribute("hello") Student student,BindingResult bindingresult) {
		System.out.println(student);
		model.put("userName",student.getUsername());
		if(service.validation(student))
		return "thankyou";
		else
			return "sorry";
	}
	

}
