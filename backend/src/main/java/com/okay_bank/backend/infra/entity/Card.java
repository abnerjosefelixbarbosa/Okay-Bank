package com.okay_bank.backend.infra.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "card_tb")
public class Card {
	@Id
	private String id;
	@Column(name = "cvv", nullable = false, unique = true, length = 3)
	private String cvv;
	@Column(name = "number", nullable = false, unique = true, length = 16)
	private String number;
	@Column(name = "expiration_date", nullable = false)
	private LocalDate expirationDate;
	@OneToOne
	@JoinColumn(name = "account_id", nullable = false, unique = true)
	private Account account;
}