package com.etg.servlet.services.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

import com.etg.servlet.services.MySQLConnection;

public class MySQLConnectionImpl implements MySQLConnection {

	@Override
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");

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
