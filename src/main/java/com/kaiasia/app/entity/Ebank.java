package com.kaiasia.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ebank {
	private String id;
	private String language;
	private String password;
	private Date passwordExpDate;
	private String coCode;
	private String userStatus;
	private String cifId;
	private String mainAcc;
	private String acctCoCode;
	private boolean isFirstLogin;
}