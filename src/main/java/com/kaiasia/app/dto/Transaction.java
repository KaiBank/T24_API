package com.kaiasia.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {
	private String transactionId;
	private String debitAccount;
	private String creditAccount;
	private String bankId;
	private String transAmount;
	private String transDesc;
	private String company;
	private String channel;
	private String benAccount;
	private String benName;
	private String username;
	private String newPassword;
}