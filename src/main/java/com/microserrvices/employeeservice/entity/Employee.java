package com.microserrvices.employeeservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
	
	@Id
	private Long id;
	private String firstName;
	private String lastName;
	private String deptIdentifier;

}
