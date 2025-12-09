package com.okay_bank.backend.infra.dto;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.Length;

import com.okay_bank.backend.infra.entity.EmployeeEntityType;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record EmployeeRequestDto(
		@NotNull(message = "Nome não deve ser nulo.")
		@NotEmpty(message = "Nome não deve ser vazio.")
		@Length(max = 100, message = "Nome deve ter no máximo 100 caracteres.")
		String name,
		@NotBlank(message = "Email não deve esta em branco.")
		@Length(max = 50, message = "Email deve ter no máximo 50 caracteres.")
		@Email(message = "Email deve ser valido.")
		String email,
		@NotNull(message = "Salario não deve ser nulo.")
		BigDecimal salary,
		@NotBlank(message = "Telefone não deve esta em branco.")
		@Length(max = 30, message = "Telefone deve ter no máximo 30 caracteres.")
		String phone,
		@NotNull(message = "Tipo de funcionário não deve ser nulo.")
		EmployeeEntityType employeeType
) {}