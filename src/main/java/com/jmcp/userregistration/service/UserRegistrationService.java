package com.jmcp.userregistration.service;

import java.util.List;

import com.jmcp.userregistration.model.db.UserDetails;


public interface UserRegistrationService {
	String saveUserData(UserDetails inputPayload);

	String deleteUserData(Long id);

	List<UserDetails> getAllUsers();

	UserDetails updateUserData(UserDetails details);

	UserDetails getUserById(Long id);
	

}
