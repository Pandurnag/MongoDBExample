package com.apipothi.employee.request;

public class EmployeeRequest {
	
	int employeeid;
	String employeename;
	int employeesalary;
	String employeemail;
	
	public EmployeeRequest() {
		
	}
	
	
	public EmployeeRequest(int employeeid, String employeename, int employeesalary, String employeemail) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeesalary = employeesalary;
		this.employeemail = employeemail;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public int getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}
	public String getEmployeemail() {
		return employeemail;
	}
	public void setEmployeemail(String employeemail) {
		this.employeemail = employeemail;
	}
	@Override
	public String toString() {
		return "EmployeeRequest [employeeid=" + employeeid + ", employeename=" + employeename + ", employeesalary="
				+ employeesalary + ", employeemail=" + employeemail + "]";
	}
	
	
	
	

}
