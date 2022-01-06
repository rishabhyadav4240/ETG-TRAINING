package com.springcore.etg.Impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
		
		Connection con = mySQLConnectionImpl.getConnection();
		String sql = "insert into task (taskid,name,description,status,priority,notes,bookmark,ownerid,creatorid,createdon,statuschangedon) values(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, task.getTaskId());
		st.setString(2, task.getName());
		st.setInt(8, task.getOwnerId());
		st.setString(3, task.getDescription());
		st.setString(4,task.getStatus());
		st.setString(5, task.getPriority());
		st.setString(6, task.getNotes());
		st.setBoolean(7, task.getIsBookmarked());
		st.setInt(9,task.getCreatorId());
		st.setDate(10,task.getCreatedOn()) ;
		st.setDate(11,task.getStatusChangedOn());
	
		
		int r = st.executeUpdate();
		con.close();
		return true;
	}
	@Override
	public Task getTask(int taskid) {
		Connection con = mySQLConnectionImpl.getConnection();
		Task task=new Task();
		try {
		String sql = "select * from task where taskid=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, taskid);
		ResultSet rs=st.executeQuery();
		while(rs.next()) {
			task.setTaskId(rs.getInt("taskid"));
			task.setName(rs.getString("name"));
			task.setCreatedOn(rs.getDate("createdOn"));
		}
		con.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		return task;
	}
	@Override
	public int assignOwner(int taskid, int ownerid) {
		int rows=0;
		try {
		Connection con = mySQLConnectionImpl.getConnection();
		String sql = "update task set ownerid=? where taskid=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, ownerid);
		st.setInt(2, taskid);
		rows=st.executeUpdate();
		con.close();
		
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return rows;
	}
	@Override
	public int addNotes(int taskid, String notes) {
		int rows=0;
		try {
		Connection con = mySQLConnectionImpl.getConnection();
		String sql = "update task set notes=? where taskid=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, notes);
		st.setInt(2, taskid);
		rows=st.executeUpdate();
		con.close();
		
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return rows;
		
		
		
	}
	@Override
	public int setPriority(int taskid, String priority) {
		int rows=0;
		try {
		Connection con = mySQLConnectionImpl.getConnection();
		String sql = "update task set priority=? where taskid=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, priority);
		st.setInt(2, taskid);
		rows=st.executeUpdate();
		con.close();
		
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return rows;
		
	}
	@Override
	public List<Task> getAllTask() {
		Connection con = mySQLConnectionImpl.getConnection();
		List<Task> tasklist= new ArrayList<Task>();
		try {
			String sql = "select * from task";
			PreparedStatement st = con.prepareStatement(sql);
			

			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				Task  task= new Task();
				task.setTaskId(rs.getInt("taskid"));
				task.setName(rs.getString("name"));
				task.setPriority(rs.getString("priority"));
				task.setStatus(rs.getString("status"));
				tasklist.add(task);
				
			}
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return tasklist;
		
		
		
	}
	@Override
	public List<Task> getAllTask(int ownerid) {
		Connection con = mySQLConnectionImpl.getConnection();
		List<Task> tasklist= new ArrayList<Task>();
		try {
			String sql = "select * from task where ownerid=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, ownerid);
			

			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Task  task= new Task();
				task.setTaskId(rs.getInt("taskid"));
				task.setName(rs.getString("name"));
				task.setPriority(rs.getString("priority"));
				task.setStatus(rs.getString("status"));
				task.setCreatedOn(rs.getDate("createdon"));
				task.setStatusChangedOn(rs.getDate("statusChangedOn"));;
				tasklist.add(task);
				
			}
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return tasklist;
		
			
		
		
	}

}
