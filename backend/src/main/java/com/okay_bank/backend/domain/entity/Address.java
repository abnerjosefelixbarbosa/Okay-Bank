package com.okay_bank.backend.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	private String zipCode;
	private String name;
	private String district;
	private String city;
	private String state;
}