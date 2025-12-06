package com.okay_bank.backend.domain.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	private String id;
	private String name;
	private String email;
	private String phone;
	private String password;
	private CustomerType customerType;
	private String document;
	private Address address;
	private List<Account> accounts;
}