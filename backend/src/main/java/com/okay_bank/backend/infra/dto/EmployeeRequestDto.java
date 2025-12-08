package com.okay_bank.backend.infra.dto;

import java.math.BigDecimal;

import com.okay_bank.backend.infra.entity.EmployeeEntityType;

public record EmployeeRequestDto(
		String name,
		String email,
		BigDecimal salary,
		String phone,
		EmployeeEntityType employeeType
) {}