package com.springcore.etg.Impl;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.springcore.etg.MySQLConnection;

import java.sql.DriverManager;
@Component
public class MySQLConnectionImpl implements MySQLConnection {

	@Override
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","root");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public boolean validateUser(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
