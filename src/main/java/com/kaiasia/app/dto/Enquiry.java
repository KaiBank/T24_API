package com.kaiasia.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Enquiry {
	private String username;
	private String password;
	private String customerId;
	private String accountId;
	private String transactionId;
	private String bankCode;
}