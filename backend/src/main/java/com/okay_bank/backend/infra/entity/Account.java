package com.okay_bank.backend.infra.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
	private String id;
	private String password;
	private String number;
	private BigDecimal amount;
	private Employee employee;
	private Customer customer;
	private Agency agency;
	private Card card;
}