package com.kaiasia.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankCode {
	private int id;
	private String bankCode;
	private String bankName;
	private String bankNameEn;
	private boolean status;
	private String branchOfBank;
	private String provide;
	private String napasId;
	private String province;
}

