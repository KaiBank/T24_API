package com.kaiasia.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.kaiasia.app.entity.Account;
import com.kaiasia.app.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountResponse {
	private String customerId;
	private String accountType;
	private String shortName;
	private String currency;
	private String accountId;
	private String altAccount;
	private String category;
	private String company;
	private String productCode;
	private String accountStatus;
	private String shortTitle;
	private String avaiBalance;
}