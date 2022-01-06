package com.springcore.etg.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springcore.etg.LoginInterface;
import com.springcore.etg.TaskSystemDAO;
import com.springcore.etg.Impl.TaskSystemDAOImpl;
import com.springcore.etg.model.Task;
import com.springcore.etg.model.User;
import com.springcore.etg.model.UserBean;

@RestController
public class TaskRESTController 
{
@Autowired	
TaskSystemDAO taskSystemDAOImpl;
@Autowired
LoginInterface userImpl;

@PostMapping("/restaddtask")
public ResponseEntity<Task> addTask(@RequestBody Task task) throws SQLException{
 taskSystemDAOImpl.addTask(task);
 return new ResponseEntity<Task>(task,HttpStatus.OK);
}
 @GetMapping("/restgettask/{taskid}")
public Task getTask(@PathVariable int taskid) throws SQLException{
return  taskSystemDAOImpl.getTask(taskid);
}

 @PutMapping("/updateownerid/{taskid}/{ownerid}")
public void updateOwnerid(@PathVariable int taskid,@PathVariable int ownerid) throws SQLException{
  taskSystemDAOImpl.assignOwner(taskid,ownerid);
}
 @PutMapping("/addnotes/{taskid}/{notes}")
public void addNotes(@PathVariable int taskid,@PathVariable String notes) throws SQLException{
  taskSystemDAOImpl.addNotes(taskid,notes);
}
 @PutMapping("/setpriority/{taskid}/{priority}")
public void setPriority(@PathVariable int taskid,@PathVariable String priority) throws SQLException{
  taskSystemDAOImpl.setPriority(taskid,priority);
}
	@GetMapping("/restgetAlltask/{status}")
	public List<Task> getAllTask() throws SQLException {

		return taskSystemDAOImpl.getAllTask();
	}
	@GetMapping("/restgetAlltask/id/{ownerid}")
	public List<Task> getAllTask(@PathVariable int ownerid)  throws SQLException{

		return (java.util.List<Task>)
				taskSystemDAOImpl.getAllTask(ownerid);
	}
	@PostMapping("/restadduser")
	public ResponseEntity<UserBean> addUser(@RequestBody UserBean user) throws SQLException{
		userImpl.addUser(user);
	 return new ResponseEntity<UserBean>(user,HttpStatus.OK);
	}




}
