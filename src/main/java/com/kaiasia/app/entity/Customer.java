package com.kaiasia.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	private String id;
	private String cifName;
	private String legalId;
	private String cifStatus;
	private String language;
	private String coCode;
	private String phone;
	private String email;
	private String country;
	private String address;
	private String legalDocName;
	private Date legalExpDate;
	private String customerType;
}