package com.okay_bank.backend.infra.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank {
	private String id;
	private String number;
	private List<Agency> agencies;
}