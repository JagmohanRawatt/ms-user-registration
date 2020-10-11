package com.jmcp.userregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmcp.userregistration.model.db.UserDetails;
@Repository
public interface UserRegistraionRepository extends JpaRepository<UserDetails, Long>{
}
