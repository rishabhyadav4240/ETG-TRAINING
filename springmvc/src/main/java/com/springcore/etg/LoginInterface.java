package com.springcore.etg;

import java.sql.SQLException;

import com.springcore.etg.model.UserBean;

public interface LoginInterface 
{
	public boolean addUser(UserBean user) throws SQLException;
public boolean validateUser(String username,String password);
}
