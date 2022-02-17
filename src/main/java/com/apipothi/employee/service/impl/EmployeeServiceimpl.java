package com.apipothi.employee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.apipothi.employee.model.EmployeeDetalis;
import com.apipothi.employee.request.EmployeeRequest;
import com.apipothi.employee.service.EmployeeService;
import com.apipothi.employee.service.dao.EmployeeDAO;

import ch.qos.logback.classic.Logger;

public class EmployeeServiceimpl implements EmployeeService {
	
	@Autowired
	EmployeeDAO dao;

	@Override
	public String createEmployee(EmployeeRequest request) {
		
		Logger.info("Startr - createEmployee{} Serviced Request{}"+request);
		
		String statusMsg="";
		EmployeeDetalis emp = new EmployeeDetalis();
		try {
			
			request.getEmployeeid();
			request.getEmployeename();
			request.getEmployeesalary();
			request.getEmployeemail();
			
			
			dao.insert(emp);
			statusMsg="Data Inserted Successfully ";
			
			
		}catch (Exception e) {

			statusMsg="Exception occured while inserting the Data Inserted Successfully ";

		}
		
		return statusMsg;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getbyIDEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		
	}

}
