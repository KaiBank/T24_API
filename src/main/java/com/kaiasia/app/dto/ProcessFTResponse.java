package com.kaiasia.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ms.apiclient.model.ApiError;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProcessFTResponse {
	private ApiError error;
	private String transactionNo;
}