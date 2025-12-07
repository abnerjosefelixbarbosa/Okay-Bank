package com.okay_bank.backend.infra.entity;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account_tb")
public class Account {
	@Id
	private String id;
	@Column(name = "password", nullable = false, unique = true, length = 6)
	private String password;
	@Column(name = "number", nullable = false, unique = true, length = 6)
	private String number;
	@Column(name = "amount", nullable = false, precision = 30, scale = 2)
	private BigDecimal amount;
	@ManyToOne
	@JoinColumn(name = "employee_id", nullable = false)
	private Employee employee;
	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;
	@ManyToOne
	@JoinColumn(name = "agency_id", nullable = false)
	private Agency agency;
	@OneToOne(mappedBy = "account", cascade = CascadeType.MERGE)
	private Card card;
}