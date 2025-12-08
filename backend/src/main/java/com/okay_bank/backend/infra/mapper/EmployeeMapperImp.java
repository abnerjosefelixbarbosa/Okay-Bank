package com.okay_bank.backend.infra.mapper;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.okay_bank.backend.application.domain.Employee;
import com.okay_bank.backend.application.domain.EmployeeType;
import com.okay_bank.backend.infra.dto.EmployeeRequestDto;
import com.okay_bank.backend.infra.dto.EmployeeResponseDto;
import com.okay_bank.backend.infra.entity.EmployeeEntity;
import com.okay_bank.backend.infra.entity.EmployeeEntityType;

@Component
public class EmployeeMapperImp implements EmployeeMapper {
	public Employee mapToEmployee(EmployeeRequestDto dto) {
		return new Employee(UUID.randomUUID().toString(), dto.name(), dto.email(), dto.salary(), dto.phone(), EmployeeType.valueOf(dto.employeeType().name()), null);
	}

	public EmployeeResponseDto mapToDto(Employee employee) {
		return new EmployeeResponseDto(employee.getId(), employee.getName(), employee.getEmail(), employee.getSalary(), employee.getPhone(), EmployeeEntityType.valueOf(employee.getEmployeeType().name()));
	}

	public EmployeeEntity mapToEmployeeEntity(Employee employee) {
		return new EmployeeEntity(employee.getId(), employee.getName(), employee.getEmail(), employee.getSalary(), employee.getPhone(), EmployeeEntityType.valueOf(employee.getEmployeeType().name()), null);
	}
}