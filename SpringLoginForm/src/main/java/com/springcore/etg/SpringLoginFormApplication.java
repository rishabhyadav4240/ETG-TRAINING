package com.springcore.etg;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLoginFormApplication {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx=SpringApplication.run(SpringLoginFormApplication.class, args);
		LoginInterface l=(LoginInterface) ctx.getBean("login");
	
		boolean flag = false;
		flag=l.validateUser("root", "rishabh");
		
		System.out.println(flag);
		
		if(flag==true) {
			System.out.println("Successufly logged in !");
			
		}
		else {
			System.out.println("incorrect credentials, please check username and password !");
			
		}
	    
		
		
	
	}

}
