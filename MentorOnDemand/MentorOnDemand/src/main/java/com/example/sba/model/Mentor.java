
  package com.example.sba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
   @Table(name = "mentor")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
  public class Mentor {
  
  public void setRegCode(String regCode) {
		this.regCode = regCode;
	}

public Mentor() {
		super();
		// TODO Auto-generated constructor stub
	}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) 
  private int id;
  
 
  
  @Column(name="username")
  private String userName;
  
  @Column(name="linkedin_url") 
  private String linkedinUrl;
  
  @Column(name="password") 
  private String password;
  
  @Column(name="contact") 
  private Long contact;
  
  @Column(name="reg_date_time") 
  private String regDatetime ;
  
  @Column(name="reg_code") 
  private String regCode;

  
  
  
  public int getId() { return id; }
  
  public void setId(int id) { this.id = id; }
  
  
  public String getLinkedinUrl() { return linkedinUrl; }
  
  public void setLinkedinUrl(String linkedinUrl) { this.linkedinUrl =
  linkedinUrl; }
  
  public String getPassword() { return password; }
  
  public void setPassword(String password) { this.password = password; }
  
  public Long getContact() { return contact; }
  
  public void setContact(Long contact) { this.contact = contact; }
  
  public String getRegDatetime() { return regDatetime; }
  
  public void setRegDatetime(String regDatetime) { this.regDatetime =
  regDatetime; }
  
  public String getRegCode() { return regCode; }
  
 


public Mentor(int id, String userName, String linkedinUrl, String password, Long contact, String regDatetime,
		String regCode) {
	super();
	this.id = id;
	this.userName = userName;
	this.linkedinUrl = linkedinUrl;
	this.password = password;
	this.contact = contact;
	this.regDatetime = regDatetime;
	this.regCode = regCode;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

@Override
public String toString() {
	return "Mentor [id=" + id + ", userName=" + userName + ", linkedinUrl=" + linkedinUrl + ", password=" + password
			+ ", contact=" + contact + ", regDatetime=" + regDatetime + ", regCode=" + regCode + "]";
}
  
  }
 