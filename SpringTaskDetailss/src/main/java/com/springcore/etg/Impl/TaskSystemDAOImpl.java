package com.springcore.etg.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcore.etg.MySQLConnection;
import com.springcore.etg.TaskSystemDAO;
import com.springcore.etg.model.Task;


@Component
public class TaskSystemDAOImpl implements TaskSystemDAO {
@Autowired
MySQLConnection mySQLConnectionImpl;
	@Override
	public boolean addTask(Task task) throws SQLException {
		boolean flag = false;
		//MySQLConnection con  =  new  MySQLConnectionImpl();
		Connection con = mySQLConnectionImpl.getConnection();
		String sql = "insert into Task (taskid,name, ownerid,description,status) values(?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, task.getTaskId());
		st.setString(2, task.getName());
		st.setInt(3, task.getOwnerId());
		st.setString(4, task.getDescription());
		st.setString(5,task.getStatus());
		
		int r = st.executeUpdate();
		return true;
	}

}
