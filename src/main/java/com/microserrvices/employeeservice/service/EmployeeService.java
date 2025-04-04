package com.microserrvices.employeeservice.service;

import java.util.List;

import com.microserrvices.employeeservice.entity.Employee;

public interface EmployeeService {
	
	public abstract List<Employee> getEmployeesByDeptIdentifier(String deptIdentifier);
	
	public abstract List<Employee> getAllEmployees();
	
	public abstract Employee addNewEmployee(Employee employee);
	
	public abstract Employee deleteEmployeeById(Long id);

}
