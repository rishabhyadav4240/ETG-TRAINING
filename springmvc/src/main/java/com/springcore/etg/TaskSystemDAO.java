package com.springcore.etg;

import java.sql.SQLException;
import java.util.List;

import com.springcore.etg.model.Task;

public interface TaskSystemDAO {
	public boolean addTask(Task task) throws SQLException;
	public Task getTask(int taskid);
	public int assignOwner(int taskid,int ownerid);
	public int addNotes(int taskid,String notes);
	public int setPriority(int taskid,String priority);
    public List<Task> getAllTask();
    public List<Task> getAllTask(int ownerid);
	
}
