package com.huynhbaoloc.demo.payload.response;

public class JwtResponse {
	private String token;

	private String type = "Bearer";

	private Long id;
	private String firstName;
	private String middelName;
	private String lastName;
	private String phoneNumber;
	private String currentAddress;
	private String company;
	private String email;

	
	
	public JwtResponse(String token, Long id, String firstName, String middelName, String lastName,
			String phoneNumber, String currentAddress, String company, String email) {
		super();
		this.token = token;
		
		this.id = id;
		this.firstName = firstName;
		this.middelName = middelName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.currentAddress = currentAddress;
		this.company = company;
		this.email = email;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddelName() {
		return middelName;
	}
	public void setMiddelName(String middelName) {
		this.middelName = middelName;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	

	

	
}
