package com.okay_bank.backend.infra.entity;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_tb")
public class Employee {
	@Id
	private String id;
	@Column(nullable = false, unique = true, length = 100)
	private String name;
	@Column(nullable = false, unique = true, length = 50)
	private String email;
	@Column(nullable = false, scale = 2, precision = 30)
	private BigDecimal salary;
	@Column(nullable = false, unique = true, length = 30)
	private String phone;
	@Column(nullable = false)
	private EmployeeType employeeType;
	@OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	private List<Account> accounts;
}