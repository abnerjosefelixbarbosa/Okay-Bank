package com.okay_bank.backend.infra.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.okay_bank.backend.application.domain.Employee;
import com.okay_bank.backend.application.usercase.EmployeeUsercase;
import com.okay_bank.backend.infra.dto.EmployeeRequestDto;
import com.okay_bank.backend.infra.dto.EmployeeResponseDto;
import com.okay_bank.backend.infra.mapper.EmployeeMapper;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/employees")
@AllArgsConstructor
public class EmployeeController {
	private final EmployeeUsercase employeeUsercase;
	private final EmployeeMapper employeeMapper;
	
	@PostMapping(value = "/register-employee")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<EmployeeResponseDto> registerEmployee(@RequestBody @Valid EmployeeRequestDto dto) {
		Employee employee = employeeUsercase.registerEmployee(employeeMapper.mapToEmployee(dto));
		return ResponseEntity.status(HttpStatus.CREATED).body(employeeMapper.mapToDto(employee));
	}
}