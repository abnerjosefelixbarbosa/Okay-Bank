package com.okay_bank.backend.infra.entity;

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
@Table(name = "bank_tb")
public class BankEntity {
	@Id
	private String id;
	@Column(name = "number", nullable = false, unique = true, length = 4)
	private String number;
	@OneToMany(mappedBy = "bank", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	private List<AgencyEntity> agencies;
}