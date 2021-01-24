package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.Student;

@Service
public class StudentService {
	public boolean validation(Student student) {
		if(student.getUsername().equals(student.getPassword())){
			return true;
		}else
		{
			return false;
		}
	}
}
