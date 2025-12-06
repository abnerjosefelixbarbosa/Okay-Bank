package com.okay_bank.backend.infra.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
	private String id;
	private String cvv;
	private String number;
	private Date expirationDate;
	private Account account;
}