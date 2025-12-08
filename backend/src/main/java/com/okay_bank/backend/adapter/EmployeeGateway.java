package com.okay_bank.backend.adapter;

import com.okay_bank.backend.application.domain.Employee;

public interface EmployeeGateway {
	Employee registerEmployee(Employee employee);
}