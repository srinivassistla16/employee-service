package com.microserrvices.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microserrvices.employeeservice.entity.Employee;
import com.microserrvices.employeeservice.service.EmployeeServiceImpl;



@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	@GetMapping("/employee/{deptIdentifier}")
	public List<Employee> getEmployeesByDeptIdentifier(@PathVariable String deptIdentifier) {
		return employeeServiceImpl.getEmployeesByDeptIdentifier(deptIdentifier);
		//return ResponseEntity.ok().body(employeeServiceImpl.getEmployeesByDeptIdentifier(deptIdentifier));
		
	}
	
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		return ResponseEntity.ok().body(employeeServiceImpl.getAllEmployees());
	}

	
	@PostMapping("/newEmployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		Employee emp = employeeServiceImpl.addNewEmployee(employee);
		return ResponseEntity.ok(emp);
	}
	
	@DeleteMapping("/employee/{empId}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable Long empId) {
		return ResponseEntity.ok().body(employeeServiceImpl.deleteEmployeeById(empId));
	}


}
