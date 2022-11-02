package com.bptn.models;

import javax.persistence.*;

@Entity
@Table(name = "\"UserID\"")
public class UserID {

	@Id
	@Column(name = "\"username\"")
	private String username;
	
	@Column(name = "\"name\"")
	private String name;
	
	@Column(name = "\"emailId\"")
	private String emailId;
	
	@Column(name = "\"phoneNumber\"")
	private String phoneNumber;
	
	@Column(name = "\"userPassword\"")
	private String userPassword;
	
	public UserID() {
		super();
	}
	public UserID(String username, String name, String emailId, String phoneNumber, String userPassword) {
		super();
		this.username = username;
		this.name = name;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.userPassword = userPassword;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmailId() {
		return this.emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getUserPassword() {
		return this.userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
}
