package com.huynhbaoloc.demo.security.service;

import java.util.Collection;
import java.util.Objects;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.huynhbaoloc.demo.model.User;

public class UserDetailsImpl implements UserDetails{
	
private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String email;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private String phoneNumber;
	
	private String currentAddress;
	
	private String company;
	
	@JsonIgnore
	private String password;
	
	public UserDetailsImpl(Long id,String firstName, String middleName,
			String lastName, String phoneNumber,
			String currentAddress, String email,
			String company,
			String password) {
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.currentAddress = currentAddress;
		this.email = email;
		this.company = company;
		this.password = password;
		
	}
	public static UserDetailsImpl build(User user) {
		return new UserDetailsImpl(
				user.getId(),
				user.getFirstName(),
				user.getMiddleName(),
				user.getLastName(),
				user.getPhoneNumber(),
				user.getCurrentAddress(),
				user.getEmail(),
				user.getCompany(),
				user.getPassword()
				);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Long getId() {
		return id;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserDetailsImpl user = (UserDetailsImpl) o;
		return Objects.equals(id, user.id);
	}

}
