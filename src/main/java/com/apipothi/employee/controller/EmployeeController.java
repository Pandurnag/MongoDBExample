package com.apipothi.employee.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apipothi.employee.MongoDbExampleApplication;
import com.apipothi.employee.request.EmployeeRequest;
import com.apipothi.employee.service.impl.EmployeeServiceimpl;

import ch.qos.logback.classic.Logger;

@RestController
public class EmployeeController {
	
	private final static Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	
	@Autowired
	EmployeeServiceimpl service;
	
	@PostMapping("/createemployeedata")
	public void createEmployeeData(@RequestBody EmployeeRequest request) {
		
		logger.info("START createemployeedata() request{}"+request);
		//TODDO we need to check the null for each field
		
		if(request!=null) {
			try {
				service.createEmployee(request);
			} catch (Exception e) {
		        //TODO: handle exception
			}
	}else {
		logger.error("Request can not be null")("START createemployeedata() request{}"+request);
	}
}
	@GetMapping("/getemployeedata")
	public void getEmployeeData() {
		
		service.getEmployee();
		
	}
	
	@GetMapping("getemployeedatabyid")
	public void getbyIDEmployeeData() {
		
		service.getbyIDEmployee();
		
	}
	
	@PutMapping("updateemployeedata")
	public void updateEmployeeData() {
		
		service.updateEmployee();
	}
	
	@DeleteMapping("deleteemployeedata")
	public void deleteEmployeeData() {
		
		service.deleteEmployee();
		
		
	}
	
	

}
