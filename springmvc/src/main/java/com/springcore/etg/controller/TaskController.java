package com.springcore.etg.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springcore.etg.TaskSystemDAO;
import com.springcore.etg.model.Task;

@Controller
@RequestMapping("/task")
public class TaskController {

@RequestMapping(method=RequestMethod.GET)
public String showForm(Model model) 
{
	Task task=new Task();
	model.addAttribute("taskModel", task);
	return "taskform";
}
@RequestMapping(method= RequestMethod.POST)
public String insertTask(@ModelAttribute("taskModel") Task task, BindingResult result)

{
	if(result.hasErrors()) {
		return "taskform";
	}else
		
		
	return "home";
}

}
