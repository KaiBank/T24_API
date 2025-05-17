package com.kaiasia.app.dto;

import com.kaiasia.app.entity.Customer;
import com.kaiasia.app.entity.Ebank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EbankUserResponse {
	private String customerId;
	private String customerType;
	private String name;
	private String company;
	private String phone;
	private String email;
	private String mainAccount;
	private String language;
	private String pwDate;
	private String userStatus;
}