package com.okay_bank.backend.infra.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer_tb")
public class Customer {
	@Id
	private String id;
	@Column(nullable = false, unique = true)
	private String name;
	private String email;
	private String phone;
	private String password;
	private CustomerType customerType;
	private String document;
	private Address address;
	private List<Account> accounts;
}