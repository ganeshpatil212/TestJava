package com.myproj.pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class CreatePaymentResponce {

	String txnRef;
	String redirectUrl;
	String providerRef;
}
