package com.jmcp.userregistration.repository.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jmcp.userregistration.model.db.UserDetails;

@Repository
public class UserRegistrationRepositoryImpl {
	@Autowired
	EntityManager entityManager;
	
	public String saveUserData(UserDetails inputPayload) {
		entityManager.getEntityManagerFactory().createEntityManager();
		return "User Registered Successfully......!";
	}

	

}
