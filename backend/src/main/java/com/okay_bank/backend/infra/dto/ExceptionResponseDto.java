package com.okay_bank.backend.infra.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public record ExceptionResponseDto(
		@JsonFormat(pattern = "yyyy-MM-dd HH:ss")
		LocalDateTime localDateTime,
		Integer status,
		String message,
		String path
) {}