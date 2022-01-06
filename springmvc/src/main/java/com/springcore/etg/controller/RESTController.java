package com.springcore.etg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springcore.etg.model.Task;


@RestController
public class RESTController{
	//@RequestMapping(value="/resthello",method=RequestMethod.GET,produces ="application/json")
	@GetMapping("/resthello")
	public String getHello() {
		return "hello my name is rishabh";
	}

	
	@GetMapping("/resttask")
	public Task getTasks() {
		Task task = new Task();
		task.setTaskId(1000);
		task.setName("create account");
		return task;
		
		}
	
	}
