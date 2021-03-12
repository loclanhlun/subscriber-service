package com.huynhbaoloc.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "fisrtname")
	@NotBlank(message = "First name is mandatory")
	private String firstName;
	
	@Column(name = "middlename")
	@NotBlank(message = "Middle name is mandatory")
	private String middleName;
	
	@Column(name = "lastname")
	@NotBlank(message = "Last name is mandatory")
	private String lastName;
	
	
	
	@Column(name = "phonenumber")
	@NotBlank(message = "Phone number is mandatory")
	private String phoneNumber;
	
	@Column(name = "email")
	@NotBlank(message = "Email is mandatory")
	private String email;
	
	@Column(name = "currentaddress")
	@NotBlank(message = "Current address is mandatory")
	private String currentAddress;
	
	@Column(name = "company")
	private String company;
	
	@Column(name = "password")
	@NotBlank(message = "Password is mandatory")
	private String password;
	
	

	public User() {
	}

	public User( @NotBlank(message = "First name is mandatory") String firstName,
			@NotBlank(message = "Middle name is mandatory") String middleName,
			@NotBlank(message = "Last name is mandatory") String lastName,
			@NotBlank(message = "Phone number is mandatory") String phoneNumber,
			@NotBlank(message = "Email is mandatory") String email,
			@NotBlank(message = "Current address is mandatory") String currentAddress, String company,
			@NotBlank(message = "Password is mandatory") String password) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.currentAddress = currentAddress;
		this.company = company;
		this.password = password;
	}



	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
