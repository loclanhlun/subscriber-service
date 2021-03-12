package com.huynhbaoloc.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huynhbaoloc.demo.model.User;
import com.huynhbaoloc.demo.payload.request.LoginRequest;
import com.huynhbaoloc.demo.payload.request.SignUpRequest;
import com.huynhbaoloc.demo.payload.response.JwtResponse;
import com.huynhbaoloc.demo.payload.response.MessageResponse;
import com.huynhbaoloc.demo.repository.UserRepository;
import com.huynhbaoloc.demo.security.jwt.JwtUtils;
import com.huynhbaoloc.demo.security.service.UserDetailsImpl;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder encoder;

	@Autowired
	private JwtUtils jwtUtils;
	
	
	@PostMapping(value = "/signin")
	public ResponseEntity<?> signIn(@Valid @RequestBody LoginRequest loginRequest){
		Authentication authentication = authenticationManager.authenticate(
								new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtUtils.generateJwtToken(authentication);
		UserDetailsImpl userDetailsImpl = (UserDetailsImpl) authentication.getPrincipal();
		return ResponseEntity.ok(new JwtResponse(jwt,
				userDetailsImpl.getId(),
				userDetailsImpl.getFirstName(),
				userDetailsImpl.getMiddleName(),
				userDetailsImpl.getLastName(),
				userDetailsImpl.getPhoneNumber(),
				userDetailsImpl.getCurrentAddress(),
				userDetailsImpl.getCompany(),
				userDetailsImpl.getEmail()
				));
	}
	
	@PostMapping(value = "/signup")
	public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {
		if (userRepository.existsByEmail(signUpRequest.getEmail())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Error: Username is already taken!"));
		}
		// Create new user's account
		User user = new User(signUpRequest.getFirstName(), 
				signUpRequest.getMiddleName(),
				signUpRequest.getLastName(),
				signUpRequest.getPhoneNumber(),
				signUpRequest.getEmail(),
				signUpRequest.getCurrentAddress(),
				signUpRequest.getCompany(),
				encoder.encode(signUpRequest.getPassword()));

		userRepository.save(user);

		return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
	}


}
