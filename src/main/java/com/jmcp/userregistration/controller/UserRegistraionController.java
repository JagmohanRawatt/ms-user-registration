package com.jmcp.userregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jmcp.userregistration.constant.Constants;
import com.jmcp.userregistration.model.db.UserDetails;
import com.jmcp.userregistration.service.UserRegistrationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RequestMapping("/jmcp/registration/")
@Api(produces = MediaType.APPLICATION_JSON_VALUE, tags = {
		"User Registration API's" }, value = "User Registraion API's")
@RestController
public class UserRegistraionController {
	@Autowired
	UserRegistrationService service;

	@PostMapping("/v1/userData")
	@ApiOperation("Save Data for Register the User")
	public ResponseEntity<String> saveUserData(
			@ApiParam(Constants.API_INFO_PARAM_SALUTATION) @RequestParam(value = "salutation") String salutation,
			@ApiParam(Constants.API_INFO_PARAM_FIRST_NAME) @RequestParam(value = "firstName") String firstName,
			@ApiParam(Constants.API_INFO_PARAM_MIDDLE_NAME) @RequestParam(value = "middleName") String middleName,
			@ApiParam(Constants.API_INFO_PARAM_LAST_NAME) @RequestParam(value = "lastName") String lastName,
			@ApiParam(Constants.API_INFO_PARAM_EMAIL) @RequestParam(value = "emailId") String emailId,
			@ApiParam(Constants.API_INFO_PARAM_MOB_NO) @RequestParam(value = "mobNo") Long mobNo) {

		UserDetails inputPayload = new UserDetails(salutation, firstName, middleName, lastName, emailId, mobNo);

		return ResponseEntity.ok(service.saveUserData(inputPayload));
	}

	@DeleteMapping("/v1/deleteUserData")
	@ApiOperation("Delete User Data..!")
	public ResponseEntity<String> deleteUserData(
			@ApiParam(Constants.API_INFO_PARAM_USERID) @RequestParam(value = "id") Long id) {
		return ResponseEntity.ok(service.deleteUserData(id));
	}

	@GetMapping("/v1/getUserById")
	@ApiOperation("Fetch user's data by Id..!")
	public ResponseEntity<UserDetails> getUserById(@ApiParam(Constants.API_INFO_PARAM_USERID) @RequestParam(value = "id") Long id) {
		return ResponseEntity.ok(service.getUserById(id));
	}
	
	
	
	@GetMapping("/v1/getAllUser")
	@ApiOperation("Fetch all user's data..!")
	public ResponseEntity<List<UserDetails>> getUserById() {
		return ResponseEntity.ok(service.getAllUsers());
	}
	@PutMapping("/v1/updateUserData")
	@ApiOperation("Updating User Data...!")
	public ResponseEntity<UserDetails> updateUserData(@ApiParam(Constants.API_INFO_PARAM_SALUTATION) @RequestParam(value = "salutation") String salutation,
			@ApiParam(Constants.API_INFO_PARAM_FIRST_NAME) @RequestParam(value = "firstName") String firstName,
			@ApiParam(Constants.API_INFO_PARAM_MIDDLE_NAME) @RequestParam(value = "middleName") String middleName,
			@ApiParam(Constants.API_INFO_PARAM_LAST_NAME) @RequestParam(value = "lastName") String lastName,
			@ApiParam(Constants.API_INFO_PARAM_EMAIL) @RequestParam(value = "emailId") String emailId,
			@ApiParam(Constants.API_INFO_PARAM_MOB_NO) @RequestParam(value = "mobNo") Long mobNo) {

		UserDetails inputPayload = new UserDetails(salutation, firstName, middleName, lastName, emailId, mobNo);
		return ResponseEntity.ok(service.updateUserData(inputPayload));
	}
}
