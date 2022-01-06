package com.springcore.etg.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcore.etg.LoginInterface;
import com.springcore.etg.MySQLConnection;
import com.springcore.etg.model.Task;
import com.springcore.etg.model.UserBean;
@Component
public class UserImpl implements LoginInterface {
	@Autowired
	MySQLConnection mySQLConnectionImpl;
	@Override
	public boolean addUser(UserBean user) throws SQLException {
		
			boolean flag = false;
			
			Connection con = mySQLConnectionImpl.getConnection();
			String sql = "insert into userbean (userid,ownerid,creatorid,name,email,description,createdon,modifiedon) values(?,?,?,?,?,?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
		    st.setInt(1, user.getUserId());
		    st.setInt(2, user.getOwnerId());
		    st.setInt(3, user.getCreatorId());
		    st.setString(4, user.getName());
		    st.setString(5, user.getEmail());
		    st.setString(6, user.getDescription());		    
		    st.setDate(7, user.getCreatedOn());
		    st.setDate(8, user.getModifiedOn());
		
			
			int r = st.executeUpdate();
			con.close();
			return true;
		}
		
	

	@Override
	public boolean validateUser(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}
}


