package com.kaiasia.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FundTransfer {
	private String id;
	private String transactionType;
	private String debitAcc;
	private String debitCcy;
	private BigDecimal debitAmt;
	private String creditAcc;
	private String creditCcy;
	private Date processDate;
	private String processDetail;
	private String coCode;
	private String benBank;
	private String benAccount;
	private String benName;
	private String channel;
	private String transactionId;
	private String status;
}