package com.apipothi.employee.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Employeedetalis" )
public class EmployeeDetalis {
	
	@Id
	int employeeid;
	String employeename;
	int employeesalary;
	String employeemail;
	
	/**
	 * @return the employeeid
	 */
	public int getEmployeeid() {
		return employeeid;
	}
	/**
	 * @param employeeid the employeeid to set
	 */
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	/**
	 * @return the employeename
	 */
	public String getEmployeename() {
		return employeename;
	}
	/**
	 * @param employeename the employeename to set
	 */
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	/**
	 * @return the employeesalary
	 */
	public int getEmployeesalary() {
		return employeesalary;
	}
	/**
	 * @param employeesalary the employeesalary to set
	 */
	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}
	/**
	 * @return the employeemail
	 */
	public String getEmployeemail() {
		return employeemail;
	}
	/**
	 * @param employeemail the employeemail to set
	 */
	public void setEmployeemail(String employeemail) {
		this.employeemail = employeemail;
	}
	@Override
	public String toString() {
		return "EmployeeDetalis [employeeid=" + employeeid + ", employeename=" + employeename + ", employeesalary="
				+ employeesalary + ", employeemail=" + employeemail + "]";
	}
	
	

}
