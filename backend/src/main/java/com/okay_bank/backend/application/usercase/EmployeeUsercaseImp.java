package com.okay_bank.backend.application.usercase;

import org.springframework.stereotype.Component;

import com.okay_bank.backend.adapter.EmployeeGateway;
import com.okay_bank.backend.application.domain.Employee;
import com.okay_bank.backend.application.exception.BusinessException;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class EmployeeUsercaseImp implements EmployeeUsercase  {
	private final EmployeeGateway employeeGateway;
	
	public Employee registerEmployee(Employee employee) {
		if (existsByNameOrEmailOrPhone(employee)) {
			throw new BusinessException("Nome, email ou telefone não deve ser repetido.");
		}
		return employeeGateway.registerEmployee(employee);
	}
	
	private boolean existsByNameOrEmailOrPhone(Employee employee) {
		return employeeGateway.existsByNameOrEmailOrPhone(employee);
	}
}