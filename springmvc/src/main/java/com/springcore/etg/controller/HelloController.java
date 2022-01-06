package com.springcore.etg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springcore.etg.LoginInterface;
import com.springcore.etg.MySQLConnection;
import com.springcore.etg.SpringmvcApplication;
import com.springcore.etg.Impl.MySQLConnectionImpl;
import com.springcore.etg.model.Task;

@Controller
public class HelloController{
@Autowired
MySQLConnectionImpl mySQLConnectionImpl;

	@RequestMapping("/")
public String validation(ModelMap map) {
		
		
		return "validation";
}
	@RequestMapping("/validation")
      public String validation2(Model model,@RequestParam("username") String username,@RequestParam("password") String password) {
		
      boolean r=mySQLConnectionImpl.validateUser(username,password);
		
		if(r==true) {
			
      System.out.println("valid");
      return "success";
		}else {
			model.addAttribute("name","invalid credentials");
			return "validation";
		}
		
	
		
}
}
