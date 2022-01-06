package com.springcore.etg.model;

import java.sql.Date;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
@JacksonXmlRootElement
public class Task {
	private int taskId;
	private int ownerId;
	private int creatorId;
	private String name;
	private String description;
	private String status;
	private String priority;
	private String notes;
	private Boolean isBookmarked;
	private Date createdOn;
	private Date statusChangedOn;
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
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
	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Boolean getIsBookmarked() {
		return isBookmarked;
	}
	public void setIsBookmarked(Boolean isBookmarked) {
		this.isBookmarked = isBookmarked;
	}
	public java.sql.Date getCreatedOn() {
		return (java.sql.Date) createdOn;
	}
	public void setCreatedOn(Date date) {
		this.createdOn = date;
	}
	public java.sql.Date  getStatusChangedOn() {
		return (java.sql.Date) statusChangedOn;
	}
	public void setStatusChangedOn(Date date) {
		this.statusChangedOn = date;
	}
	
	
	
}
