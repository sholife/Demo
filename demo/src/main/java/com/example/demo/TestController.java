package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Students;
import com.example.demo.service.StudentsService;

@RestController
public class TestController {
	
	@Autowired
	private StudentsService studentsService;
	
	@GetMapping("/test1")
	public String test1() {
		return "hello world!";
	}

	@GetMapping("/test2")
	public List<Students> test2() {
		List<Students> list = studentsService.findAll();
		return list;
	}
}
