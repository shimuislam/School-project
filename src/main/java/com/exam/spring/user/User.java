package com.exam.spring.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity(name = "user")
public class User {
	@Id
	@GeneratedValue
    int id;
	String uname;
	String password;
	public User() {
		
	}
	
	public User(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}

	public User(int id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + "]";
	}
}
