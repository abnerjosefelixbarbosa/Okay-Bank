package com.okay_bank.backend.application.usercase;

import org.springframework.stereotype.Component;

import com.okay_bank.backend.adapter.EmployeeGateway;
import com.okay_bank.backend.application.domain.Employee;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class EmployeeUsercaseImp implements EmployeeUsercase  {
	private final EmployeeGateway employeeGateway;
	
	public Employee registerEmployee(Employee employee) {
		return employeeGateway.registerEmployee(employee);
	}
}