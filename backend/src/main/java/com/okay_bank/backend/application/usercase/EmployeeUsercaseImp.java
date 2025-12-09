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
		validateEmployee(employee);
		return employeeGateway.registerEmployee(employee);
	}
	
	private void validateEmployee(Employee employee) {
		if (employee.getSalary().scale() != 2) {
			throw new BusinessException("Salário deve ter 2 digitos.");
		}
		if (employee.getSalary().toString().equals("0.00")) {
			throw new BusinessException("Salário não deve ser 0.");
		}
		if (existsByNameOrEmailOrPhone(employee)) {
			throw new BusinessException("Nome, email ou telefone não deve ser repetido.");
		}
	}
	
	private boolean existsByNameOrEmailOrPhone(Employee employee) {
		return employeeGateway.existsByNameOrEmailOrPhone(employee);
	}
}