package com.jmcp.userregistration.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmcp.userregistration.model.db.UserDetails;
import com.jmcp.userregistration.repository.UserRegistraionRepository;
import com.jmcp.userregistration.service.UserRegistrationService;

@Service
@Transactional
public class UserRegistrationServiceImpl implements UserRegistrationService {
	@Autowired
	UserRegistraionRepository repository;

	@Override
	public String saveUserData(UserDetails inputPayload) {
		repository.save(inputPayload);
		return "Saved Successfully...!";
	}

	@Override
	public String deleteUserData(Long id) {
		repository.deleteById(id);
		return "User Deteted Successfully...!";
	}

	@Override
	public List<UserDetails> getAllUsers() {

		return repository.findAll();
	}

	@Override
	public UserDetails updateUserData(UserDetails details) {
		Optional<UserDetails> user = repository.findById(details.getId());
		if (user.get().getId() == details.getId()) {
			return repository.save(details);
		}
		return null;
	}

	@Override
	public UserDetails getUserById(Long id) {
		Optional<UserDetails> user=repository.findById(id);
		return user.get();
	}
	

}
