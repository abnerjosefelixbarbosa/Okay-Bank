package com.okay_bank.backend.infra.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
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
@Table(name = "customer_tb")
public class CustomerEntity {
	@Id
	private String id;
	@Column(name = "name", nullable = false, unique = true, length = 100)
	private String name;
	@Column(name = "birth_date", nullable = false)
	private LocalDate birthDate;
	@Column(name = "email", nullable = false, unique = true, length = 50)
	private String email;
	@Column(name = "phone", nullable = false, unique = true, length = 30)
	private String phone;
	@Column(name = "password", nullable = false, unique = true, length = 8)
	private String password;
	@Column(name = "customer_type", nullable = false)
	private CustomerEntityType customerType;
	@Column(name = "document", nullable = false, unique = true, length = 14)
	private String document;
	@Embedded
	private AddressEntity address;
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY,  cascade = CascadeType.MERGE)
	private List<AccountEntity> accounts;
}