package com.springSecurity.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyUser {

	@Id
	private int id;
	private String myusername;
	private String mypassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMyusername() {
		return myusername;
	}
	public void setMyusername(String myusername) {
		this.myusername = myusername;
	}
	public String getMypassword() {
		return mypassword;
	}
	public void setMypassword(String mypassword) {
		this.mypassword = mypassword;
	}
	
	
}
