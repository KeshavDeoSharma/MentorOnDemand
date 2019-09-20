package com.example.sba.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
@Column(name="active")
private int active;
  
  
    public int getActive() {
	return active;
}
public void setActive(int i) {
	this.active = i;
}

	@Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;


    @Column(name="email")
    private String email;


    private String password;
    
    @Column(name = "contact_number")
    private Long contactNumber;

    @Column(name = "reg_date_time")
    private String regDatetime ;
    
 
    @Column(name = "reg_code")
    private String regCode;
    
    @Column(name="address")
    private String address;
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
    @Transient
    private String cpassword;

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}



	

	public User(int id, int active, String firstName, String lastName, String email, String password,
			Long contactNumber, String regDatetime, String regCode, String address, String cpassword) {
		super();
		this.id = id;
		this.active = active;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.contactNumber = contactNumber;
		this.regDatetime = regDatetime;
		this.regCode = regCode;
		this.address = address;
		this.cpassword = cpassword;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getRegDatetime() {
		return regDatetime;
	}

	public void setRegDatetime(String date) {
		this.regDatetime =  date;
	}

	

	public String getRegCode() {
		return regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
