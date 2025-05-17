package com.kaiasia.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	private String accId;
	private String altAcc;
	private String cifId;
	private String category;
	private String accountTitle;
	private String ccy;
	private String coCode;
	private BigDecimal balance;
	private String accountStatus;
	private String productCode;
}