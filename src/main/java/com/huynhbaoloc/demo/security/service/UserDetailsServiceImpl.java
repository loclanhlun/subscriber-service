package com.huynhbaoloc.demo.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huynhbaoloc.demo.model.User;
import com.huynhbaoloc.demo.repository.UserRepository;
@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(email).orElseThrow(() -> 
		new UsernameNotFoundException("User not found with email: " + email));
		return UserDetailsImpl.build(user);
	}
	
	public UserDetails loadUserByEmail(String email) throws UsernameNotFoundException{
		User user = userRepository.findByEmail(email).orElseThrow(() -> 
		new UsernameNotFoundException("User not found with email: " + email));
		return UserDetailsImpl.build(user);
	}

}
