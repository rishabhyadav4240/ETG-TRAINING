package com.springcore.etg.model;
import java.sql.Date;
public class UserBean 
{
	private int userId;
	private int ownerId;
	private int creatorId;
	private String name;
	private String email;
	private String description;
	private Date modifiedOn;
	private Date createdOn;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public int getCreatorId() {
		return creatorId;
	}
	public void setCreatorid(int creatorId) {
		this.creatorId = creatorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public java.sql.Date getModifiedOn() {
		return (java.sql.Date) modifiedOn;
	}
	public void setModifiedOn(Date date) {
		this.modifiedOn = date;
	}
	public java.sql.Date getCreatedOn() {
		return (java.sql.Date) createdOn;
	}
	public void setCreatedOn(Date date) {
		this.createdOn = date;
	}
	
	
}

