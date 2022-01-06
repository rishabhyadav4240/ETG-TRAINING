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
		Connection mySQLConnectionImpl = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			mySQLConnectionImpl = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
