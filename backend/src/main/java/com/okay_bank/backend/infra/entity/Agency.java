package com.okay_bank.backend.infra.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "agency_tb")
public class Agency {
	@Id
	private String id;
	@Column(name = "number", nullable = false, unique = true, length = 5)
	private String number;
	@ManyToOne
	@JoinColumn(name = "bank_id", nullable = false)
	private Bank bank;
	@OneToMany(mappedBy = "agency", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	private List<Account> accounts;
}