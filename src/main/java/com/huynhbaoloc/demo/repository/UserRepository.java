package com.huynhbaoloc.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.huynhbaoloc.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	@Query("SELECT u from User u  WHERE u.email = ?1")
	Optional<User> findByEmail(String email);
	
	Boolean existsByEmail(String email);
}
