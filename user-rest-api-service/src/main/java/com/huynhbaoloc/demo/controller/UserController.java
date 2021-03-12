package com.huynhbaoloc.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.huynhbaoloc.demo.model.User;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private RestTemplate restTemplate;
	
//	@Autowired
//	private LoadBalancerClient loadBalancerClient;
	
	@PostMapping(value = "/signup")
	public ResponseEntity<User> signUp(@Valid @RequestBody User user){
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		final String url = "http://subscriber-service/api/signup";
		
		HttpEntity<User> httpEntity = new HttpEntity<User>(user,headers);
		User users = restTemplate.postForObject(url, httpEntity, User.class);
		return ResponseEntity.ok(users);
	}

}
