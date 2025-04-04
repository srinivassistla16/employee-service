package com.microserrvices.employeeservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microserrvices.employeeservice.entity.Employee;
import com.microserrvices.employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public List<Employee> getEmployeesByDeptIdentifier(String deptIdentifier) {
		return employeeRepository.findAllByDeptIdentifier(deptIdentifier);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee addNewEmployee(Employee employee) {
		Employee newEmployee= employeeRepository.save(employee);
		return newEmployee;
	}

	@Override
	public Employee deleteEmployeeById(Long id) {
		Optional<Employee>  empToDelete = employeeRepository.findById(id);
		employeeRepository.delete(empToDelete.get());
		return empToDelete.get();
	}
	
	

}
