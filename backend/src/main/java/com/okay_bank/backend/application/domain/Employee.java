package com.okay_bank.backend.application.domain;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private String id;
	private String name;
	private String email;
	private BigDecimal salary;
	private String phone;
	private EmployeeType employeeType;
	private List<Account> accounts;
}