package com.okay_bank.backend.infra.service;

import org.springframework.stereotype.Service;

import com.okay_bank.backend.adapter.EmployeeGateway;
import com.okay_bank.backend.application.domain.Employee;
import com.okay_bank.backend.infra.entity.EmployeeEntity;
import com.okay_bank.backend.infra.mapper.EmployeeMapper;
import com.okay_bank.backend.infra.repository.EmployeeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService implements EmployeeGateway {
	private final EmployeeRepository employeeRepository;
	private final EmployeeMapper employeeMapper;
	
	public Employee registerEmployee(Employee employee) {
		EmployeeEntity entity = employeeRepository.save(employeeMapper.mapToEmployeeEntity(employee));
		return employeeMapper.mapToEmployee(entity);
	}
	
	public Boolean existsByNameOrEmailOrPhone(Employee employee) {
		return employeeRepository.existsByNameOrEmailOrPhone(employee.getName(), employee.getEmail(), employee.getPhone());
	}
}