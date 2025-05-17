package com.kaiasia.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetLoginResponse {
	private String packageUser;
	private String phone;
	private String customerID;
	private String customerName;
	private String companyCode;
	private String username;
	private String firstLogin;
}