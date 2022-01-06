package com.springcore.etg;
import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springcore.etg.Impl.TaskSystemDAOImpl;
import com.springcore.etg.model.Task;

@SpringBootApplication
public class SpringTaskDetailssApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringTaskDetailssApplication.class, args);
		TaskSystemDAO task =(TaskSystemDAO)ctx.getBean("taskSystemDAOImpl");
		Task t= new Task();
		t.setName("Cyber Security");
		t.setOwnerId(5000);
		t.setDescription("Generate Module");
		t.setStatus("pending");
		
		try {
			 task.addTask(t);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
