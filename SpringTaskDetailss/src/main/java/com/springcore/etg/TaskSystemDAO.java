package com.springcore.etg;

import java.sql.SQLException;

import com.springcore.etg.model.Task;

public interface TaskSystemDAO {
	public boolean addTask(Task task) throws SQLException;
}
