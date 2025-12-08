package com.okay_bank.backend.infra.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class AddressEntity {
	@Column(name = "address_zip_code", nullable = false, length = 15)
	private String zipCode;
	@Column(name = "address_name", nullable = false, length = 30)
	private String name;
	@Column(name = "address_distric", nullable = false, length = 30)
	private String district;
	@Column(name = "address_city", nullable = false, length = 30)
	private String city;
	@Column(name = "address_state", nullable = false, length = 30)
	private String state;
}