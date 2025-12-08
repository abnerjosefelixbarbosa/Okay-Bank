package com.okay_bank.backend.infra.mapper;

import com.okay_bank.backend.application.domain.Employee;
import com.okay_bank.backend.infra.dto.EmployeeRequestDto;
import com.okay_bank.backend.infra.dto.EmployeeResponseDto;
import com.okay_bank.backend.infra.entity.EmployeeEntity;

public interface EmployeeMapper {
	Employee mapToEmployee(EmployeeRequestDto dto);

	EmployeeResponseDto mapToDto(Employee employee);

	EmployeeEntity mapToEmployeeEntity(Employee employee);
}