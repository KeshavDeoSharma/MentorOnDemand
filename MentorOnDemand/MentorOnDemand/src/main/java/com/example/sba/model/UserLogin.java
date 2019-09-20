package com.example.sba.model;

public class UserLogin {

	private Long id;
	private String password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserLogin(Long id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserLogin [id=" + id + ", password=" + password + "]";
	}
	
}
