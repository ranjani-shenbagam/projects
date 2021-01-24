package com.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
	String username;
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [username=" + username + ", password=" + password + "]";
	}
	
	
}

