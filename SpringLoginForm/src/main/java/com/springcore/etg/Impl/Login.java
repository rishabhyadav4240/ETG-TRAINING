package com.springcore.etg.Impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcore.etg.LoginInterface;
@Component
public class Login implements LoginInterface {
@Autowired
	MySQLConnectionImpl mySQLConnectionImpl;
	@Override
	public boolean validateUser(String username, String password)
	{
		boolean st =false;
        try {

            //loading drivers for mysql
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating connection with the database
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("select password from user_details where username=?  ");
            
			
            ps.setString(1, username);
      
            ResultSet rs =(ResultSet) ps.executeQuery();
            st = rs.next();
            if( rs.getString("password").equals(password))
    			    {
    			    return true;
    			    }else
    			    {
    			    return false;
    			    }
    		
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;  
		
	}

}
