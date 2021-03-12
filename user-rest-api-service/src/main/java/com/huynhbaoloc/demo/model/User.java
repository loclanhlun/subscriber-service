package com.huynhbaoloc.demo.model;

import javax.validation.constraints.NotBlank;

public class User {
	
	@NotBlank(message = "First name is mandatory")
	private String firstName;
	
	@NotBlank(message = "Middle name is mandatory")
	private String middleName;
	
	@NotBlank(message = "Last name is mandatory")
	private String lastName;
	
	@NotBlank(message = "Phone number is mandatory")
	private String phoneNumber;
	
	@NotBlank(message = "Email is mandatory")
	private String email;
	
	@NotBlank(message = "Current address is mandatory")
	private String currentAddress;
	
	private String company;
	
	@NotBlank(message = "Password is mandatory")
	private String password;

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
